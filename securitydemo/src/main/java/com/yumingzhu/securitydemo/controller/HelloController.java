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

	@GetMapping("/")
	public String index() {

		return "index";
	}
	@GetMapping("/hello")
	public String hello() {

		return "hello";
	}

	@GetMapping("/user/a")
	public String usera() {

		return "资源a";
	}
	@GetMapping("/admin/b")
	public String adminb() {
		return "资源b";
	}

}
