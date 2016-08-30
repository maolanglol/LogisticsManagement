package wuliu.com.pojo;

/**
 * WangDianBiao entity. @author MyEclipse Persistence Tools
 */

public class WangDianBiao implements java.io.Serializable {

	// Fields

	private Integer wangDianId;
	private String wangDianMingCheng;
	private Integer wangDianDiQu;

	// Constructors

	/** default constructor */
	public WangDianBiao() {
	}

	/** minimal constructor */
	public WangDianBiao(Integer wangDianDiQu) {
		this.wangDianDiQu = wangDianDiQu;
	}

	/** full constructor */
	public WangDianBiao(String wangDianMingCheng, Integer wangDianDiQu) {
		this.wangDianMingCheng = wangDianMingCheng;
		this.wangDianDiQu = wangDianDiQu;
	}

	// Property accessors

	public Integer getWangDianId() {
		return this.wangDianId;
	}

	public void setWangDianId(Integer wangDianId) {
		this.wangDianId = wangDianId;
	}

	public String getWangDianMingCheng() {
		return this.wangDianMingCheng;
	}

	public void setWangDianMingCheng(String wangDianMingCheng) {
		this.wangDianMingCheng = wangDianMingCheng;
	}

	public Integer getWangDianDiQu() {
		return this.wangDianDiQu;
	}

	public void setWangDianDiQu(Integer wangDianDiQu) {
		this.wangDianDiQu = wangDianDiQu;
	}

}