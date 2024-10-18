package com.docEase;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.docEase.Dao.UserDataRepository;
import com.docEase.Dao.UserRepository;
import com.docEase.entities.Patient;
import com.docEase.entities.User;

@SpringBootApplication
public class DocEaseApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(DocEaseApplication.class, args);
     	UserDataRepository userrepo=context.getBean(UserDataRepository.class);
//		
//		Patient p1=new Patient("Pooja","pooja@gmail.com","pooja1234");
//		Patient p2=new Patient("murmu","murmu@gmail.com","murmu1234");
//		Patient p3=new Patient("geeta","geeta@gmail.com","geeta1234");
//		Patient p4=new Patient("mayank","mayank@gmail.com","mayank1234");
//		
//		List<Patient> ls=List.of(p2,p3,p4);
//		
//	    Iterable<Patient> presult= userrepo.saveAll(ls);
//	    
//	    presult.forEach(patient->{
//	    	System.out.println(patient);
//	    });
		
//		User user=new User("pooja","2342","jsahgj","21748","jhgfugw","india","piasfjah","sajgf","sfsf");
//		
//		User result = userrepo.save(user);
//		 
		
	}

}
