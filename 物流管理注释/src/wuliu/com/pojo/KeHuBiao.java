package wuliu.com.pojo;

/**
 * KeHuBiao entity. @author MyEclipse Persistence Tools
 */

public class KeHuBiao implements java.io.Serializable {

	// Fields

	private Integer keHuId;
	private String keHuMingCheng;
	private String keHuBianHao;
	private Integer keHuLeiBieId;
	private String lianXiRen;
	private String dianHua;
	private String lianXiDiZhi;

	// Constructors

	/** default constructor */
	public KeHuBiao() {
	}

	/** minimal constructor */
	public KeHuBiao(String keHuMingCheng, String keHuBianHao,
			Integer keHuLeiBieId, String lianXiRen) {
		this.keHuMingCheng = keHuMingCheng;
		this.keHuBianHao = keHuBianHao;
		this.keHuLeiBieId = keHuLeiBieId;
		this.lianXiRen = lianXiRen;
	}

	/** full constructor */
	public KeHuBiao(String keHuMingCheng, String keHuBianHao,
			Integer keHuLeiBieId, String lianXiRen, String dianHua,
			String lianXiDiZhi) {
		this.keHuMingCheng = keHuMingCheng;
		this.keHuBianHao = keHuBianHao;
		this.keHuLeiBieId = keHuLeiBieId;
		this.lianXiRen = lianXiRen;
		this.dianHua = dianHua;
		this.lianXiDiZhi = lianXiDiZhi;
	}

	// Property accessors

	public Integer getKeHuId() {
		return this.keHuId;
	}

	public void setKeHuId(Integer keHuId) {
		this.keHuId = keHuId;
	}

	public String getKeHuMingCheng() {
		return this.keHuMingCheng;
	}

	public void setKeHuMingCheng(String keHuMingCheng) {
		this.keHuMingCheng = keHuMingCheng;
	}

	public String getKeHuBianHao() {
		return this.keHuBianHao;
	}

	public void setKeHuBianHao(String keHuBianHao) {
		this.keHuBianHao = keHuBianHao;
	}

	public Integer getKeHuLeiBieId() {
		return this.keHuLeiBieId;
	}

	public void setKeHuLeiBieId(Integer keHuLeiBieId) {
		this.keHuLeiBieId = keHuLeiBieId;
	}

	public String getLianXiRen() {
		return this.lianXiRen;
	}

	public void setLianXiRen(String lianXiRen) {
		this.lianXiRen = lianXiRen;
	}

	public String getDianHua() {
		return this.dianHua;
	}

	public void setDianHua(String dianHua) {
		this.dianHua = dianHua;
	}

	public String getLianXiDiZhi() {
		return this.lianXiDiZhi;
	}

	public void setLianXiDiZhi(String lianXiDiZhi) {
		this.lianXiDiZhi = lianXiDiZhi;
	}

}