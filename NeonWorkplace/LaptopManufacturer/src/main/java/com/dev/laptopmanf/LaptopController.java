package com.dev.laptopmanf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import com.dev.laptopmanf.service.LoginValidation;
import com.dev.laptopmanf.model.ChipManf;
import com.dev.laptopmanf.service.DataBaseOperations;
/*    import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Qualifier;	
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PathVariable; */
	//import com.journaldev.spring.model.Person;
	//import com.journaldev.spring.service.PersonService;

	@Controller
	public class LaptopController {
		
		private LoginValidation lgvl;
		//private DataBaseOperations dboi;
		
		@Autowired(required=true)
		@Qualifier(value="lgvl")
		public void setLgvl(LoginValidation lgvl) {
			this.lgvl = lgvl;
		}
		
	/*	@Autowired(required=true)
		@Qualifier(value="dboi")
		public void setDboi(DataBaseOperations dboi) {
			this.dboi = dboi;
		}*/
		
		@RequestMapping(value = "/loginaction", method = RequestMethod.GET)
		public String validate(HttpServletRequest req,HttpServletResponse res) {
		    String uname;
		    String pwd;
		    uname=(String)req.getParameter("id");
			pwd=(String)req.getParameter("pwd");
		    if(lgvl.authenticateuser(uname, pwd))
			return "Home";
			return "index";
		}
		
		@RequestMapping(value = "/inschipmanf")
		public String inschipmanf() {
			return "chipmanf";
			
		}
		
		@RequestMapping(value= "/enterchipmanfdetails", method = RequestMethod.POST)
		public String addManf(HttpServletRequest req,HttpServletResponse res){
			ChipManf c=new ChipManf();
			c.setManfname(req.getParameter("manfname"));
			c.setAdress(req.getParameter("address"));
			c.setStreet(req.getParameter("street"));
			c.setState(req.getParameter("state"));
			c.setCity(req.getParameter("city"));
			System.out.println("add Manf from controller");
			lgvl.addManf(c);
			
			return "Home";
		}
		/*private PersonService personService;
		
		@Autowired(required=true)
		@Qualifier(value="personService")
		public void setPersonService(PersonService ps){
			this.personService = ps;
		}
		
		@RequestMapping(value = "/persons", method = RequestMethod.GET)
		public String listPersons(Model model) {
			model.addAttribute("person", new Person());
			model.addAttribute("listPersons", this.personService.listPersons());
			return "person";
		}
		
		//For add and update person both
		@RequestMapping(value= "/person/add", method = RequestMethod.POST)
		public String addPerson(@ModelAttribute("person") Person p){
			
			if(p.getId() == 0){
				//new person, add it
				this.personService.addPerson(p);
			}else{
				//existing person, call update
				this.personService.updatePerson(p);
			}
			
			return "redirect:/persons";
			
		}
		
		@RequestMapping("/remove/{id}")
	    public String removePerson(@PathVariable("id") int id){
			
	        this.personService.removePerson(id);
	        return "redirect:/persons";
	    }
	 
	    @RequestMapping("/edit/{id}")
	    public String editPerson(@PathVariable("id") int id, Model model){
	        model.addAttribute("person", this.personService.getPersonById(id));
	        model.addAttribute("listPersons", this.personService.listPersons());
	        return "person";
	    }
		*/
	}