package cn.ekgc.base.pojo.enums;

/**
 * <b>系统状态枚举信息</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 19:50
 * @program: addrook6.0.0
 **/
public enum Status {
	STATUS_ENABLE("1","启用"),
	STATUS_DISABLE("0","禁用");

	private String code;            //系统状态编码
	private String remark;          //系统状态编码说明

	private Status(String code, String remark) {
		this.code = code;
		this.remark = remark;
	}
}

