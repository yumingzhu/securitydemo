package com.yumingzhu.securitydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 
 * @Author yumigzhu
 * @Date 2020/6/12 10:57
 */
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {

		return "hello";
	}

}
