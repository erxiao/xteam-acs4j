package com.xteam.asc4j.module.entities;

/**
 * PurviewType generated by MyEclipse Persistence Tools
 */

public class PurviewType implements java.io.Serializable {

	// Fields

	/**
	 * com.xteam.asc4j.module.entities
	 * PurviewType.java   long
	 * Administrator
	 */
	private static final long serialVersionUID = -8453545858908201976L;

	private Integer id;

	private String type;

	private String name;

	private String remark;

	// Constructors

	/** default constructor */
	public PurviewType() {
	}

	/** minimal constructor */
	public PurviewType(Integer purId) {
		this.id = purId;
	}

	/** full constructor */
	public PurviewType(Integer purId, String type, String name, String remark) {
		this.id = purId;
		this.type = type;
		this.name = name;
		this.remark = remark;
	}

	// Property accessors

	public Integer getPurId() {
		return this.id;
	}

	public void setPurId(Integer purId) {
		this.id = purId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}