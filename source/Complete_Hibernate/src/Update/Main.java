package Update;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		
	
	 Configuration cg= new Configuration();
     cg.configure("/hibernate.cfg.xml");
     SessionFactory sf= cg.buildSessionFactory();
     Session session=sf.openSession();
     Transaction transaction= session.beginTransaction();
     try {
         transaction = session.beginTransaction();
        
         
         UpdateAddress address=new UpdateAddress();
         address.setEmpid(1);
         address.setPinno(506002);
         address.setCity("Hyderabad");
         address.setState("AP");
         address.setId(1);
         address.setStreet("SR");
         
         // insertion of data here
         EmployeeUpdate employee1 = new EmployeeUpdate();
         employee1.setEmpName("Jivan444Dhara");
         employee1.setEmpno(20001);
         employee1.setAddress(address);
         transaction.commit();
         System.out.println("Inserted successfully!");
         
         //updating the data
         EmployeeUpdate employee = (EmployeeUpdate)session.get(EmployeeUpdate.class, new Long(1));
         employee.setEmpName("Jivan Dhara");
         employee.setEmpno(20000);
         employee.setAddress(address);       
        
        
         session.update(employee);               
         transaction.commit();
         session.close();
         System.out.println("Update successfully!");
         
     } catch (HibernateException e) {
         transaction.rollback();
         e.printStackTrace();
     } finally {
         session.close();
     }

}
}