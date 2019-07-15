package com.huangyacool.huangya.enumcase;

/**
* 名称: ExceptionEnum.java
* 公司: huangyacool公司
*Copyright: Copyright (c) 2007
* @deprecated: 异常枚举类，相当于常量？
* @author: huangya
* 创建日期: 2019年7月5日
* @version: 1.0
*/
public enum ExceptionEnum {
	WRONG_PERMISSONS("当前用户无权限！");  //调用下面构造方法
	
	private final String value;

	ExceptionEnum(String value){
		this.value = value;
	}
	
	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
}
