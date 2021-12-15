package cn.ekgc.addrook.pojo.entity;

import cn.ekgc.base.pojo.entity.BaseEntity;

/**
 * <b>个人通讯录系统 - 实体信息</b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-15 20:14
 * @program: addrook6.0.0
 **/
public class Addrook extends BaseEntity {
	private static final long serialVersionUID = 2549046313594646925L;
	private Long id;                //主键
	private String name;            //姓名
	private String cellphone;       //手机号
	private String address;         //地址

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
