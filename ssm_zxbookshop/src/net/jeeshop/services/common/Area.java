package net.jeeshop.services.common;

import java.io.Serializable;

import net.jeeshop.core.dao.QueryModel;

public class Area extends QueryModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String code;
	private String name;
	private String pcode;
	private String desc1;

	public Area() {
	}

	public Area(String code, String name, String pcode) {
		this.code = code;
		this.name = name;
		this.pcode = pcode;
	}

	public void clear() {
		super.clear();
		id = null;
		code = null;
		name = null;
		pcode = null;
		desc1 = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc1() {
		return desc1;
	}

	public void setDesc1(String desc1) {
		this.desc1 = desc1;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	@Override
	public String toString() {
		return "Area [id=" + id + ", code=" + code + ", name=" + name
				+ ", pcode=" + pcode + ", desc1=" + desc1 + "]";
	}

}