package com.ws.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


@WebService(endpointInterface = "com.ws.service.SayHiService")
public class SayHiServiceImpl implements SayHiService {

	@Override
	public void SayHiDefault() {
		System.out.println("Hi, Jason jun!");
	}
	@Override
	public void SayHi(String name) {
		System.out.println("Hi, " + name + "!");
	}

	@Override
	public int CheckTime(Date clientTime) {
		// 精确到秒
		String dateServer = new java.sql.Date(System.currentTimeMillis()).toString() + " "
				+ new java.sql.Time(System.currentTimeMillis());
		String dateClient = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(clientTime);
		return dateServer.equals(dateClient) ? 1 : 0;
	}


}
