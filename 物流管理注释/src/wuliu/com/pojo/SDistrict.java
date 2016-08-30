package wuliu.com.pojo;

import java.sql.Timestamp;

/**
 * SDistrict entity. @author MyEclipse Persistence Tools
 */

public class SDistrict implements java.io.Serializable {

	// Fields

	private Integer districtId;
	private String districtName;
	private Integer cityId;
	private Timestamp dateCreated;
	private Timestamp dateUpdated;

	// Constructors

	/** default constructor */
	public SDistrict() {
	}

	/** full constructor */
	public SDistrict(String districtName, Integer cityId, Timestamp dateCreated,
			Timestamp dateUpdated) {
		this.districtName = districtName;
		this.cityId = cityId;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
	}

	// Property accessors

	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Integer getCityId() {
		return this.cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
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