package com.xq.litego.pojo.enums;
/**
 * <b>基础信息功能 - 系统状态枚举信息</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-29 21:37
 * @program: HealthcareProject
 * @version 1.0.0
 **/
public enum ResponseCode {
	RESPONSE_SUCCESS("20000","系统处理成功"),
	RESPONSE_UNAUTH("30000","未认证"),
	RESPONSE_ERROR("40000","业务处理错误"),
	RESPONSE_EXCEPTION("50000","系统响应异常");
	private String code;                //状态编码
	private String remark;              //状态说明

	private ResponseCode(String code, String remark) {
		this.code = code;
		this.remark = remark;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}
