package com.spring.bean.scope.singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public abstract class School {

	
	@Autowired
	private Student student;
	
	@Lookup
	public abstract Student createStudentObj();
	
	public Student getStudent() {
		return createStudentObj();
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public School() {
		System.out.println("School object get created !! ");
	}
	
}
