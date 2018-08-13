package com.m78.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;

/**
 * 异常例子
 */
@Controller
public class HelloController extends HttpServlet {

	/**
	 * 网页跳转异常
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/hello")
	public String hello() throws Exception {
		int a= 1/0;
		return "error";
	}

	/**
	 * ajax 请求异常
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/json")
	public String json() throws Exception {
		throw new Exception("JSON请求发生错误！");
	}

}
