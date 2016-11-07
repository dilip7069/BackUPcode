package com.dilip.springboot.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.dilip.springboot.Entity.Student;
@Repository
public class StudentDao {

	private static Map<Integer, Student> students;
	
	static{
		students = new HashMap<Integer, Student>(){
		{
			put(1, new Student(1,"dilip","ComputerScience"));
			put(2, new Student(2,"dilip2","ComputerScience"));
			put(3, new Student(3,"dilip3","ComputerScience"));
			put(4, new Student(4,"dilip4","ComputerScience"));
			put(5, new Student(5,"dilip5","ComputerScience"));
		}
	};
	}
	
	public Collection<Student> getAllStudents(){
		return students.values();
	}
	
	public Student getStudentbyID(int id)
	{
		return students.get(id);
	}

	public void removeStudentbyID(int id) {
      students.remove(id);		
	}
		   

	public void updateStudent(Student student) 
	{
	      Student s= students.get(student.getId());
	      s.setCourse(student.getCourse());
	      s.setName(student.getName());
	      students.put(student.getId(), s);
	    	
	    }
}
