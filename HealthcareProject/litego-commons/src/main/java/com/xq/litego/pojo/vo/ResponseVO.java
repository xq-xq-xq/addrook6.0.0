package com.xq.litego.pojo.vo;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.xq.litego.pojo.enums.ResponseCode;

import javax.xml.ws.Response;
import java.io.Serializable;
import java.sql.ResultSet;

/**
 * <b>基础信息功能 - 系统响应视图信息</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-29 23:08
 * @program: HealthcareProject
 * @version 1.0.0
 **/
public class ResponseVO implements Serializable {
	private static final long serialVersionUID = 8047869876216742191L;

	private String code;                    //系统响应编码
	private String message;                 //系统响应信息
	private Object data;                    //系统响应数据

	public ResponseVO(ResponseCode responseCode, String message, Object data) {
		this.code = responseCode.getCode();
		this.message = message;
		this.data = data;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	//系统响应成功视图信息
	public static ResponseVO success(String message){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS,message,"");
	}
	private static ResponseVO success(String message,Object data){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS,message,data);
	}

	//未认证
	public static ResponseVO unAuth(){
		return new ResponseVO(ResponseCode.RESPONSE_UNAUTH,ResponseCode.RESPONSE_UNAUTH.getRemark(), "");
	}
	//系统响应错误
	public static ResponseVO errors(String errorMsg){
		return new ResponseVO(ResponseCode.RESPONSE_ERROR,errorMsg,"");
	}
	//系统响应异常
	public static ResponseVO exception(Exception e){
		return new ResponseVO(ResponseCode.RESPONSE_EXCEPTION,e.getMessage(),"");
	}


}

