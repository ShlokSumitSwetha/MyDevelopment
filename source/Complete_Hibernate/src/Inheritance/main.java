package Inheritance;


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




public class main {
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("/OneToOne/HibernateDerby.cfg.xml");
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx= session.beginTransaction();
		
		Engineering eng=new Engineering();
		//eng.setCollegecode(888);
		eng.setCollegeName("Jayamukhi");
		eng.setEEE("Electrical");
		eng.setECE("electronics");
		eng.setCSE("computer");
		
		session.save(eng);
		
		Medicine med=new Medicine();
		//med.setCollegecode(880);
		med.setCollegeName("Jayamukhi");
		med.setMbbs("doctor");
		med.setDentist("teeth");
		session.save(med);
		
			
		tx.commit();
		session.close();
		
		
	}

}
