package com.wjh.service;

import javax.jws.WebService;
/**
 * @Title:   jaxws
 * @author:  wangjunhui
 * @date:    2016年7月28日
 * @version  1.0
 */
@WebService
public class Hello {

	public String sayHello(String name) {
		return ("Welcome, I am jax-ws Server. Hello, " + name);
	}

	public int sum(int a, int b) {
		return a + b;
	}
}