package HibernateManager;


import java.io.Serializable;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

/**
 * Super class for all Hibernate Access Mappers
 * 
 * <br> Add utility methods to this class as and when needed.
 * 
 * Created AbstractDataAccessObject.java 
 * @author Niraj Juneja (nzjuneja@kanbay.com)
 * 
 * Revision History:
 * ------------------------------------------------------------------------------------------------------
 * Author                	Date                   Modifications
 * ------------------------------------------------------------------------------------------------------
 * Niraj Juneja 			??				Created
 * Unnikrishnan Dineshan	May 21, 2009	Hibernate upgrade to 3.3.1
 * 											Modified imports and removed hibernate finder methods since 
 * 											they are deprecated in version Hibernate version 3.3.1
 * 											Formatted code, added javadoc comments
 * 											Filtered hibernate queries for all removing {,} since hibernate
 * 											new version seems not to accept it
 * ------------------------------------------------------------------------------------------------------
 */
public class AbstractDataAccessObject {

	

	/**
	 * This method returns Hibernate session object
	 * 
	 * @return Session
	 */
	public Session session() {
		return HibernateManager.currentSession();
	}

	/**
	 * Retrieves a <code>List</code> of <code>Object</code>s from the database.
	 * 
	 * @param String query - Hibernate query string which is used to execute against database
	 * @param String value - the value that is inserted into the query.  May be null
	 *			 if the desired query does not take a parameter.
	 * @return List will be null if no objects are retrieved
	 */
	public List getObjs(String query, String value) {
		List results = null;

		try {
			Session session = session();
			Query hibernateQuery = session.createQuery(filterBraces(query));
			if (value != null) hibernateQuery.setParameter(0, value, Hibernate.STRING);
			results = hibernateQuery.list();

//			FIND IS DEPRECATED IN NEW VERSION OF HIBERNATE			
//			if (value != null) {
//				results = (List) session.find(query, value, Hibernate.STRING);				
//			} else {
//				results = (List) session.find(query);
//			}			
		} catch (HibernateException he) {
			he.printStackTrace();
		//	log.error("exception ::" + he.getMessage());
			//throw new DAOException(he);
		}

		return results;
	}

	/**
	 * Method getObj
	 * 
	 * @param clazz
	 * @param ser
	 * @return Object
	 */
	public Object getObj(Class clazz, Serializable ser) {
		Object obj = null;
		try {
			Session session = session();
			obj = session.load(clazz, ser);

		} catch (HibernateException he) {
			he.printStackTrace();
		//	throw new DAOException(he);
		}

		return obj;
	}

	/**
	 * Retrieves a <code>List</code> of <code>Object</code>s from the database.
	 * if the desired query does not take a parameter.
	 * 
	 * @param String query - Hibernate query string which is used to execute against database
	 * @param values - value array for all parameters in the query
	 * @param type - hibernate types array for all parameters in the query
	 * @return List will be null if no objects are retrieved
	 */
	public List getObjs(String query, Object values[], Type types[]) {
		List results = null;
		try {
			Session session = session();
			Query hibernateQuery = session.createQuery(filterBraces(query));
			if (values != null) {
				int i = 0;
				for (Object value: values) {
					hibernateQuery.setParameter(i, value, types[i++]);
				}
			}
			results = hibernateQuery.list();
			
//			FIND IS DEPRECATED IN NEW VERSION OF HIBERNATE				
//			if (values != null) {
//				results = (List) session.find(query, values, types);
//			} else {
//				results = (List) session.find(query);
//			}
		} catch (HibernateException he) {
			he.printStackTrace();
			//log.error("exception ::" + he.getMessage());
			//throw new DAOException(he);
		}
		//--removed by Nasir-- log.debug("results" + results);
		return results;
	}
	
	/**
	 * Returns a limited list of objects. This helps reduce
	 * memory overhead for tables which contain large data,
	 * like xml text.
	 * 
	 * @param query HQL query string
	 * @param param parameter to set in the query
	 * @param offset start of read
	 * @param maxRows max rows to read
	 * @return list of objects limited to pageSize
	 * 
	 * @author patails
	 * 06/05/2009
	 */
	public List getObjs(String query, String param, int offset, int maxRows) {
		List results = null;
		try {
			Query q = session().createQuery(query);
			q.setString(0, param);
			q.setFirstResult(offset);
			q.setMaxResults(maxRows);
			results = q.list();	
		} catch(HibernateException he) {
			he.printStackTrace();
			//log.error("exception ::" + he.getMessage());
			//throw new DAOException(he);
		}
		
		return results;
	}

	/**
	 * This method Stores <code>obj</code>, making it persistent.
	 * 
	 * @param BusinessObject obj
	 */
/*	public void saveObj(BusinessObject obj) {
		try {
			Session session = session();
			//log.debug("Giving call to interceptor now from saveObj");
			session.saveOrUpdate(obj);
		} catch (HibernateException he) {
			he.printStackTrace();
			//throw new DAOException(he);
		}
	}*/
	
	/**
	 * Create a named Query object for the given Session and the given query name.
	 * Applies a transaction timeout, if any.
	 * @param queryName the name of the query in the Hibernate mapping file
	 * @return the Query object
	 */
	public Query getNamedQuery(String queryName) {
		Query queryObject = null;
		try {
			queryObject = session().getNamedQuery(queryName);
			queryObject.setTimeout(5000);
		} catch (HibernateException he) {
			//throw new DAOException(he);
		}
		return queryObject;
	}

	/**
	 * Stores <code>obj</code>, making it persistent.
	 * 
	 * @param BusinessObject obj
	 */
	/*public void updateObj(BusinessObject obj) {
		try {
			Session session = session();
			log.debug("Giving call to interceptor now from updateObj");
			session.update(obj);
		} catch (HibernateException he) {
			he.printStackTrace();
			throw new DAOException(he);
		}
	}*/
	
	/**
	 * Removes the object from the database with with specified class
	 * type and <code>id</code>.
	 * 
	 * @param BusinessObject bo
	 */
/*	public void removeObj(BusinessObject bo) {
		try {
			Session session = session();
			// the object must be loaded in this session before it
			//  is deleted.
			session.delete(bo);
		} catch (Exception e) {
			//throw new DAOException(e);
		}
	}*/
	
	/**
	 * Retrieves and <code>Object</code> of the class type specified
	 * by <code>c</code>, and having the given <code>id</code>.
	 * 
	 * @param c the class to load
	 * @param id
	 * @return Object may be null if object with ID doesn't exist
	 */
	public Object getObj(Class c, Long id) {
		Object obj = null;
		try {
			Session session = session();
			obj = session.load(c, id);
		} catch (HibernateException he) {
			he.printStackTrace();
			//throw new DAOException(he);
		}
		return obj;
	}	
	
	/**
	 * This method replace any { or } from the given string 
	 * 
	 * @param queryString
	 * @return String modifiedString with all curly braces replaced
	 */
	public static String filterBraces(String queryString){
		String modifiedString = "";
		Pattern pattern = Pattern.compile("[{}]");
		Matcher matcher = pattern.matcher(queryString);
		modifiedString = matcher.replaceAll("");
		return modifiedString;
	}
	public void findNoticeOfChangeLookUpByRoutingNum(String trackNumber) {

		//logger.info("Entering getLatestDebitInfo()");

		//NoticeOfChangeLookUp detail = null;
		// Create type array
		Type types[] = { StandardBasicTypes.STRING ,StandardBasicTypes.STRING};
		// Create values array
		Object values[] = { trackNumber };
		// Construct a query and fire it.
		List details = getObjs("select d from NoticeOfChangeLookUp d where  d.bankRoutingNum = ?",
				values,	types);

		if (details == null || details.isEmpty() || (details.get(0) == null)) {
			//logger.debug("Latest AutoPay Details not found for trkNbr:" + trackNumber);			
			
		} else {
			//detail = (NoticeOfChangeLookUp) details.get(0);
		}

		
		

	}
}
