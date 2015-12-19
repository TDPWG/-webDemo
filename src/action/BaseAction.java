package action;

import intercepter.Page;

import java.util.HashMap;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	private static final long serialVersionUID = -4043748482056056593L;

	private Object data;

	protected Page pagination;

	public Page getPagination() {
		return this.pagination;
	}

	
	public void setPagination(Page pagination) {
		this.pagination = pagination;
	}

	public Object getData() {
		return data;
	}


	public void formatData(Object data) {
		this.data = data;

	}
	
	
	public void formatData(List list,Page pagination) {
		HashMap map=new HashMap();
		map.put("data", list);
		map.put("pagination", pagination);
		this.data = map;

	}

}
