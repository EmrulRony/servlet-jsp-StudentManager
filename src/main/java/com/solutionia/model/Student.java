package com.solutionia.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int studentID;

	private float cgpa;

	private int contactNumber;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String studentcontact;

	@Temporal(TemporalType.DATE)
	private Date studentdob;

	private double studentgpa;

	private int studentid;

	private String studentname;

	private String studentName;

	public Student() {
	}

	public int getStudentID() {
		return this.studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public float getCgpa() {
		return this.cgpa;
	}

	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}

	public int getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getStudentcontact() {
		return this.studentcontact;
	}

	public void setStudentcontact(String studentcontact) {
		this.studentcontact = studentcontact;
	}

	public Date getStudentdob() {
		return this.studentdob;
	}

	public void setStudentdob(Date studentdob) {
		this.studentdob = studentdob;
	}

	public double getStudentgpa() {
		return this.studentgpa;
	}

	public void setStudentgpa(double studentgpa) {
		this.studentgpa = studentgpa;
	}

	public int getStudentid() {
		return this.studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return this.studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getStudentName() {
		return this.studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}