package com.zzy.springboot;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zzy.springboot.po.Student;
import com.zzy.springboot.service.Service_interface;

@RunWith(SpringRunner.class)
@SpringBootTest
class Project1ApplicationTests {

	@Autowired
	Service_interface service_interface;
	
	@Test
	void test() {
		List<Student> list=service_interface.findAllStudent();
		for(Student l:list)
		{
			System.out.println(l.getStuName());
		}
	}

}
