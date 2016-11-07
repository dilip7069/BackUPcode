package com.dilip.springboot.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dilip.springboot.Entity.Student;
import com.dilip.springboot.Service.StudentService;


@RestController 
@RequestMapping("/")
public class StudentController {
	
    @Autowired 
	private StudentService studentService;
    
    @RequestMapping(method=RequestMethod.GET)
	public Collection<Student> getAllStudents(){
		 return studentService.getAllStudents();
	}
    
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public Student getStudentbyID(@PathVariable("id") int id)
    {
    	return studentService.getStudentbyID(id);
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void deleteStudentbyID(@PathVariable("id") int id)
    {
      studentService.removeStudentbyID(id);
    	
    }
    
    @RequestMapping(method=RequestMethod.PUT)
	 public void updateStudent(Student student)
	 {
	     
    	studentService.updateStudent(student);
	 }

}
