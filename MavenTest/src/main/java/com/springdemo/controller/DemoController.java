package com.springdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class DemoController {
	/*
	 * @PathVariable 处理url中的参数
	 */
	@RequestMapping(value= "/hello/{id}")
	public String Test(@PathVariable int id){
		System.out.println(id);
		return "index";
	}
}
