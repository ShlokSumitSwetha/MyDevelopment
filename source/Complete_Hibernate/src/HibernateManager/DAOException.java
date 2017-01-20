package HibernateManager;




/**
 * Purpose:  <Add Purpose Here>
 * 
 * FileName : DAOException.java 
 * @author dysonavane 
 *
 * Revision History:
 * Author                	Date-Time                 		Modifications
 * ---------------------------------------------------------------------
 * dysonavane 	 			Jan 19, 2004 - 4:20:10 PM			   Created
 * ---------------------------------------------------------------------
 */
public class DAOException extends ApplicationException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor for DAOException.
	 */
	public DAOException() {
		super();
	}

	/**
	 * Constructor for DAOException.
	 * @param str
	 */
	public DAOException(String str) {
		super(str);
	}

	/**
	 * Constructor for DAOException.
	 * @param th
	 */
	public DAOException(Throwable th) {
		super(th);
	}

	/**
	 * Constructor for DAOException.
	 * @param err
	 * @param th
	 */
	public DAOException(IErrorMsg err, Throwable th) {
		super(err, th);
	}

	/**
	 * Constructor for DAOException.
	 * @param th
	 * @param str
	 */
	public DAOException(Throwable th, String str) {
		super(th, str);
	}

	/**
	 * Constructor for DAOException.
	 * @param err
	 */
	public DAOException(IErrorMsg err) {
		super(err);
	}

}
