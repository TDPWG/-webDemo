package pojo;

import java.util.Date;

public class ListsPojo {
	private Long list_id;	//number(10,0)
	private String list_name;	//varchar2(50 byte)
	private Date list_start_time;	//date
	private Date list_end_time;	//date
	public Long getList_id() {
		return list_id;
	}
	public void setList_id(Long list_id) {
		this.list_id = list_id;
	}
	public String getList_name() {
		return list_name;
	}
	public void setList_name(String list_name) {
		this.list_name = list_name;
	}
	public Date getList_start_time() {
		return list_start_time;
	}
	public void setList_start_time(Date list_start_time) {
		this.list_start_time = list_start_time;
	}
	public Date getList_end_time() {
		return list_end_time;
	}
	public void setList_end_time(Date list_end_time) {
		this.list_end_time = list_end_time;
	}

}
