package com.m78.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Cay on 2017/9/27.
 */
@Controller
public class HelloController {

	@ResponseBody
	@RequestMapping("/hello")
	public String hello() throws Exception {
		int a= 1/0;
		return "error";
	}

	@ResponseBody
	@RequestMapping("/json")
	public String json() throws Exception {
		throw new Exception("JSON请求发生错误！");
	}

}
