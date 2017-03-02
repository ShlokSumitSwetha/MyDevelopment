package HibernateManager;



import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Pattern;

import org.hibernate.connection.DatasourceConnectionProvider;



/**
 * ConnectionProvider implementation that changes the default transaction isolation
 * level settings for the connection to TRANSACTION_READ_COMMITTED. 
 * 
 * Extends the original DatasourceConnectionProvider class by Lari Hotari 
 *
 * FileName: HibernateConnectionProvider.java  
 *
 * Revision History:
 * -------------------------------------------------------------------------------------
 * Author                	Date                   Modifications
 * -------------------------------------------------------------------------------------
 * Lari Hotari	 			Jan 25, 2005	Created
 * Unnikrishnan Dineshan	May 21, 2009	Hibernate upgrade to 3.3.1. Modified Hibernate 
 * 										imports to match version 3.3.1. 
 * -------------------------------------------------------------------------------------
 */
public class HibernateConnectionProvider extends DatasourceConnectionProvider {

	//private static Logger logger = Framework.logger(HibernateConnectionProvider.class);

	/**
	 * Retrieves database connection
	 * 
	 * @return Connection
	 * @throws SQLException
	 */
	public Connection getConnection() throws SQLException {
		Connection conn = super.getConnection();
		Pattern pattern = Pattern.compile("[{}]");
		if (conn.getTransactionIsolation()!= Connection.TRANSACTION_READ_COMMITTED) {
			conn.setTransactionIsolation(Connection.TRANSACTION_READ_COMMITTED);
		}
		
		/*logger.debug("-- HibernateConnectionProvider.getConnection::" + System.identityHashCode(conn)
				+ " - Isolation::" + conn.getTransactionIsolation());
*/
		return conn;
	}
	
	/**
	 * This method closes the specified database connection
	 * 
	 * @param conn
	 * @throws SQLException
	 */
	public void closeConnection(Connection conn) throws SQLException {
		super.closeConnection(conn);
		
		//logger.debug("-- HibernateConnectionProvider closeConnection = " + System.identityHashCode(conn));
	}
}