package com.ws;

import javax.xml.ws.Endpoint;

import com.ws.service.SayHiService;
import com.ws.service.SayHiServiceImpl;

/**
 * @Title:   jaxws
 * @author:  wangjunhui
 * @date:    2016年7月28日
 * @version  1.0
 */
public class Main {

    
	private final static String ADDRESS = "http://localhost:8080/jaxws/service/sayHi";
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//wsimport -d .//target/classes -s ./src/main/java -p com.ws.client http://localhost:8080/jaxws/service/sayHi?wsdl
	    
		//只能作为调试，有以下bug：
		//jdk1.6u17以下编译器不支持以Endpoint.publish方式发布document方式的soap，必须在service接口和实现类添加“@SOAPBinding(style = SOAPBinding.Style.RPC)”注解；
		//访问受限，似乎只能本机访问(应该会绑定到publish的URL上，如下使用localhost的话就只能本机访问)
		
		System.out.println("web service start");
		
		SayHiService sh = new SayHiServiceImpl();
		Endpoint.publish(ADDRESS, sh);
		
		System.out.println("web service started");
		
		
	}

}
