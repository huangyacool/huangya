package com.huangyacool.huangya.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo04_sy01 {
	
	@RequestMapping("/sy01_index")
//	@ResponseBody
	public String showPage(Model model){
//		ModelAndView m = new ModelAndView();
//		m.setViewName("/statichtml01/sy01");
//		return m;
		return "sy01";
	}
}
