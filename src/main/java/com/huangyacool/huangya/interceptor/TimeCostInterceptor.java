package com.huangyacool.huangya.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * 拦截器
 * @author zrhy
 *
 */
@Component
public class TimeCostInterceptor implements HandlerInterceptor{

	// 注意此处的Service注入：需要对拦截器做一个有参数构造方法，然后再MyWebAppConfigurer里面注入Service并传入参数
	// 不能直接注入，因为拦截器是优先于spring对于Bean的加载的
	//private ApiLogService apiLogService;


	private final static Logger log = LoggerFactory.getLogger(TimeCostInterceptor.class);

}
