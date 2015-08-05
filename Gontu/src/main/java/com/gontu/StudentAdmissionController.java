 package com.gontu;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {


	@RequestMapping(value="/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {

		ModelAndView model = new ModelAndView("AdmissionForm");

		return model;
	}

	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("studentName") String name,
											@ModelAttribute("studentHobby") String hobby) {
		
		Student student1 = new Student();
		student1.setStudentName(name);
		student1.setStudentHobby(hobby);

		ModelAndView model = new ModelAndView("AdmissionSuccess");
		model.addObject("headerMessage","Gontu College of Engineering, India");
		model.addObject("student1",student1);
		
		return model;
	}
	
}

