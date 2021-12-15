package cn.ekgc.user.utils;

import cn.ekgc.user.pojo.entity.User;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-14 22:04
 * @program: User01
 **/
public class Msg {
	private Integer code;
	private String message;
	private Object value;

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

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public static Msg success(String message){
		Msg msg = new Msg();
		msg.setCode(1);
		msg.setMessage(message);
		return msg;
	}
	public static User success(Object value){
		Msg msg = new Msg();
		msg.setCode(1);
		msg.setValue(value);
		return msg;
	}
	public static User error(String message){
		Msg msg = new Msg();
		msg.setCode(0);
		msg.setMessage(message);
		return msg;
	}
}
