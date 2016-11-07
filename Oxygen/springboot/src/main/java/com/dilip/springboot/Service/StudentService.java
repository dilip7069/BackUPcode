package com.dilip.springboot.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dilip.springboot.Dao.StudentDao;
import com.dilip.springboot.Entity.Student;
@Service 
public class StudentService {
    @Autowired
	private StudentDao studentDao;
	public Collection<Student> getAllStudents(){
		return studentDao.getAllStudents();
	}
	
	public Student getStudentbyID(int id)
	{
		return studentDao.getStudentbyID(id);
	}

	public void removeStudentbyID(int id) {
		studentDao.removeStudentbyID(id);
	}


	public void updateStudent(Student student) {

		 studentDao.updateStudent(student);

	}
	
}
