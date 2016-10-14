/**
* @developer： WangY
* @时间：2016年10月14日 下午1:34:05
* @项目名：webServices
*  高弗特 goFirst
*/
package com.goFirst.http;

public class HttpDemoTest {

	 public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	        try {       
	            HttpRequester request = new HttpRequester();  
	            request.setDefaultContentEncoding("utf-8");  
	            HttpRespons hr = request.sendGet("http://www.baidu.com");       
	        
	            System.out.println(hr.getUrlString());       
	            System.out.println(hr.getProtocol());       
	            System.out.println(hr.getHost());       
	            System.out.println(hr.getPort());       
	            System.out.println(hr.getContentEncoding());       
	            System.out.println(hr.getMethod());       
	                   
	            System.out.println(hr.getContent());       
	        
	        } catch (Exception e) {       
	            e.printStackTrace();       
	        }   
	    }  

}

