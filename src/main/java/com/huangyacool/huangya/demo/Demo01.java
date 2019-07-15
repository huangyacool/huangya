package com.huangyacool.huangya.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo01 {
	
	@RequestMapping(value = "/hello")
	public String demo01(Model m) {
		m.addAttribute("name", "huangya");
		return "hello";
	}
}
