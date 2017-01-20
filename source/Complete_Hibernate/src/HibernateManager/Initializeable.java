package HibernateManager;
/**
 * Class Initializeable.java Created on Dec 12, 2003
 * @author Niraj Juneja (nzjuneja@kanbay.com)
 * 
 * <br> <b>The implementor of this interface is guranteed the following </b>
 * <br>1. The Object will be initialised when the Framework starts up
 * <br>2. The sequence of intialisation is controlled by properties file
 * <br> <br> For the Initialisation to take place the following needs to be done by the implmentor </b>
 * <br> 1. Register the interface in the properties file  INIT_FILE
 * <br> 2. indicate the sequence of initialzation in the INIT_FILE
 * <br> 3. The Implentor of this interface should be a singleton object. with the method 
 * public static {Interface/Class} Instance()
 * <br> the {Interface/Class}  should be inhiretied from or implemter of Initializeable interface
 *
 */
public interface Initializeable {

	/**
	 * Class Initializeable.java Created on Dec 22, 2003
	 * @author Niraj Juneja (nzjuneja@kanbay.com)
	 * 
	 */

	public static final String INIT_FILE =
		"resources/properties/system.properties";

	/**
	 * The argument  Framework.KEY is provided for security reasons :
	 * <br> 1. Only the Framework class controls the lifecycle of Initilisable objects 
	 * <br> 2. As Framework.KEY is private and can be constructed only in Framework .Only the Framework
	 *     class  will be able to call and control the Initializeable objects
	 **/
	public void init(Framework.KEY key) throws Exception;

		
	
	/**
	 * Method start.
	 * @param key
	 * @throws Exception
	 */
	public void start(Framework.KEY key) throws Exception;
	/**
	 * Method stop.
	 * @param key
	 * @throws Exception
	 */
	public void stop(Framework.KEY key) throws Exception;

}
