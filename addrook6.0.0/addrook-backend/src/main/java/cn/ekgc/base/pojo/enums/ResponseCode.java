package cn.ekgc.base.pojo.enums;

import io.swagger.models.auth.In;

/**
 * <b>系统响应编码枚举信息</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 18:37
 * @program: addrook6.0.0
 **/
public enum ResponseCode {
	RESPONSE_SUCCESS(2000,"系统响应成功"),
	RESPONSE_UNAUTH(3000,"未认证用户"),
	RESPONSE_ERROR(4000,"系统业务逻辑处理错误"),
	RESPONSE_EXCEPTION(5000,"系统后台处理异常");
	private Integer code;               //系统响应编码
	private String remark;              //系统响应编码说明

	private ResponseCode(Integer code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
