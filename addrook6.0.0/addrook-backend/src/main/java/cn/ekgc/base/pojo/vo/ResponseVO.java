package cn.ekgc.base.pojo.vo;

import cn.ekgc.base.pojo.enums.ResponseCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <b>系统响应视图信息</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 18:27
 * @program: addrook6.0.0
 **/
@ApiModel(value = "系统响应视图信息")
public class ResponseVO implements Serializable {
	private static final long serialVersionUID = 2273933803549918546L;
	@ApiModelProperty(value = "系统响应编码")
	private Integer code;               //系统响应编码
	@ApiModelProperty(value = "系统响应信息")
	private String message;             //系统响应信息
	@ApiModelProperty(value = "系统响应数据")
	private Object data;                //系统响应数据

	public ResponseVO(ResponseCode responseCode,String message,Object data){
		this.code = responseCode.getCode();
		this.message = message;
		this.data = data;
	}


	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
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
	/**
	 * <b>获得系统响应成功视图信息</b>
	 * */
	public static ResponseVO successResponseVO(){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS,ResponseCode.RESPONSE_SUCCESS.getRemark(), "");
	}
	/**
	 * <b>只返回成功的信息</b>
	 * */
	public static ResponseVO successResponseVO(String message){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS,message,"");
	}
	/**
	 * <b>返回成功的信息和数据</b>
	 * */
	public static ResponseVO successResponseVO(String message,Object data){
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS,message,data);
	}
	/**
	 * <b>用户未认证信息</b>
	 * */
	public static ResponseVO unAuthResponseVO(){
		return new ResponseVO(ResponseCode.RESPONSE_UNAUTH,ResponseCode.RESPONSE_UNAUTH.getRemark(), "");
	}
	/**
	 * <b>获得系统业务逻辑处理错误视图</b>
	 * */
	public static ResponseVO errorResponseVO(String message){
		return new ResponseVO(ResponseCode.RESPONSE_ERROR,message,"");
	}
	/**
	 * <b>获得后台处理错误信息</b>
	 * */
	public static ResponseVO exceptionResponseVO(Exception e){
		return new ResponseVO(ResponseCode.RESPONSE_EXCEPTION,e.getMessage(),"");
	}


}
