package wuliu.com.Action;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import wuliu.com.IService.IWuLiuGengZhongService;
public class queryDebugAction extends baseAction{
	private IWuLiuGengZhongService service;

	public IWuLiuGengZhongService getService() {
		return service;
	}

	public void setService(IWuLiuGengZhongService service) {
		this.service = service;
	}
	public String execute(){
		List l=service.QueryWuLiuDan();
		return SUCCESS;
	}
}
