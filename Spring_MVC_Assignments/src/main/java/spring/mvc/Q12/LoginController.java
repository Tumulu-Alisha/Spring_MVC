package spring.mvc.Q12;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.mvc.assignmentQ.Recognation;

@Controller
public class LoginController {
	
	@Autowired
   Recognation service;
	
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String SayHello()
	{
		return "login";	
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String SayHello2(@RequestParam String name,@RequestParam String accountNo , @RequestParam Long moneySend , ModelMap model) throws Exception{
	  
		
		  long actualbalance=5000; 
		  Recognation d=new Recognation();
 
		  boolean navin1=d.RecongnationUser(name, accountNo);
		
	       if(navin1==true)
	       {
		            if(moneySend>=actualbalance)
		           {  
			  
			          throw new ArithmeticException("Insufficient balance");	  
			  
		           }
	       }
	       else if(navin1==false)
	       {
                   return "accountnotfound";
	    	   
           }
	    	           		
		return "welcome";	
		 		 
	}
	

	



}
