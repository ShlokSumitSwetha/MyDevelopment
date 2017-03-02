package HibernateManager;



import javax.naming.InitialContext;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


/**
 * Class HibernateManager.java Created on Dec 13, 2003
 * @author Niraj Juneja (nzjuneja@kanbay.com)
 * 
 * Revision History:
 * -------------------------------------------------------------------------------------
 * Author                	Date                   Modifications
 * -------------------------------------------------------------------------------------
 * Niraj Juneja 			Dec 13, 2003	Created
 * Unnikrishnan Dineshan	May 21, 2009	Hibernate upgrade to 3.3.1. Modified Hibernate 
 * 											imports to match version 3.3.1
 * -------------------------------------------------------------------------------------
 */
public final class HibernateManager implements Initializeable {

	//private static Logger log = Framework.logger(HibernateManager.class);
	private static HibernateManager self = new HibernateManager();
	private static SessionFactory sessionFactory = null;
	@SuppressWarnings("unused")
	private InitialContext _context;
	private static final ThreadLocal<Session> SESSION = new ThreadLocal<Session>();
	private static HibernateInterceptor interceptor =
		new HibernateInterceptor();

	/**
	 * Method instance.
	 * @return HibernateManager
	 */
	public static HibernateManager instance() {
		return self;
	}

	private HibernateManager() {
		super();
	}

	/**
	 * @see com.insurance21.framework.Initializeable#init(KEY)
	 */
	public void init(Framework.KEY key) throws Exception {
		//log.info("Trying to init the Hibernate Manager");
		_context = new InitialContext();
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
	}

	/**
	 * @see com.insurance21.framework.Initializeable#start(KEY)
	 */
	public void start(Framework.KEY key) throws Exception {
	}

	/**
	 * @see com.insurance21.framework.Initializeable#stop(KEY)
	 */
	public void stop(Framework.KEY key) throws Exception {
	}

	/**
	 * Method returns Hibernate Session associated with current thread.
	 * @return Session
	 * @throws ApplicationException
	 */
	@SuppressWarnings("deprecation")
	public static Session currentSession() throws ApplicationException {

		Session s = (Session) SESSION.get();
		// open a new Session , if this Thread has not yet
		if (s == null) {
			try {
				s = sessionFactory.openSession(interceptor);
				SESSION.set(s);
			} catch (HibernateException ex) {
				//log.error("Could not get current Session for Hibernate ", ex);
				throw new ApplicationException(ex);
			}
		} else {
			if(! s.isConnected()){
			try{			
				s.reconnect();
			} catch(HibernateException ex){
				throw new ApplicationException(ex);
			}
			}
		}
		return s;
	}

	/**
	 * Closes the session associated with the current thread
	 * Method closeSession. - Dnyanesh
	 * @throws ApplicationException
	 */
	public static void closeSession() throws ApplicationException {

		Session s = (Session) SESSION.get();

		if (s != null) {
			try {
				s.close();
			} catch (Exception e) {
				//log.warn("Unable to Close the session");
			} finally {
				//Though cant close the connection ensure we remove
				//it from Thread local
				SESSION.set(null);
			}
		}
	}

}
