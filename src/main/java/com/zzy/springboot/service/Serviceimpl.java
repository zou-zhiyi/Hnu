package com.zzy.springboot.service;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzy.springboot.mapper.ScoreMapper;
import com.zzy.springboot.mapper.StudentMapper;
import com.zzy.springboot.po.Score;
import com.zzy.springboot.po.ScoreExample;
import com.zzy.springboot.po.Student;
import com.zzy.springboot.po.StudentExample;

@Service
public class Serviceimpl implements Service_interface{

	@Autowired
	ScoreMapper scoreMapper;
	@Autowired
	StudentMapper studentMapper;
	
	@Override
	public void insert_Students(Student student) {
		// TODO Auto-generated method stub
		studentMapper.insert(student);
	}

	@Override
	public void deleteAllStudent() {
		List<Student> list=studentMapper.getAll();
		for(Student l:list)
		{
			studentMapper.deleteByPrimaryKey(l.getId());
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void delete_Student_by_Keyid(int id) {
		// TODO Auto-generated method stub
		studentMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update_Student(Student student) {
		// TODO Auto-generated method stub
		studentMapper.updateByPrimaryKey(student);
		
	}

	@Override
	public List<Student> findAllStudent() {
		// TODO Auto-generated method stub
		return studentMapper.getAll();

	}

	@Override
	public List<Student> findStudents_by_exmaple(StudentExample studentExample) {
		// TODO Auto-generated method stub	
		return studentMapper.selectByExample(studentExample);
	}

	
	
	
	
	
	@Override
	public void insert_Scores(Score score) {
		// TODO Auto-generated method stub
		scoreMapper.insert(score);
	}

	@Override
	public void deleteAllScore() {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void delete_Score_by_Keyid(int id) {
		// TODO Auto-generated method stub
		scoreMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void update_Score(Score score) {
		// TODO Auto-generated method stub
		scoreMapper.updateByPrimaryKey(score);
	}

	@Override
	public List<Score> findAllScores() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Score> findScore_by_exmaple(ScoreExample scoreExample) {
		// TODO Auto-generated method stub
		return scoreMapper.selectByExample(scoreExample);
	}

	public Student findStudent_by_Keyid(int id)
	{
		return studentMapper.selectByPrimaryKey(id);
	}
	
	public Score findScore_by_keyid(int id)
	{
		return scoreMapper.selectByPrimaryKey(id);
	}
}
