package com.huangyacool.huangya.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo03_Thymeleaf {
	
	@RequestMapping("/index")
	public String showPage(Model model){
		List<String> list= new ArrayList<String>();
		list.add("AAAA");
		list.add("BBBB");
		list.add("CCCC");
		list.add("DDDD");
		
		model.addAttribute("name","huangyacool");
		model.addAttribute("user", list);
		return "index";
	}
	
	@RequestMapping("/course")
	public String course(Model model){
		return "course";
	}
	
	@RequestMapping("/pay")
	public String pay(Model model){
		return "pay";
	}
	
	@RequestMapping("/reg")
	public String reg(Model model){
		return "reg";
	}
	
	@RequestMapping("/search")
	public String search(Model model){
		return "search";
	}
	
	@RequestMapping("/login")
	public String login(Model model){
		return "login";
	}
}
