package HibernateManager;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;




/**
 * This Class basically has the smarts to figure out which intigration mapper to return based on the System .
 * <br> Priority is as follows
 * <br> if Specific System Mapper found then return that mapper
 * <br> else return Default Mapper
 * <br> if not mapper found then throw ApplicationException
 * 
 * 
 * @author Niraj Juneja (nzjuneja@kanbay.com)
 * 
 */
public class IntegrationMapperHolder {
	
	private Map  _integrationMappers = new HashMap();
	private  String _interfaceClass;
	
	
	/**
	 * Method getMapper.
	 * @return IIntegrationMapper
	 */
	/*public IIntegrationMapper getMapper(){
		
		Context context = ContextManager.instance().currentContext();
		String system = context.getSystem();
		//IIntegrationMapper mapper = (IIntegrationMapper)_integrationMappers.get(system);
		if(mapper == null)
		    throw new ApplicationException("No Integration Mapper defined for " + _interfaceClass  );    
		     
		return mapper;
	}*/
	
	/**
	 * Method put.
	 * @param key
	 * @param mapper
	 */
	public void put(String key, IIntegrationMapper mapper) {
		this._integrationMappers.put(key,mapper);
	}
	
	/**
	 * Returns the interfaceClass.
	 * @return String
	 */
	public String getInterfaceClass() {
		return _interfaceClass;
	}

	/**
	 * Sets the interfaceClass.
	 * @param interfaceClass The interfaceClass to set
	 */
	public void setInterfaceClass(String interfaceClass) {
		this._interfaceClass = interfaceClass;
	}
	
	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String str = "";
		str += "interface =  " + this._interfaceClass;

		Set keySet = _integrationMappers.keySet();
		for (Iterator iter = keySet.iterator(); iter.hasNext();) {
			String key = (String) iter.next();
			str += "\t"+key+" = "+_integrationMappers.get(key);			
		}
		return str;
	}

}
