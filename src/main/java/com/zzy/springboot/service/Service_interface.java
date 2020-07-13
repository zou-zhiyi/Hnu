package com.zzy.springboot.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import com.zzy.springboot.po.Score;
import com.zzy.springboot.po.ScoreExample;
import com.zzy.springboot.po.Student;
import com.zzy.springboot.po.StudentExample;


public interface Service_interface {

	
	
	void insert_Students(Student student);//增加完之后还要重新加载一次
	
	void deleteAllStudent();//删除所有student
	
	void delete_Student_by_Keyid(int id);//根据id删除student
	
	void update_Student(Student student);
	
	List <Student> findAllStudent();//显示所有student
	
	List <Student> findStudents_by_exmaple(StudentExample studentExample);
	
	
	
	void insert_Scores(Score score);//增加完之后还要重新加载一次
	
	void deleteAllScore();//删除所有student
	
	void delete_Score_by_Keyid(int id);//根据id删除student
	
	void update_Score(Score score);
	
	List <Score> findAllScores();//显示所有student
	
	List <Score> findScore_by_exmaple(ScoreExample scoreExample);
	
	Student findStudent_by_Keyid(int id);
	
	Score findScore_by_keyid(int id);
}
