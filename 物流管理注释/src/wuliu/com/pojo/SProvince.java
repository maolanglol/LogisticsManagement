package wuliu.com.pojo;

import java.sql.Timestamp;

/**
 * SProvince entity. @author MyEclipse Persistence Tools
 */

public class SProvince implements java.io.Serializable {

	// Fields

	private Integer provinceId;
	private String provinceName;
	private Timestamp dateCreated;
	private Timestamp dateUpdated;

	// Constructors

	/** default constructor */
	public SProvince() {
	}

	/** full constructor */
	public SProvince(String provinceName, Timestamp dateCreated,
			Timestamp dateUpdated) {
		this.provinceName = provinceName;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	// Property accessors

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return this.provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateUpdated() {
		return this.dateUpdated;
	}

	public void setDateUpdated(Timestamp dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

}