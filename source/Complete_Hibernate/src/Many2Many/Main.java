package Many2Many;
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
		
		Monkey monkey=new Monkey();
		Monkey monkey2=new Monkey();
		Human human=new Human();
		
		Set<Monkey> set= new HashSet<Monkey>();
		set.add(monkey);
		set.add(monkey2);
		
		Set<Human> set2= new HashSet<Human>();
		set2.add(human);
		 
		
		//human.setHumanid(1206);
		human.setHumanname("sumit1");
		human.setMonkeys(set);
		
		//monkey.setMonkeyid(606);
		monkey.setMonkeyname("madhu1");
		monkey.setHumans(set2);
		
		monkey2.setMonkeyname("madhu2");
		monkey2.setHumans(set2);
		session.save(human);
		
		//session.flush();		
		tx.commit();
		session.close();
		
		
	}

}
