package HibernateManager;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;



/**
 * Class Framework.java Created on Dec 10, 2003
 * @author Niraj Juneja (nzjuneja@kanbay.com)
 * 
 */
public final class Framework {

	//Logger instance
	//private static Logger cat = Framework.logger(Framework.class);
	private static Framework self = new Framework();
	private static final String SYSTEM_PROPERTIES =
		"resources/properties/system.properties";
	private static Framework.KEY key;
	private static volatile boolean running = false;
	private Properties _sysProp = new Properties();

	private List _subSystems = new ArrayList();

	/**
	 * Returns instance of this class
	 */
	public static Framework instance() {
		return self;
	}

	private Framework() {
		super();
		key = new Framework.KEY();

		configureLog();

		loadSystemProperties();
	}

	/**
	 * Method initSubSystems.
	 * @throws Exception
	 */
	public void initSubSystems() throws Exception {
		if (this.running) {
			//cat.error("The Framework is already running Cannot init again");
			throw new ApplicationException();
		}

		/*Properties prop = Framework.getProperties(Constants.INIT_CFG);
		List list =
			PropertyResolver.resolveSequencedProperties(
				prop,
				Constants.INIT_KEY,
				50);*/
		List list=new LinkedList();//dummy 
		try {

			for (int i = 0; i < list.size(); i++) {

				Initializeable system =
					this.loadSubSystem(((String) list.get(i)).trim());
				//cat.info("Trying to initialise " + system.getClass().getName());
				system.init(key);
				_subSystems.add(system);
				//cat.info("initialise SUCCESS " + system.getClass().getName());
			}

		} catch (Exception e) {
			//cat.error("Error ", e);
		}

	}

	/**
	 * Method isRunning.
	 * @return boolean
	 */
	public boolean isRunning() {
		return this.running;
	}

	/**
	 * Method startSubSystems.
	 * @throws Exception
	 */
	public void startSubSystems() throws Exception {

		//cat.info("@@@ DNA public void startSubSystems()");

		if (this.running) {
			//cat.error("The Framework is already running Cannot start again");
			throw new ApplicationException();
		}

		for (int i = 0; i < this._subSystems.size(); i++) {

			Initializeable system = (Initializeable) this._subSystems.get(i);
			//cat.info("Trying to start " + system.getClass().getName());
			system.start(key);
			//cat.info("Start SUCCESS " + system.getClass().getName());
		}

		this.running = true;

	}

	/**
	 * Method stopSubSystems.
	 * @throws Exception
	 */
	public void stopSubSystems() throws Exception {
		if (!this.running) {
		//	cat.error("The Framework is Not Running Cannot stop it");
			throw new ApplicationException();
		}

		for (int i = 0; i < this._subSystems.size(); i++) {

			Initializeable system = (Initializeable) this._subSystems.get(i);
			//cat.info("Trying to Stop " + system.getClass().getName());
			system.stop(key);
			//cat.info("STOP SUCCESS " + system.getClass().getName());
		}

		this.running = false;

	}

	/**
	 * @throws Exception
	 */
	private Initializeable loadSubSystem(String className) throws Exception {
		//cat.info(" Trying to Load " + className);
		Class system = Class.forName(className);
		Method[] met = system.getMethods();
		for (int i = 0; i < met.length; i++) {
			String name = met[i].getName();
			int modifier = met[i].getModifiers();
			Class retClass = met[i].getReturnType();
			if (Modifier.isPublic(modifier)
				&& Modifier.isStatic(modifier)
				&& name.equalsIgnoreCase("instance")
				&& retClass.isAssignableFrom(system)) {
				//cat.info("Method found " + met[i]);
				Initializeable subsystem =
					(Initializeable) met[i].invoke(null, null);
				//cat.info(" Sub System Created  " + className.toString());
				return subsystem;
			}
		}
		//cat.error("No Instance Method found in Class " + className);
		//cat.error("Looking for : public static [Initializeable] Instance()");
		throw new ApplicationException();

	}

	private void loadSystemProperties() {
		Properties prop = null;
		try {
			prop = Framework.getProperties(this.SYSTEM_PROPERTIES);
		} catch (Exception ex) {
			//cat.warn("resources/properties/system.properties not found ", ex);
			return;
		}
		try {
			this._sysProp.putAll(prop);
		} catch (Exception ex) {
			//cat.error("The System properties could not be set", ex);
			//cat.error(
				//" The following properties are not available to system "
				//	+ prop.toString());
		}

	}

	/**
	 * Setup log4j appenders according to the property file.
	 */
	private void configureLog() {
		String keyName = "Constants.LOG_FILE_CFG";
		InputStream is = Framework.getResourceAsStream(keyName);
		Properties props = new Properties();
		try {
			props.load(is);
		//	PropertyConfigurator propsC = new PropertyConfigurator();
			//propsC.configure(props);
			System.out.println(" Properties loaded " + props);
		} catch (Throwable ex) {
			System.err.println("******************************************");
			System.err.println(
				" Error : could not load properties  for Logging ");
			System.err.println(" Exception " + ex.getMessage());
			System.err.println("******************************************");
		}
		//cat.info(" Framework : version " + key.getVersion());
		//cat.info(
			//" Framework : Release Date "
			/*	+ key.getLastRelease().get(Calendar.YEAR)
				+ " : year "
				+ key.getLastRelease().get(Calendar.MONTH)
				+ ": month "
				+ key.getLastRelease().get(Calendar.DATE)
				+ "  : Day");*/
		//cat.info(
			//" Framework : Start Time stamp " + key.getRightNow().toString());
	}

	/**
	 * Returns a Logger instance for the <code>Class</code> object
	 */
	/*public static Logger logger(Class cls) {

		String name = cls.getName();
		return Logger.getLogger(name);
	}*/

	/**
	 * Method logger.
	 * @param name
	 * @return Logger
	 */
	/*public static Logger logger(String name) {

		return Logger.getLogger(name);
	}*/

	/**
	 * Method getSystemProperty.
	 * @param key
	 * @return String
	 */
	public String getSystemProperty(String key1) {
		return _sysProp.getProperty(key1);
	}

	/**
	 * Method getProperties.
	 * @param resourceFileKey
	 * @return Properties
	 */
	public static Properties getProperties(String resourceFileKey) {
		Properties prop = new Properties();
		InputStream is = getResourceAsStream(resourceFileKey);
		try {
			prop.load(is);
			is.close();
		} catch (IOException ioe) {
			//cat.error("Error while loading the properties", ioe);
			throw new ApplicationException();
		}
		return prop;
	}

	/**
	 * Method getResourceAsStream.
	 * @param url
	 * @return InputStream
	 */
	public static InputStream getResourceAsStream(String url) {
		return Framework.class.getClassLoader().getResourceAsStream(url);
	}

	/**
	 * Method getResourceAsReader.
	 * @param url
	 * @return Reader
	 */
	public static Reader getResourceAsReader(String url) {
		InputStreamReader reader =
			new InputStreamReader(
				Framework.class.getClassLoader().getResourceAsStream(url));

		return reader;
	}

	/**
	 * Method lmark.
	 * @param cat
	 * @param m1
	 */
	/*public final void lmark(Logger cat1, String m1) {
		lmark(cat1, m1, null, null, null, null);
	}*/

	/**
	 * Method lmark.
	 * @param cat1
	 * @param m1
	 * @param m2
	 */
	/*public final void lmark(Logger cat1, String m1, String m2) {
		lmark(cat1, m1, m2, null, null, null);
	}*/

	/**
	 * Method lmark.
	 * @param cat1
	 * @param m1
	 * @param m2
	 * @param m3
	 */
	/*public final void lmark(Logger cat1, String m1, String m2, String m3) {
		lmark(cat1, m1, m2, m3, null, null);
	}*/

	/**
	 * Method lmark.
	 * @param cat1
	 * @param m1
	 * @param m2
	 * @param m3
	 * @param m4
	 */
	public final void lmark(
		//Logger cat1,
		String m1,
		String m2,
		String m3,
		String m4) {
		//lmark(cat1, m1, m2, m3, m4, null);
	}

	/**
	 * Method lmark.
	 * @param cat1
	 * @param m1
	 * @param m2
	 * @param m3
	 * @param m4
	 * @param m5
	 */
	public final void lmark(
		//Logger cat1,
		String m1,
		String m2,
		String m3,
		String m4,
		String m5) {
		/*if (cat1.isInfoEnabled() == false) {
			return;
		}*/

		Thread thd = (Thread) Thread.currentThread();
		StringBuffer buf = new StringBuffer();
		buf.append("T=").append(thd.getName()).append(", LANDMARK: ").append(
			m1);

		if (m2 != null)
			buf.append(m2);
		if (m3 != null)
			buf.append(m3);
		if (m4 != null)
			buf.append(m4);
		if (m5 != null)
			buf.append(m5);

		//cat1.info(buf);
	}

	/**
		 * Purpose:  KEY
		 * 
		 * FileName : Framework.java 
		 * @author dysonavane 
		 *
		 * Revision History:
		 * Author                	Date-Time                 		Modifications
		 * ---------------------------------------------------------------------
		 * dysonavane 	 			Feb 7, 2004 - 4:03:59 PM			   Created
		 * ---------------------------------------------------------------------
		 */
	public final class KEY {
		private String secureKey;


		/**
		 * default constructor.
		 */
		private KEY() {
			
			try
			{
			
				Properties props =
					Framework.getProperties("resources/properties/application.properties");
				
				String encrSecureKey = props.getProperty("framework.secure.key");
				
				if(encrSecureKey != null)
				{
					//This decryption is an exceptional case and is using single DES instead of Triple DES
					//Decryptor decryptor = new Decryptor(Constants.DES_KEY_FILE);				
					//secureKey = decryptor.decrypt(encrSecureKey, Decryptor.DES_ENCRYPTION_TYPE);
				}//if{}
			}//try{}
			catch(Exception e)
			{
				//cat.debug("Framework SECURE key not found. Proceeding with initialization...");
			}
		}

		/**
		 * Method getVersion.
		 * @return String
		 */
		public String getVersion() {
			return "0.5";
		}

		/**
		 * Method getRightNow.
		 * @return Calendar
		 */
		public Calendar getRightNow() {
			return Calendar.getInstance();
		}

		/**
		 * Method getLastRelease.
		 * @return Calendar
		 */
		public Calendar getLastRelease() {
			Calendar cal = Calendar.getInstance();
			cal.set(2003, 12, 14);
			return cal;

		}

		private String getSecureKey() {
			return secureKey;
		}

		/**
		 * @param string
		 */
		private void setSecureKey(String string) {
			secureKey = string;
		}

	};

	/**
	 * Validates the key 
	 * @param secureKey
	 * @return true if the key is valid
	 */
	public static boolean isKeyValid(Object secureKey) {
		if (secureKey instanceof String) {
			String clientKey = (String) secureKey;
			if (key.getSecureKey().equals(clientKey)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Method key.
	 * @return KEY
	 */
	public Framework.KEY key() {
		return Framework.key;
	}
}
