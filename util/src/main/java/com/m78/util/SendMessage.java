package com.m78.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

public  class SendMessage {

    static String host = "https://feginesms.market.alicloudapi.com";
    static String path = "/codeNotice";
    static String method = "GET";
    static String appcode = "b83fba133a234edc94ea2745699cf234";
    static Map<String, String> headers = new HashMap<String, String>();
    static Map<String, String> querys = new HashMap<String, String>();
	public  static int sendMessage(String name,String phone) {
        headers.put("Authorization", "APPCODE " + appcode);
	    querys.put("param", name);
	    querys.put("phone", phone);
	    querys.put("sign", "1");
	    querys.put("skin", "22");
	    try {
	    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
	        return 1;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    	return 0;
	    }
	}
    public  static String sendMessage(String phone) {
        String  validation=String.valueOf((Math.random()*9+1)*100000);
        String laJi=validation.substring(0, validation.indexOf("."));
        headers.put("Authorization", "APPCODE " + appcode);
        querys.put("param", laJi);
        querys.put("phone", phone);
        querys.put("sign", "1");
        querys.put("skin", "19");
        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            return laJi;
        } catch (Exception e) {
            e.printStackTrace();
            return "失败";
        }
    }
}
