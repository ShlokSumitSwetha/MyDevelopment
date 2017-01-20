package One2Many;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;




public class Main {
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("/OneToOne/HibernateDerby.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		
		
		Address12m address=new Address12m(); 
		address.setCity("sec");		
		address.setPinno(506002);
		address.setState("AP");
		address.setStreet("krihsna ");
		
		
		
		Set set=new HashSet();
		set.add(address);
		
		Employee12m employee=new Employee12m();
		
		employee.setEmpName("Sri Krishna");
		employee.setAddress(set);	
		
		
		session.save(employee);
		//session.flush();
		
		tx.commit();
		session.close();
		
		
	}

}
