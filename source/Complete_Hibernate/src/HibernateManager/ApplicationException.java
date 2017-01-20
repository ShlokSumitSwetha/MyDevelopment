package HibernateManager;



import org.apache.commons.lang.exception.NestableRuntimeException;

/**
 * Purpose:  Action marks the accounts corrupt that are included in the 
 * Header
 * 
 * FileName : CorruptAccount.java 
 * @author Niraj Juneja (nzjuneja@kanbay.com)
 *
 * Revision History:
 * Author                	Date-Time                 		Modifications
 * ---------------------------------------------------------------------
 * dysonavane 	 			Jan 19, 2004 - 4:41:30 PM			   Now extends NestableRuntimeException
 * ---------------------------------------------------------------------
 */

public class ApplicationException extends NestableRuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IErrorMsg _err;

	/**
	 * @see java.lang.Object#Object()
	 */
	public ApplicationException() {
		super();
	}

	/**
	 * @see java.lang.Throwable#Throwable(String)
	 */
	public ApplicationException(String str) {
		super(str);
	}

	/**
	 * @see org.apache.commons.lang.exception.NestableRuntimeException#NestableRuntimeException(Throwable)
	 */
	public ApplicationException(Throwable th) {
		super(th);
	}

	/**
	 * Method ApplicationException.
	 * @param err
	 * @param th
	 */
	public ApplicationException(IErrorMsg err, Throwable th) {
		super(err.getMessage(), th);
		this._err = err;
	}

	/**
	 * Method ApplicationException.
	 * @param th
	 * @param str
	 */
	public ApplicationException(Throwable th, String str) {
		super(str, th);
	}

	/**
	 * Method getErrorMsg.
	 * @return IErrorMsg
	 */
	public IErrorMsg getErrorMsg() {
		return _err;
	}

	/**
	 * Method ApplicationException.
	 * @param err
	 */
	public ApplicationException(IErrorMsg err) {
		super(err.getMessage());
		this._err = err;
	}

}
