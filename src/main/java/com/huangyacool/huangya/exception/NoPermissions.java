package com.huangyacool.huangya.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
* 名称: NoPermissions.java
* 公司: huangyacool公司
*Copyright: Copyright (c) 2007
* @deprecated: 自定义错误示例：返回一个标准的error页面 (/error)
* @author: huangya
* 创建日期: 2019年7月5日
* @version: 1.0
*/
public class NoPermissions extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoPermissions(String msg) {
		super(msg);
	}
}
