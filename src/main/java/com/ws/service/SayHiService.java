package com.ws.service;

import java.util.Date;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

/**
 * @Title:   jaxws
 * @author:  wangjunhui
 * @date:    2016年7月28日
 * @version  1.0
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface SayHiService {

	/**
     * 执行测试的WebService方法
     */
    @WebMethod
    public void SayHiDefault();

    /**
     * 执行测试的WebService方法(有参)
     * 
     * @param name
     */
    @WebMethod
    public void SayHi(@WebParam(name = "name") String name);

    /**
     * 执行测试的WebService方法(用于时间校验)
     * 
     * @param clentTime 客户端时间
     * @return 0表示时间校验失败 1表示校验成功
     */
    @WebMethod
    @WebResult(name = "valid")
    public int CheckTime(@WebParam(name = "clientTime") Date clientTime);
}