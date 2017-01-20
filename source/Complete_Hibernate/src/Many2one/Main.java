package Many2one;
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
		
		Employeem21 employee=new Employeem21();
		//employee.setEmpno(1214);
		employee.setEmpName("Sri Krishna");
		
		Addressm21 address=new Addressm21(); 
		address.setCity("sec");		
		address.setPinno(506002);
		address.setState("AP");
		address.setStreet("krihsna ");
		
		address.setEmployee(employee);
		
		Addressm21 address2=new Addressm21(); 
		address2.setCity("sec");		
		address2.setPinno(506005);
		address2.setState("AP");
		address2.setStreet("krihsna 2");		
		address2.setEmployee(employee);
		
		session.save(address);
		session.save(address2);
		
		
	
		
		
		
		
		
		
		//session.flush();
		
		tx.commit();
		session.close();
		
		
	}

}
