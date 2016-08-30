package wuliu.com.pojo;

/**
 * YuanGongBiao entity. @author MyEclipse Persistence Tools
 */

public class YuanGongBiao implements java.io.Serializable {

	// Fields

	private Integer yuanGongId;
	private String yuanGongMingCheng;
	private String zhuZhi;
	private String lianXiDuanHua;

	// Constructors

	/** default constructor */
	public YuanGongBiao() {
	}

	/** minimal constructor */
	public YuanGongBiao(String yuanGongMingCheng) {
		this.yuanGongMingCheng = yuanGongMingCheng;
	}

	/** full constructor */
	public YuanGongBiao(String yuanGongMingCheng, String zhuZhi,
			String lianXiDuanHua) {
		this.yuanGongMingCheng = yuanGongMingCheng;
		this.zhuZhi = zhuZhi;
		this.lianXiDuanHua = lianXiDuanHua;
	}

	// Property accessors

	public Integer getYuanGongId() {
		return this.yuanGongId;
	}

	public void setYuanGongId(Integer yuanGongId) {
		this.yuanGongId = yuanGongId;
	}

	public String getYuanGongMingCheng() {
		return this.yuanGongMingCheng;
	}

	public void setYuanGongMingCheng(String yuanGongMingCheng) {
		this.yuanGongMingCheng = yuanGongMingCheng;
	}

	public String getZhuZhi() {
		return this.zhuZhi;
	}

	public void setZhuZhi(String zhuZhi) {
		this.zhuZhi = zhuZhi;
	}

	public String getLianXiDuanHua() {
		return this.lianXiDuanHua;
	}

	public void setLianXiDuanHua(String lianXiDuanHua) {
		this.lianXiDuanHua = lianXiDuanHua;
	}

}