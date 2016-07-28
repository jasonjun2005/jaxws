package com.wjh;

import com.wjh.client.HelloService;

/**
 * @Title:   jaxws
 * @author:  wangjunhui
 * @date:    2016年7月28日
 * @version  1.0
 */
public class ClientMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HelloService helloService=new HelloService();
		String helloStr=helloService.getHelloPort().sayHello("oseye");
		System.out.println(helloStr);
	}
}
