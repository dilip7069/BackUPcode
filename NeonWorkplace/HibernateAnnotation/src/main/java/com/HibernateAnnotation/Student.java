package com.HibernateAnnotation;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Student", uniqueConstraints={@UniqueConstraint(columnNames={"SID"})})
public class Student {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SID",nullable=false,unique=true,length=11)
	int studentid;
	@Column(name="FNAME",length=20,nullable=true)
	String fName;
	@Column(name="LNAME",length=20,nullable=true)
	String lName;
	@Column(name="Marks",length=10,nullable=true)
	int marks;
	
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
}
