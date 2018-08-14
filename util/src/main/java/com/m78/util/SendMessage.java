package com.m78.util;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

public  class SendMessage {
	public  static int sendMessage(String name,String phone) {
	    String host = "https://feginesms.market.alicloudapi.com";
	    String path = "/codeNotice";
	    String method = "GET";
	    String appcode = "b83fba133a234edc94ea2745699cf234";
	    Map<String, String> headers = new HashMap<String, String>();
	    headers.put("Authorization", "APPCODE " + appcode);
	    Map<String, String> querys = new HashMap<String, String>();
	    querys.put("param", name);
	    querys.put("phone", phone);
	    querys.put("sign", "1");
	    querys.put("skin", "22");
	    try {
	    	HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            System.out.println(EntityUtils.toString(response.getEntity()) );
	        return 1;
	    } catch (Exception e) {
	    	e.printStackTrace();
	    	return 0;
	    }
	}
}
