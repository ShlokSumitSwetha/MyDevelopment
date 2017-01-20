package Model;



import java.sql.Timestamp;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.Type;

import OneToMany.OneshotCcTrans;

public class main {
	public static void main(String[] args) {
		
	
	 Configuration cg= new Configuration();
     cg.configure("/Model/hibernate.cfg.xml");
     SessionFactory sf= cg.buildSessionFactory();
     Session session=sf.openSession();
     Transaction transaction= session.beginTransaction();
     Timestamp d1;
     Date d =new Date("12/05/1986");
    
     
     try {
         transaction = session.beginTransaction();
         OneshotCcTrans ot = new OneshotCcTrans();
         //ot.setOctSettleInd('N');
         
         
         // ***********SQLQuery**********************
         String sqlquery = "select * from BCCSC02_OWNER.APP_PROPS_INFO";
         
         List crit=session.createSQLQuery(sqlquery).list();
         System.out.println("li query"+crit.size()+crit);         
         Object app1=crit.get(0);     	
     	 System.out.println("props name"+app1);
         
         // **************** create query *********************
         String query="from AppPropsInfo a ";
         List results = session.createQuery(query).list();
         System.out.println("create query "+results.size()+results);
         
         // **************** Criteria *********************
         List critresult=session.createCriteria(AppPropsInfoId.class).list();
         System.out.println(" criteria Value"+critresult.size()+critresult);
       
        
        	
        
         //BatchEventLog bel= new BatchEventLog();
         /*bel.setEventName("event name");
         bel.setEventSeqNumber(124);
         bel.setEventStatus("suC");
         bel.setRecordCount(2);
         bel.setEventEndTimeStamp(d);
         bel.setEventStartTimeStamp(d);
         session.save(bel);*/
          
         /*String belRecordCount = "4";	
         String query1 = "Select b from BatchEventLog b where b.recordCount=?";	
         Type types[] = { StandardBasicTypes.STRING };
         Object values[] = { belRecordCount };
 			
 			Query hibernateQuery = session.createQuery(query1);
 			hibernateQuery.setParameter(0, values[0], types[0]);
 			List results = hibernateQuery.list();
 			System.out.println("List value"+results.get(0));
 			bel = (BatchEventLog)results.get(0);
 			System.out.println("Bel Seq Nbr"+bel.getEventSeqNumber());
 			
 			bel.setEventStatus("SYS");
 			session.update(bel);*/
         
 			/*BatchEventLog batEv = new BatchEventLog();
 			batEv.setEventName("eventname1");
 			batEv.setEventSeqNumber(null);
 			batEv.setEventStatus("Smt");
 			batEv.setRecordCount(3);
 			batEv.setEventEndTimeStamp(d);
 			batEv.setEventStartTimeStamp(d);
 	        // based on ID it chooses either to do save or update the record 
 			// if id is empty then it insert by generating the sequence
 			// if id is not empty it updates the record
 			session.saveOrUpdate(batEv);*/
 	         
 			
         /*BatchFile bf=new BatchFile();
         bf.setEventSeqNumber(124);
         bf.setFileName("FileName");
         bf.setFileType("zip");
         bf.setFileDate(d);
         session.save(bf);
         
        CreditCardAuth ccauth=new CreditCardAuth();
         ccauth.setAuthSeqNumber(1238);
         ccauth.setAuthAmount(1000);
         ccauth.setAuthTypeCode("suc");
         ccauth.setCreatedDate(d);
         ccauth.setResponseDesc("suc");
         ccauth.setRsponseCode("suc");
         ccauth.setCcAuthCode("suc");
       
         Set setauth= new HashSet();		
         setauth.add(ccauth);
        
         CreditCardInfo cci=new CreditCardInfo();
         cci.setCityName("hyd");
         cci.setFirstName("sumit");
         cci.setCardDataStatusCode("sum");
         cci.setCardSeqNumber(11);
         cci.setCreatedDate(d);
         cci.setLastAuthDate(d);
         cci.setAppID("sum1");
         cci.setCardDataStatusCode("sum");
         cci.setCardExpDate(d);
         cci.setCardTypeDesc("Desc");
         cci.setZipCode("zip");
         cci.setMiddleName("k");
         cci.setLastActivityTypeCode("ac");
         cci.setQuoteNumber("quote");
         cci.setLineTwoAddr("line");
         cci.setLineOneAddr("lioneone");
         cci.setModifiedDate(d);
         cci.setPolicyNumber("qwre");
         cci.setSecureTokenID("secure");         
         cci.setLastSettleDate(d);
         cci.setCreditcardauth(setauth);
       
      
         Set set= new HashSet();		
 		 set.add(cci);
 		
         
         SecureDataVault sdv=new SecureDataVault();
        
         sdv.setAppID("6");
         sdv.setCreatedDate(d);
         sdv.setCreatedUserID("Three");
         sdv.setKeyID("key2");
         sdv.setPurgeDate(d);
         sdv.setSecureDataTxt("sec2");
         sdv.setSecureTokenID("123");
         sdv.setVaultSeqNumber(1236);
         sdv.setCreditcardInfo(set);*/
        // session.save(sdv);       
         
      
         
         /*UpdateAddress address=new UpdateAddress();
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
        
        
         session.update(employee);   */            
         transaction.commit();
         
         
         System.out.println("Update successfully!");
         
     } catch (HibernateException e) {
         transaction.rollback();
         e.printStackTrace();
     } finally {
    	
         session.close();
     }

}
}