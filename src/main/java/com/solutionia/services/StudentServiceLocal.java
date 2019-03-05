package com.solutionia.services;

import java.util.List;

import javax.ejb.Local;

import com.solutionia.model.Student;

@Local
public  interface StudentServiceLocal {
	public void insertStudent(Student obj);
	public void updateStudent(Student obj);
	public void deleteStudent(int studentId);
	public List<Student> listStudent();

}
