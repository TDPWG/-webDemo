package pojo;

import java.math.BigDecimal;
import java.util.Date;

public class RepositoriesUsingInfoPojo {
	private BigDecimal rep_using_id;	//number(20,0)
	private Long rep_id;	//number(10,0)
	private Date start_time;	//date
	private Date end_time;	//date
	private Long cust_id	; //number(10,0)
	public BigDecimal getRep_using_id() {
		return rep_using_id;
	}
	public void setRep_using_id(BigDecimal rep_using_id) {
		this.rep_using_id = rep_using_id;
	}
	public Long getRep_id() {
		return rep_id;
	}
	public void setRep_id(Long rep_id) {
		this.rep_id = rep_id;
	}
	public Date getStart_time() {
		return start_time;
	}
	public void setStart_time(Date start_time) {
		this.start_time = start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	
}
