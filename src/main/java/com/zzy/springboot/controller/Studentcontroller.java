package com.zzy.springboot.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zzy.springboot.po.Score;
import com.zzy.springboot.po.ScoreExample;
import com.zzy.springboot.po.Student;
import com.zzy.springboot.po.StudentExample;
import com.zzy.springboot.service.Service_interface;

@Controller
public class Studentcontroller {

	@Autowired
	Service_interface service_interface;
	
	@RequestMapping("/insertStudent")//ok
	public String insertStudent(Student student)
	{
		service_interface.insert_Students(student);
		return "redirect:listStudent";
	}
	@RequestMapping("/deleteStudent")//ok
	public String deleteStudent(Student student)
	{
		service_interface.delete_Student_by_Keyid(student.getId());
		return "redirect:listStudent";
	}
	@RequestMapping("/updateStudent")
	public String updateStudent(Student student)
	{
		service_interface.update_Student(student);
		return "redirect:listStudent";
	}

	@RequestMapping("/editStudent")
	public String editStudent(int id,Model view)
	{
		Student student=service_interface.findStudent_by_Keyid(id);
		view.addAttribute("c", student);
		return "editStudent";
	}
	@RequestMapping("/listStudent")
	public String findStudent(Model model)
	{
		List<Student> students=service_interface.findAllStudent();
		model.addAttribute("students", students);
		return "listStudent";
	}
		
	@RequestMapping("/findStudent")
	public String findStudent_by_example(HttpServletRequest request,Model model)
	{
		StudentExample studentExample=new StudentExample();
		StudentExample.Criteria criteria=studentExample.createCriteria();
		if(!request.getParameter("addr1").equals("null"))
		{criteria.andAddrLike(request.getParameter("addr1"));}
		
		if(!request.getParameter("stuNo1").equals("null"))
{criteria.andStuNoLike(request.getParameter("stuNo1"));}
		
		if(!request.getParameter("stuName1").equals("null"))
{criteria.andStuNameLike(request.getParameter("stuName1"));}
		
		if(!request.getParameter("sex1").equals("null"));
{criteria.andSexEqualTo(request.getParameter("sex1"));}
		
		if(!request.getParameter("department1").equals("null"))
{criteria.andDepartmentEqualTo(request.getParameter("department1"));}
		
//		criteria.andSexLike("男");
		List<Student> list=service_interface.findStudents_by_exmaple(studentExample);
		model.addAttribute("students",list);
		return "findStudent";
	}
//	@ResponseBody
//	@RequestMapping("/testjsp")
//	public String testjsp()
//	{
//		return "Hello Spring Boot";
//	}
//	
	
}
