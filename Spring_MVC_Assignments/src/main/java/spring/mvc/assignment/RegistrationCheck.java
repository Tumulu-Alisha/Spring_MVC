package spring.mvc.assignment;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationCheck {
	
	
	@RequestMapping(value="/login3",method=RequestMethod.GET)
	public ModelAndView Registration()
	{
		
		ModelAndView model=new ModelAndView("registration");
		
		
		return model;
		
		
	}
	
	

	@RequestMapping(value="/login3",method=RequestMethod.POST)
	public ModelAndView Registration2( @Valid @ModelAttribute("customer1")Customer customer1,BindingResult result)
	{
		      if(result.hasErrors())
		      {
		    	  ModelAndView model=new ModelAndView("registration");
		  		
		  		
		  		return model;
		    	  
		    	  
		      }
		
		
		ModelAndView model=new ModelAndView("registrationsuccess");
		
		
		return model;
		
		
	}

}
