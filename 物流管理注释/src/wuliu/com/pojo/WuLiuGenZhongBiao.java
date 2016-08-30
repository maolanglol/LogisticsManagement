package wuliu.com.pojo;

/**
 * WuLiuGenZhongBiao entity. @author MyEclipse Persistence Tools
 */

public class WuLiuGenZhongBiao implements java.io.Serializable {

	// Fields

	private Integer wuLiuGenZhongId;
	private Integer wuLiuDanId;
	private Integer wangDianId;
	private Boolean daoDaFou;
	private Boolean faiCheFou;
	private Integer shunXu;

	// Constructors

	/** default constructor */
	public WuLiuGenZhongBiao() {
	}

	/** full constructor */
	public WuLiuGenZhongBiao(Integer wuLiuDanId, Integer wangDianId,
			Boolean daoDaFou, Boolean faiCheFou, Integer shunXu) {
		this.wuLiuDanId = wuLiuDanId;
		this.wangDianId = wangDianId;
		this.daoDaFou = daoDaFou;
		this.faiCheFou = faiCheFou;
		this.shunXu = shunXu;
	}

	// Property accessors

	public Integer getWuLiuGenZhongId() {
		return this.wuLiuGenZhongId;
	}

	public void setWuLiuGenZhongId(Integer wuLiuGenZhongId) {
		this.wuLiuGenZhongId = wuLiuGenZhongId;
	}

	public Integer getWuLiuDanId() {
		return this.wuLiuDanId;
	}

	public void setWuLiuDanId(Integer wuLiuDanId) {
		this.wuLiuDanId = wuLiuDanId;
	}

	public Integer getWangDianId() {
		return this.wangDianId;
	}

	public void setWangDianId(Integer wangDianId) {
		this.wangDianId = wangDianId;
	}

	public Boolean getDaoDaFou() {
		return this.daoDaFou;
	}

	public void setDaoDaFou(Boolean daoDaFou) {
		this.daoDaFou = daoDaFou;
	}

	public Boolean getFaiCheFou() {
		return this.faiCheFou;
	}

	public void setFaiCheFou(Boolean faiCheFou) {
		this.faiCheFou = faiCheFou;
	}

	public Integer getShunXu() {
		return this.shunXu;
	}

	public void setShunXu(Integer shunXu) {
		this.shunXu = shunXu;
	}

}