package com.udemy.service.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.udemy.entity.Teacher;
import com.udemy.repository.TeacherJpaRepository;
import com.udemy.service.TeacherService;

@Service("teacherServiceImpl")
public class TeacherServiceImpl implements TeacherService{
	
	private static final Log LOG = LogFactory.getLog(TeacherServiceImpl.class);

	@Autowired
	@Qualifier("teacherJpaRepository")
	private TeacherJpaRepository teacherJpaRepository;
	
	@Override
	public List<Teacher> listAllTeachers() {
		LOG.info("Call: " + "listAllTeachers()");
		return teacherJpaRepository.findAll();
	}

	@Override
	public Teacher addTeacher(Teacher teacher) {
		LOG.info("Call: " + "addTeacher()");
		return teacherJpaRepository.save(teacher);
	}

	@Override
	public int removeTeacher(int id) {
		teacherJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public Teacher updateTeacher(Teacher teacher) {
		return teacherJpaRepository.save(teacher);
	}
	
	

}
