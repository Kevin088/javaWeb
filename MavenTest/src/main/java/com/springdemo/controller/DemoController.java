package com.springdemo.controller;

import javax.naming.spi.DirStateFactory.Result;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
@Api(value="/hello",description="商店")
@Controller
public class DemoController {
	/*
	 * @PathVariable 处理url中的参数
	 */
    @ApiOperation(value="hello",notes="通过商店id获取商店信息",httpMethod = "POST")
	@RequestMapping(value= "/hello/{id}")
	public String Test(@PathVariable int id){
		System.out.println(id);
		return "index";
	}
    
	// 列出某个类目的所有规格
	@ApiOperation(value = "获得用户列表", notes = "列表信息", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	@RequestMapping(value = "list", method = RequestMethod.POST)
	public Test list(
			@ApiParam(value = "分类ID", required = true) @RequestParam Long categoryId,
			@ApiParam(value = "分类ID", required = true) @RequestParam Long categoryId2,
			@ApiParam(value = "token", required = true) @RequestParam String token) {
		Test t=new Test();
		t.setName(categoryId+"");
		t.setWork(token);
		return t;
	}
}
