package bridge_pattern2;

public class DatabasePersistenceImplementor implements PersistenceImplementor{

	public DatabasePersistenceImplementor() {
	
		// load database driver
		
		
	}
	
	@Override
	public void deleteObject(long objectId) {

		// open database connection
		// remove record
		
	}

	@Override
	public Object getObject(long objectId) {

		// open database connection 
		// read records
		// create object from record 
		return null;
	}

	@Override
	public long saveObject(Object object) {

		// open database connection 
		// create records for fields inside the object

		return 0;
	}

}
