package com.solutionia.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.solutionia.model.StudentInfo;

@Stateless
public class StudentService implements StudentServiceLocal {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insertStudent(StudentInfo obj) {
		em.persist(obj);
		
	}

	@Override
	public void updateStudent(StudentInfo obj) {
		em.merge(obj);
		
	}

	@Override
	public String deleteStudent(int studentId) {
		StudentInfo student = em.find(StudentInfo.class, studentId);
		if (student!=null) {
			em.remove(student);
		}
		else {
			return "The Student is not in Database";
		}
		return "Succressfully Deleted Student";
		
	}

	@Override
	public List<StudentInfo> listStudent() {
		
		Query q =em.createQuery("SELECT s FROM StudentInfo s");
		
		return q.getResultList();
	}

}
