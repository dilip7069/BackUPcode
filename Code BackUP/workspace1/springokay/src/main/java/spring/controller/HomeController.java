package spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public ModelAndView getHome(){
		System.out.println("Enter into the loop");
		String str = "Congrates! you are done with the spring security.";		
		return new ModelAndView("home","string",str);
		
	}
	
	@RequestMapping("/home1")
	public ModelAndView getHome1(){
		System.out.println("Enter into the loop");
		String str = "Congrates! you are done with the spring security.";		
		return new ModelAndView("home1","string",str);
		
	}

}
