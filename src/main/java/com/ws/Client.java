package com.ws;

import com.ws.client.SayHiService;
import com.ws.client.SayHiServiceImplService;

/**
 * @Title:   jaxws
 * @author:  wangjunhui
 * @date:    2016年7月28日
 * @version  1.0
 */
public class Client {

	// 服务发布的地址
	private final static String ADDRESS = "http://localhost:8080/jaxws/service/sayHi";

	public void requestServer1() {
		SayHiService service = new SayHiServiceImplService().getSayHiServiceImplPort();
		
		// sayhi
		service.sayHiDefault();
		service.sayHi("wangjh");

		// checktime
		// 时间日期的xml传递
		/*GregorianCalendar calender = new GregorianCalendar();
		calender.setTime(new Date(System.currentTimeMillis()));
		XMLGregorianCalendar xmldate = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
		System.out.println(service.checkTime(xmldate));*/

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Client client = new Client();
		client.requestServer1();
		
		//---
		//client.requestServer2();

	}

	
	 
}
