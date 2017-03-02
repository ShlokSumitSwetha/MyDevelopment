package CompositeKey;
import java.util.List;

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
		
		
		
		User user1=new User();
		user1.setDepartment("Associate Consultant");
		user1.setUsername("sumit");
		
		
		User user2=(User)session.load(User.class, user1);
		System.out.println("values in composite table are:"+user2.getUsername()+user2.getDepartment());
		
		tx.commit();
		session.close();
		
		
	}

}
