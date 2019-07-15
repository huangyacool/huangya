package com.huangyacool.huangya.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.huangyacool.huangya.enumcase.ExceptionEnum;
import com.huangyacool.huangya.exception.NoPermissions;

/**
* 名称: Demo02_excption.java
* 公司: huangyacool公司
*Copyright: Copyright (c) 2007
* @deprecated: 简单描述类的作用
* @author: huangya
* 创建日期: 2019年7月5日
* @version: 1.0
*/
@Controller
public class Demo02_excption {

	@RequestMapping("/exception1")
	public String exception1(){
		int i = 2 / 0;    //抛出运行时异常  全局异常
		return "hhhh";
	}
	
	/**
	 * 自定义异常
	 * http://localhost:8888/exception2?role=11
	 * @return
	 */
	@RequestMapping("/exception2")
	public String exception2(@RequestParam(value="role") Integer role) throws NoPermissions{
		int i = role;
		if(i<100){
			//ExceptionEnum 枚举类，为什么不用常量！   
            throw new NoPermissions(ExceptionEnum.WRONG_PERMISSONS.toString());  
        } 
		return "hhhh";
	}
}
