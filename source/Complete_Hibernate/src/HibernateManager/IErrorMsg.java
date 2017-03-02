package HibernateManager;

import java.io.Serializable;

/**
 * Purpose:  Defines Error Data
 * 
 * FileName : IErrorMsg.java 
 * @author Niraj Juneja (nzjuneja@kanbay.com)
 *
 * Revision History:
 * Author                	Date-Time                 		Modifications
 * ---------------------------------------------------------------------
 * dysonavane 	 			Dec 12, 2003				   Created
 * ---------------------------------------------------------------------
 */
public interface IErrorMsg extends Serializable {

	/**
	 * Method getId.
	 * @return int
	 */
	public int getId();
	/**
	 * Method getMessage.
	 * @return String
	 */
	public String getMessage();
	/**
	 * Method addText.
	 * @param str
	 * @return IErrorMsg
	 */
	public IErrorMsg addText(String str);

}
