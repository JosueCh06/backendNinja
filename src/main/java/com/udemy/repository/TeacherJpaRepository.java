package com.udemy.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udemy.entity.Teacher;

@Repository("teacherJpaRepository")
public interface TeacherJpaRepository extends JpaRepository<Teacher, Serializable>{
	
public abstract Teacher findByAge(int age);
	
	public abstract Teacher findByCodeAndName(int code, String name);
	
	public abstract List<Teacher> findByNameOrderByName(String name);
	
	public abstract Teacher findByNameOrAge(String name, int age);
	
}
