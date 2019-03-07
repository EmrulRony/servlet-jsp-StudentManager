package com.solutionia.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the student_info database table.
 * 
 */
@Entity
@Table(name="student_info")
@NamedQuery(name="StudentInfo.findAll", query="SELECT s FROM StudentInfo s")
public class StudentInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int studentid;

	private String studentcontact;

	@Temporal(TemporalType.DATE)
	private Date studentdob;

	private double studentgpa;

	private String studentname;

	public StudentInfo() {
	}

	public int getStudentid() {
		return this.studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
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

	public String getStudentname() {
		return this.studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	@Override
	public String toString() {
		return "StudentInfo [studentid=" + studentid + ", studentcontact=" + studentcontact + ", studentdob="
				+ studentdob + ", studentgpa=" + studentgpa + ", studentname=" + studentname + "]";
	}
	

}