package cn.ekgc.user.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2021-12-14 21:20
 * @program: User01
 **/
public class Role implements Serializable {
	private Long id;                    //主键
	private String role_name;           //姓名
	private Integer is_delete;          //是否删除0：删除1：否
	private Date create_time;           //创建时间
	private Integer create_user_id;     //创建人
	private Date update_time;           //修改时间
	private Integer update_user_id;     //修改人

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public Integer getIs_delete() {
		return is_delete;
	}

	public void setIs_delete(Integer is_delete) {
		this.is_delete = is_delete;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Integer getCreate_user_id() {
		return create_user_id;
	}

	public void setCreate_user_id(Integer create_user_id) {
		this.create_user_id = create_user_id;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Integer getUpdate_user_id() {
		return update_user_id;
	}

	public void setUpdate_user_id(Integer update_user_id) {
		this.update_user_id = update_user_id;
	}

	@Override
	public String toString() {
		return "Role{" +
				"id=" + id +
				", role_name='" + role_name + '\'' +
				", is_delete=" + is_delete +
				", create_time=" + create_time +
				", create_user_id=" + create_user_id +
				", update_time=" + update_time +
				", update_user_id=" + update_user_id +
				'}';
	}
}
