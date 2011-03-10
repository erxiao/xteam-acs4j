package com.xteam.asc4j.module.entities;

/**
 * PurviewUserFunDatarule generated by MyEclipse Persistence Tools
 */

public class PurviewUserFunDatarule implements java.io.Serializable {

	// Fields

	/**
	 * com.xteam.asc4j.module.entities
	 * PurviewUserFunDatarule.java   long
	 * Administrator
	 */
	private static final long serialVersionUID = 6852815985681797011L;

	private String id;

	private String userId;

	private String userName;

	private String funId;

	private String funName;

	private Integer funPlist;

	private String druleId;

	private String drtypeId;

	private String dataName;

	private Integer dataPlist;

	// Constructors

	/** default constructor */
	public PurviewUserFunDatarule() {
	}

	/** minimal constructor */
	public PurviewUserFunDatarule(String id) {
		this.id = id;
	}

	/** full constructor */
	public PurviewUserFunDatarule(String id, String userId, String userName,
			String funId, String funName, Integer funPlist, String druleId,
			String drtypeId, String dataName, Integer dataPlist) {
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.funId = funId;
		this.funName = funName;
		this.funPlist = funPlist;
		this.druleId = druleId;
		this.drtypeId = drtypeId;
		this.dataName = dataName;
		this.dataPlist = dataPlist;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFunId() {
		return this.funId;
	}

	public void setFunId(String funId) {
		this.funId = funId;
	}

	public String getFunName() {
		return this.funName;
	}

	public void setFunName(String funName) {
		this.funName = funName;
	}

	public Integer getFunPlist() {
		return this.funPlist;
	}

	public void setFunPlist(Integer funPlist) {
		this.funPlist = funPlist;
	}

	public String getDruleId() {
		return this.druleId;
	}

	public void setDruleId(String druleId) {
		this.druleId = druleId;
	}

	public String getDrtypeId() {
		return this.drtypeId;
	}

	public void setDrtypeId(String drtypeId) {
		this.drtypeId = drtypeId;
	}

	public String getDataName() {
		return this.dataName;
	}

	public void setDataName(String dataName) {
		this.dataName = dataName;
	}

	public Integer getDataPlist() {
		return this.dataPlist;
	}

	public void setDataPlist(Integer dataPlist) {
		this.dataPlist = dataPlist;
	}

}