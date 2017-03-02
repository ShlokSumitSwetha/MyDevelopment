package OneToOne;
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
		
		
		Address address=new Address(); 
		address.setCity("hyd");		
		address.setPinno(506002);
		address.setState("AP");
		address.setStreet("J.P.N Road");
		address.setId("13");
		
		Employee employee=new Employee();
		employee.setEmpno("12");
		employee.setEmpName("sumit");
		employee.setAddress(address);
		
		
		
		
		session.save(employee);
		session.flush();
		
		// Retrieving the objects using Create Query
		List dataList=session.createQuery("e.name ,e.date from Employee e").list();
		System.out.println("list values from query "+dataList);
		
		for(int i=0;i<dataList.size();i++)
		{
			Employee e=(Employee)dataList.get(i);
			System.out.println("values in list name:"+e.getEmpName()+"eno:"+e.getEmpno());
		}
		
		
		/*// Retrieving the objects using LOAD 
		Employee e=(Employee)session.load(Employee.class, "333");
		System.out.println("values in list using load"+e.getEmpName()+e.getEmpno());
		
		// Retrieving the objects using GET
		
		Employee e1=(Employee)session.get(Employee.class, "333");
		System.out.println("values in list using get "+e1.getEmpName()+e1.getEmpno());*/
		
      /*  // Retrieving the Objects using Criterion
		List critlist =session.createCriteria(Employee.class).add(Restrictions.like("empno", "3%")).list();
		System.out.println("list from criteria"+critlist);
		for(int i=0;i<critlist.size();i++)
		{
			Employee ecrit=(Employee)dataList.get(i);
			System.out.println("values in list ename:"+ecrit.getEmpName()+"eno"+ecrit.getEmpno());
		}*/
		
		tx.commit();
		session.close();
		
		
	}

}
