package HibernateManager;



//import org.apache.log4j.Logger;
import org.hibernate.EmptyInterceptor;




/**
 * This class is an application-defined custom interceptors for Hibernate call backs. The
 * class extends from EmptyInterceptor which implements Interceptor 
 * 
 * Revision History:
 * -------------------------------------------------------------------------------------
 * Author                	Date                   Modifications
 * -------------------------------------------------------------------------------------
 * sgkulkarni	 			??				Created
 * 
 * Unnikrishnan Dineshan	May 21, 2009	
 * 
 * 		1. Hibernate upgrade to 3.3.1. Modified Hibernate imports to match version 3.3.1. 
 * 		2. Updated implements Interceptor to extends EmptyInterceptor since it can avoid unnecessary method implementations
 * 		3. Removed onDelete, onLoad, onSave, onFlushDirty, preFlush, postFlush and findDirty methods since they  
 * 			are same as their default implementation in EmptyInterceptor
 * 		4. Removed public Object instantiate(Class clazz, Serializable id) method since the method is modified as 
 * 			public Object instantiate(String entityName, EntityMode entityMode, Serializable id) in version 3.3.1
 * 			as compared to version 2.1.1 and the default implementation of later is available in EmptyInterceptor
 * 		5. Updated isUnsaved method to isTransient since the name	of the method is updated in Interceptor interface 
 * 			on Hibernate version 3.3.1 as compared to version 2.1.1
 * 		6. Organized imports to remove unwanted imports 		
 * -------------------------------------------------------------------------------------
 */
public class HibernateInterceptor extends EmptyInterceptor {
	
	private static final long serialVersionUID = 1L;
	//private static Logger log = Framework.logger(HibernateInterceptor.class);

	/**
	 * @see org.hibernate.Interceptor#isUnsaved(java.lang.Object)
	 */
	/*public Boolean isTransient(Object entity) {
		//log.debug("Invoking isTransient method on HibernateInterceptor with entity " 
			//	+ (entity == null? "NULL" : entity));
		if (((BusinessObject) entity).isSaved()) {
			//log.debug("Updating the Business Object");
			return Boolean.FALSE;
		} else {
			//log.debug("Saving the Business Object");
			return Boolean.TRUE;
		}
	}*/
}
