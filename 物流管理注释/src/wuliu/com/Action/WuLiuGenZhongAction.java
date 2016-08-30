package wuliu.com.Action;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import wuliu.com.IService.IWuLiuGengZhongService;
import wuliu.com.pojo.WuLiuGenZhongBiao;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class WuLiuGenZhongAction  extends baseAction{
	private IWuLiuGengZhongService service;
	private JSONObject JSObj;
	private JSONArray JSArr;
	private String MSG;
	
	public IWuLiuGengZhongService getService() {
		return service;
	}

	public void setService(IWuLiuGengZhongService service) {
		this.service = service;
	}
	
	public JSONObject getJSObj() {
		return JSObj;
	}

	public void setJSObj(JSONObject jSObj) {
		JSObj = jSObj;
	}

	public JSONArray getJSArr() {
		return JSArr;
	}

	public void setJSArr(JSONArray jSArr) {
		JSArr = jSArr;
	}

	public String getMSG() {
		return MSG;
	}

	public void setMSG(String mSG) {
		MSG = mSG;
	}

	public String getYunDanAll(){
		List lstYunDan = service.QueryWuLiuDan();
		JSONArray jsArr = new JSONArray();
		JSONObject jsObj = new JSONObject();
        for(int i = 0;i<lstYunDan.size();i++){
			Object[] obj = (Object[])lstYunDan.get(i);
			jsObj.clear();
			jsObj.put("yunDanId", obj[0]);
			jsObj.put("yunDanDanHao", obj[2]);
			jsArr.add(jsObj);
        }
        HashMap<String,Object> jsMap = new HashMap<String,Object>();
		jsMap.put("rows", jsArr);
		JSObj = JSONObject.fromObject(jsMap);		
		return SUCCESS;
	}
	
	public String getYunDanByYunDanDanHao(){
		String yunDanDanHaoList = this.getRequest().getParameter("yunDanDanHaoList").toString();
		String[] lstYunDanDanHao = yunDanDanHaoList.split("<br/>");
		
		HashMap<String,Object> jsMap = new HashMap<String,Object>();
		
		for(int i = lstYunDanDanHao.length - 1;i >= 0;i--)
		{
			List lstYunDan = service.QueryWuLiuXianLu(lstYunDanDanHao[i]);
			JSONArray jsArr = new JSONArray();
			JSONObject jsObj = new JSONObject();
	        for(int j = 0;j<lstYunDan.size();j++){
				Object[] obj = (Object[])lstYunDan.get(j);
				jsObj.clear();
				jsObj.put("wangDian", obj[12]);
				jsObj.put("diQu", obj[13]);
				jsObj.put("faCheFou", obj[16]);
				jsArr.add(jsObj);
	        }
	        jsMap.put(lstYunDanDanHao[i], jsArr);
		}
		JSObj = JSONObject.fromObject(jsMap);		
		return SUCCESS;
	}
	public String getYunDanByWangDianID(){
		int wangDianId = Integer.parseInt(this.getRequest().getParameter("wangDianId").toString());
		
		List lstYunDan = service.QueryWuLiuXianLu(wangDianId);
		
		JSONArray jsArr = new JSONArray();
		JSONObject jsObj = new JSONObject();
        for(int i = 0;i<lstYunDan.size();i++){
			Object[] obj = (Object[])lstYunDan.get(i);
			jsObj.clear();
			jsObj.put("yunDanId", obj[0]);
			jsObj.put("yunDanDanHao", obj[2]);
			jsObj.put("dangQianWeiZhi", obj[13].toString().trim()+",网点【"+obj[12]+"】");
			jsObj.put("actionColumn","发车");
			jsArr.add(jsObj);
        }
        HashMap<String,Object> jsMap = new HashMap<String,Object>();
		jsMap.put("rows", jsArr);
		JSObj = JSONObject.fromObject(jsMap);		
		return SUCCESS;
	}
	
	public String getWangDianAll(){
		/*获取省份
		 *  获取市区
		 *	  获取地区
		 *    获取网点 
		 */
		return SUCCESS;
	}

	
	public String faChe(){
		int yunDanId = Integer.parseInt(this.getRequest().getParameter("yunDanId").toString());
		WuLiuGenZhongBiao wlgz = service.QueryWuLiuGenZhong(yunDanId).get(0);
		WuLiuGenZhongBiao wlgzNext = service.QueryWuLiuGenZhong(yunDanId,wlgz.getShunXu()+1).get(0);
		wlgz.setFaiCheFou(true);
		boolean wlgzFlag = service.modifyWuLiuGenZhongBiao(wlgz);
		wlgzNext.setDaoDaFou(true);
		boolean wlgzNextFlag = service.modifyWuLiuGenZhongBiao(wlgzNext);
		if(wlgzFlag&&wlgzNextFlag){
			this.MSG = "true";
		}
		else{
			this.MSG = "false";
		}
		return SUCCESS;
	}
}
