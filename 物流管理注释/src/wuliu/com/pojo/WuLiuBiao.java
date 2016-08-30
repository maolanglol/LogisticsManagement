package wuliu.com.pojo;

/**
 * WuLiuBiao entity. @author MyEclipse Persistence Tools
 */

public class WuLiuBiao implements java.io.Serializable {

	// Fields

	private Integer wuLiuId;
	private String wuLiuBianHao;
	private String yunDanHao;
	private Integer tuoYunFangId;
	private Integer shouHuoFangId;
	private Integer kaiPiaoYuanId;
	private Integer fuWuFangShiId;
	private String beiZhu;
	private Boolean fenBaoFou;
	private Double yunFei;
	private String tuoYunRiQi;

	// Constructors

	/** default constructor */
	public WuLiuBiao() {
	}

	/** minimal constructor */
	public WuLiuBiao(String wuLiuBianHao, String yunDanHao,
			Integer tuoYunFangId, Integer shouHuoFangId, Boolean fenBaoFou) {
		this.wuLiuBianHao = wuLiuBianHao;
		this.yunDanHao = yunDanHao;
		this.tuoYunFangId = tuoYunFangId;
		this.shouHuoFangId = shouHuoFangId;
		this.fenBaoFou = fenBaoFou;
	}

	/** full constructor */
	public WuLiuBiao(String wuLiuBianHao, String yunDanHao,
			Integer tuoYunFangId, Integer shouHuoFangId, Integer kaiPiaoYuanId,
			Integer fuWuFangShiId, String beiZhu, Boolean fenBaoFou,
			Double yunFei, String tuoYunRiQi) {
		this.wuLiuBianHao = wuLiuBianHao;
		this.yunDanHao = yunDanHao;
		this.tuoYunFangId = tuoYunFangId;
		this.shouHuoFangId = shouHuoFangId;
		this.kaiPiaoYuanId = kaiPiaoYuanId;
		this.fuWuFangShiId = fuWuFangShiId;
		this.beiZhu = beiZhu;
		this.fenBaoFou = fenBaoFou;
		this.yunFei = yunFei;
		this.tuoYunRiQi = tuoYunRiQi;
	}

	// Property accessors

	public Integer getWuLiuId() {
		return this.wuLiuId;
	}

	public void setWuLiuId(Integer wuLiuId) {
		this.wuLiuId = wuLiuId;
	}

	public String getWuLiuBianHao() {
		return this.wuLiuBianHao;
	}

	public void setWuLiuBianHao(String wuLiuBianHao) {
		this.wuLiuBianHao = wuLiuBianHao;
	}

	public String getYunDanHao() {
		return this.yunDanHao;
	}

	public void setYunDanHao(String yunDanHao) {
		this.yunDanHao = yunDanHao;
	}

	public Integer getTuoYunFangId() {
		return this.tuoYunFangId;
	}

	public void setTuoYunFangId(Integer tuoYunFangId) {
		this.tuoYunFangId = tuoYunFangId;
	}

	public Integer getShouHuoFangId() {
		return this.shouHuoFangId;
	}

	public void setShouHuoFangId(Integer shouHuoFangId) {
		this.shouHuoFangId = shouHuoFangId;
	}

	public Integer getKaiPiaoYuanId() {
		return this.kaiPiaoYuanId;
	}

	public void setKaiPiaoYuanId(Integer kaiPiaoYuanId) {
		this.kaiPiaoYuanId = kaiPiaoYuanId;
	}

	public Integer getFuWuFangShiId() {
		return this.fuWuFangShiId;
	}

	public void setFuWuFangShiId(Integer fuWuFangShiId) {
		this.fuWuFangShiId = fuWuFangShiId;
	}

	public String getBeiZhu() {
		return this.beiZhu;
	}

	public void setBeiZhu(String beiZhu) {
		this.beiZhu = beiZhu;
	}

	public Boolean getFenBaoFou() {
		return this.fenBaoFou;
	}

	public void setFenBaoFou(Boolean fenBaoFou) {
		this.fenBaoFou = fenBaoFou;
	}

	public Double getYunFei() {
		return this.yunFei;
	}

	public void setYunFei(Double yunFei) {
		this.yunFei = yunFei;
	}

	public String getTuoYunRiQi() {
		return this.tuoYunRiQi;
	}

	public void setTuoYunRiQi(String tuoYunRiQi) {
		this.tuoYunRiQi = tuoYunRiQi;
	}

}