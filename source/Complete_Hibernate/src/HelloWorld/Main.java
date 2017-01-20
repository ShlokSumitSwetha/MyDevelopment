package HelloWorld;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
public static void main(String[] args) {
	
	Configuration configuration=new Configuration();
	configuration.configure("/HelloWorld/HibernateDerby.cfg.xml");	
	SessionFactory sessionFactory=configuration.buildSessionFactory(); // creating session factory
	Session session=sessionFactory.openSession(); // opening the session
	Transaction tx= session.beginTransaction();
	
	//setting values into hello object
	HelloPojo hello=new HelloPojo();
	hello.setEmpName("sumit");
	hello.setCompany("Capgemini");
	
	// persisting the hello object
	session.save(hello);
	
	tx.commit();
	session.close();//closing the session
	System.out.println("Inserted the row successfully");
	
	
}
}
