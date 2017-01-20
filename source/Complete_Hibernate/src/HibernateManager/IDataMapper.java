package HibernateManager;



//import com.insurance21.framework.service.BusinessObject;

/**
 * Class IDataMapper.java Created on Dec 13, 2003
 * @author Niraj Juneja (nzjuneja@kanbay.com)
 * 
 */
public interface IDataMapper {
		
	/** 
	 * Create the Object in DB
	 * 
	 * @param bo business object to create 
	 * 
     * @author Abhijeet Gijare
     * 
	 * Revision History:
	 * -----------------------------------------------------------------------------------------
	 * Modified by    		             Comments                    Date/Time
	 * -----------------------------------------------------------------------------------------
	 * Abhijeet Gijarse 		   		     Created					 01-10-2004
	 * -----------------------------------------------------------------------------------------
	 */
	//public void saveObj(BusinessObject bo); 
	/** 
	 * Create the Object in DB
	 * 
	 * @param bo business object to create 
	 * 
	 * @author Abhijeet Gijare
	 * 
	 * Revision History:
	 * -----------------------------------------------------------------------------------------
	 * Modified by    		             Comments                    Date/Time
	 * -----------------------------------------------------------------------------------------
	 * Abhijeet Gijarse 		   		     Created					 01-10-2004
	 * -----------------------------------------------------------------------------------------
	 */
	//public void updateObj(BusinessObject bo); 
	
	/** 
	 * Remove the Object in DB
	 * 
	 * @param bo business object to remove 
	 * 
     * @author Abhijeet Gijare
     * 
	 * Revision History:
	 * -----------------------------------------------------------------------------------------
	 * Modified by    		             Comments                    Date/Time
	 * -----------------------------------------------------------------------------------------
	 * Abhijeet Gijare 		   		     Created					 01-10-2004
	 * -----------------------------------------------------------------------------------------
	 */
	//public void removeObj(BusinessObject bo ); 
	
	/**
	 * Method getObj.
	 * @param c
	 * @param id
	 * @return Object
	 */
	public Object getObj(Class c, Long id);	
}
