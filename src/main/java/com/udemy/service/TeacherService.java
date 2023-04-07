package com.udemy.service;

import java.util.List;

import com.udemy.entity.Teacher;

public interface TeacherService {
	
	public abstract List<Teacher> listAllTeachers();
	public abstract Teacher addTeacher(Teacher teacher);
	public abstract int removeTeacher(int id);
	public abstract Teacher updateTeacher(Teacher teacher);

}
