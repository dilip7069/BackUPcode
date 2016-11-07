package Controller;
import java.util.HashMap;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


public class MyController implements Controller {
    
	String uid;
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse res) throws Exception
	{
		uid=req.getParameter("id");
		System.out.println("Message from My controller");
		Map<String,String> m=new HashMap<String,String>();
		m.put("msg","Hello");
		
		ModelAndView mv=new ModelAndView("loginaction",m);
		return mv;
	}
}
