package com.zzy.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zzy.springboot.po.Score;
import com.zzy.springboot.po.ScoreExample;
import com.zzy.springboot.po.Student;
import com.zzy.springboot.service.Service_interface;

@Controller
public class ScoreController {

	@Autowired
	Service_interface service_interface;
	
	@RequestMapping("/insertScore")
	public String insertscore(Score score)
	{
		service_interface.insert_Scores(score);
		return "redirect:listScore?stuNo="+score.getStuNo();
	}
	@RequestMapping("/deleteScore")
	public String deleteScore(Score score)
	{
		String stu=new String(score.getStuNo());
		service_interface.delete_Score_by_Keyid(score.getScoreId());
		return "redirect:listScore?stuNo="+stu;
	}
	@RequestMapping("/updateScore")
	public String updateScore(Score score,HttpServletRequest request)
	{
		service_interface.update_Score(score);
		return "redirect:listScore?stuNo="+request.getParameter("stuNo");
	}
	@RequestMapping("/editScore")
	public String editScore(int scoreId,Model model)
	{
		Score score=service_interface.findScore_by_keyid(scoreId);
		model.addAttribute("c", score);
		return "editScore";
	}
	
	@RequestMapping("/listScore")
	public String listscore(String stuNo,Model model)
	{
		ScoreExample scoreExample=new ScoreExample();
		ScoreExample.Criteria criteria=scoreExample.createCriteria();
		criteria.andStuNoEqualTo(stuNo);
		List<Score> scores=service_interface.findScore_by_exmaple(scoreExample);
		model.addAttribute("scores",scores);
		model.addAttribute("stu", stuNo);
		return "listScore";
	}
	@RequestMapping("/findScore")
	public String findScore(String stuNo,HttpServletRequest request,Model model)
	{
		ScoreExample scoreExample=new ScoreExample();
		ScoreExample.Criteria criteria=scoreExample.createCriteria();
		criteria.andCNameEqualTo(request.getParameter("cName1"));
		criteria.andStuNoEqualTo(stuNo);
		List<Score> scores=service_interface.findScore_by_exmaple(scoreExample);
		model.addAttribute("scores",scores);
		model.addAttribute("stu",stuNo);
		return "findScore";
	}
}
