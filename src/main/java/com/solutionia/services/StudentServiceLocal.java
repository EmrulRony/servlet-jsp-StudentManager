package com.solutionia.services;

import java.util.List;

import javax.ejb.Local;

import com.solutionia.model.StudentInfo;

@Local
public  interface StudentServiceLocal {
	public void insertStudent(StudentInfo obj);
	public void updateStudent(StudentInfo obj);
	public String deleteStudent(int studentId);
	public List<StudentInfo> listStudent();

}
