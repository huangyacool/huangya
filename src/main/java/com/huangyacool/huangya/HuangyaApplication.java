package com.huangyacool.huangya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan("com.huangyacool.huangya.Filter")
public class HuangyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HuangyaApplication.class, args);
	}

}
