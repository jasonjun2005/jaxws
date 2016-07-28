package com.wjh;

import javax.xml.ws.Endpoint;

import com.wjh.service.Hello;

/**
 * @Title:   jaxws
 * @author:  wangjunhui
 * @date:    2016年7月28日
 * @version  1.0
 */
public class ServerMain {
	
	// wsimport -d .//target/classes -s ./src/main/java -p com.bonc.client http://localhost:8080/jaxws/Hello?wsdl
	// -d 生成客户端执行类的class文件的存放目录
	// -s 生成客户端执行类的源文件的存放目录
	// -p 定义生成类的包名
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("web service start");
		Endpoint.publish("http://localhost:8080/jaxws/Hello", new Hello());
		System.out.println("web service started");
		
	}
}
