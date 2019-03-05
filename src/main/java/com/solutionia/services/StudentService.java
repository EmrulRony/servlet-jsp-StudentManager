package com.solutionia.services;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.solutionia.model.Student;

@Stateless
public class StudentService implements StudentServiceLocal {
	@PersistenceContext
	EntityManager em;

	@Override
	public void insertStudent(Student obj) {
		em.persist(obj);
		
	}

	@Override
	public void updateStudent(Student obj) {
		em.merge(obj);
		
	}

	@Override
	public void deleteStudent(int studentId) {
		Student student = em.find(Student.class, studentId);
		em.remove(student);
		
	}

	@Override
	public List<Student> listStudent() {
		
		Query q =em.createQuery("SELECT s FROM Student s");
		
		return q.getResultList();
	}

}
