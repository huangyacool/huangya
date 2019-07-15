package com.huangyacool.huangya.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 定义一个全局异常处理类
 * @author zrhy
 *
 */
@ControllerAdvice  //定义一个全局异常处理类
public class GlobalExceptionHandler {
	
    private static Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    
    
	/**
	 * 运行时异常
	 * @return
	 */
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public ModelAndView runtimeException(Exception ex){
		//ex.printStackTrace();
		log.error("===============运行时异常：" + ex.getMessage() + "===============");
		ModelAndView m = new ModelAndView();
		m.addObject("error", "001");
        m.addObject("message", ex.getMessage());
        m.setViewName("error/error");
		return m;
//		return "RunctionException  全局异常，相当于手写AOP捕获异常！";
	}
	
	@ExceptionHandler(NoPermissions.class)
	@ResponseBody
	public ModelAndView noPermissions(Exception ex){
		log.error("===============自定义异常：" + ex.getMessage() + "===============");
		ModelAndView m = new ModelAndView();
		m.addObject("error", "002");
        m.addObject("message", ex.getMessage());
        m.setViewName("error/error");
		return m;
	}
}