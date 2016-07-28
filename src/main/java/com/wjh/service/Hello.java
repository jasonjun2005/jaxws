package com.wjh.service;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
/**
 * @Title:   jaxws
 * @author:  wangjunhui
 * @date:    2016年7月28日
 * @version  1.0
 */
@WebService
//@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Hello {

	// cd E:\op\git\jaxws
	
	// wsgen -cp ./target/classes -r ./src/main/resources/wsdl -s ./src/main/java -d ./target/classes -wsdl com.wjh.service.Hello
	// -cp 定义classpath 
	// -r 生成 bean的wsdl文件的存放目录 
	// -s 生成发布WebService的源代码文件的存放目录（如果方法有抛出异常，则会生成该异常的描述类源文件） 
	// -d 生成发布WebService的编译过的二进制类文件的存放目录（该异常的描述类的class文件）

	// wsimport -d .//target/classes -s ./src/main/java -p com.bonc.client http://localhost:8808/HelloService?wsdl
	// -d 生成客户端执行类的class文件的存放目录
	// -s 生成客户端执行类的源文件的存放目录
	// -p 定义生成类的包名
	public String sayHello(String name) {
		return ("Welcome, I am jax-ws Server. Hello, " + name);
	}

	public int sum(int a, int b) {
		return a + b;
	}
}