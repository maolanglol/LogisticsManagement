package wuliu.com.pojo;

import java.sql.Timestamp;

/**
 * SCity entity. @author MyEclipse Persistence Tools
 */

public class SCity implements java.io.Serializable {

	// Fields

	private Integer cityId;
	private String cityName;
	private String zipCode;
	private Integer provinceId;
	private Timestamp dateCreated;
	private Timestamp dateUpdated;

	// Constructors

	/** default constructor */
	public SCity() {
	}

	/** full constructor */
	public SCity(String cityName, String zipCode, Integer provinceId,
			Timestamp dateCreated, Timestamp dateUpdated) {
		this.cityName = cityName;
		this.zipCode = zipCode;
		this.provinceId = provinceId;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	// Property accessors

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Integer getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
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