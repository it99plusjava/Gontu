 package com.gontu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {


	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model1 = new ModelAndView("AdmissionForm");
		model1.addObject("headerMessage","Gontu college of engineering, Inddia");

		return model1;
	}
	
	
	@ModelAttribute
	public void addingCommentsObject(Model model1)  {
		model1.addAttribute("headerMessage","Gontu College of Engineering, India");
	}
	
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1)  {
		
		ModelAndView model1 = new ModelAndView("AdmissionSuccess");   // "AdmissionSuccess" is the View Nam
		model1.addObject("headerMessage","Gontu College of Engineering, India");
		
		return model1;
	}
	
}

