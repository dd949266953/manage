package com.m78.exception;


import com.m78.entity.ErrorInfo;
import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 异常拦截器
 */
@ControllerAdvice
public class GlobalExceptionHandler {



    @ExceptionHandler(value = UnauthorizedException.class)
    public  Object unauthorizedException(){
        ModelAndView mv = new ModelAndView("noPermission");
        return  mv;
    }

	@ExceptionHandler(Exception.class)
	public Object handleException(Exception e,HttpServletRequest request){
		//使用HttpServletRequest中的header检测请求是否为ajax, 如果是ajax则返回json, 如果为非ajax则返回view(即ModelAndView)
		String contentTypeHeader = request.getHeader("Content-Type");
		String acceptHeader = request.getHeader("Accept");
		String xRequestedWith = request.getHeader("X-Requested-With");
		if ((contentTypeHeader != null && contentTypeHeader.contains("application/json"))
				|| (acceptHeader != null && acceptHeader.contains("application/json"))
				|| "XMLHttpRequest".equalsIgnoreCase(xRequestedWith)) {

			ErrorInfo<String> errorInfo = new ErrorInfo<>();
			errorInfo.setCode(ErrorInfo.ERROR);
			errorInfo.setMessage(e.getMessage());
			errorInfo.setData("Some problems occur...");
			errorInfo.setUrl(request.getRequestURL().toString());
			return errorInfo;
		} else {
			ModelAndView mv = new ModelAndView();
			mv.addObject("url", request.getRequestURL());
			mv.addObject("message",e.getMessage());
			mv.setViewName("error");
            mv.addObject("stackTrace", e.getStackTrace());
			return mv;
		}
	}
}
