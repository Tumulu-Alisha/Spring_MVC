package mvc1of1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
 
	@RequestMapping(value="/AdmissionForm.html", method= RequestMethod.GET)
	public ModelAndView getAdmissionForm () {
		 
		ModelAndView model =new ModelAndView("AdmissionForm");
		return model;
	}
		
		@RequestMapping(value="/submitAdmissionForm.html", method= RequestMethod.POST)
		public ModelAndView submitAdmissionForm (@RequestParam("studentName") String name, @RequestParam("studentClass") String Class) {
			 
			ModelAndView model =new ModelAndView("AdmissionSuccess");
			model.addObject("msg","Details Submitted by you are:: Name:"+ name+ ", Class:" + Class);
			return model;
	}
	
}
