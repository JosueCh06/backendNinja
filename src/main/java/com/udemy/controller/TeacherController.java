package com.udemy.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.entity.Teacher;
import com.udemy.service.TeacherService;

@Controller
@RequestMapping("/teachers")
public class TeacherController {

	public static final String TEACHERS_VIEW = "teachers";
	
	private static final Log LOG = LogFactory.getLog(TeacherController.class);
	
	@Autowired
	@Qualifier("teacherServiceImpl")
	private TeacherService teacherService;
	
	@GetMapping("/listTeachers")
	public ModelAndView listAllTeacher() {
		LOG.info("Call: " + "listAllTeacher()");
		ModelAndView mav = new ModelAndView(TEACHERS_VIEW);
		mav.addObject("teacher", new Teacher());
		mav.addObject("teachers", teacherService.listAllTeachers());
		return mav;
	}
	
	@PostMapping("/addTeacher")
	public String addTeacher(@ModelAttribute("teacher") Teacher teacher) {
		LOG.info("Call: " + "addTeacher()" + "--Param: " + teacher.toString());
		teacherService.addTeacher(teacher);
		return "redirect:/teachers/listTeachers";
	}
	
}
