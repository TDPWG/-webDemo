package pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ExportImportInfoPojo {
	private BigDecimal exp_imp_id;	//number(20,0)
	private Short is_imp;	//number(1,0)
	private Long rep_id;	//number(10,0)
	private Date start_time;	//date
	private Date fact_start_time;	//date
	private Date end_time;	//date
	private Date fact_end_time;	//date
	private Long pro_id;	//number(10,0)
	private BigDecimal pro_count;	//number(15,0)
	private BigDecimal pro_fact_count;	//number(15,0)
	private Short is_finished;	//number(1,0)
	private Long handle_emp_id;	//number(10,0)
	public BigDecimal getExp_imp_id() {
		return exp_imp_id;
	}
	public void setExp_imp_id(BigDecimal exp_imp_id) {
		this.exp_imp_id = exp_imp_id;
	}
	public Short getIs_imp() {
		return is_imp;
	}
	public void setIs_imp(Short is_imp) {
		this.is_imp = is_imp;
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
	public Date getFact_start_time() {
		return fact_start_time;
	}
	public void setFact_start_time(Date fact_start_time) {
		this.fact_start_time = fact_start_time;
	}
	public Date getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Date end_time) {
		this.end_time = end_time;
	}
	public Date getFact_end_time() {
		return fact_end_time;
	}
	public void setFact_end_time(Date fact_end_time) {
		this.fact_end_time = fact_end_time;
	}
	public Long getPro_id() {
		return pro_id;
	}
	public void setPro_id(Long pro_id) {
		this.pro_id = pro_id;
	}
	public BigDecimal getPro_count() {
		return pro_count;
	}
	public void setPro_count(BigDecimal pro_count) {
		this.pro_count = pro_count;
	}
	public BigDecimal getPro_fact_count() {
		return pro_fact_count;
	}
	public void setPro_fact_count(BigDecimal pro_fact_count) {
		this.pro_fact_count = pro_fact_count;
	}
	public Short getIs_finished() {
		return is_finished;
	}
	public void setIs_finished(Short is_finished) {
		this.is_finished = is_finished;
	}
	public Long getHandle_emp_id() {
		return handle_emp_id;
	}
	public void setHandle_emp_id(Long handle_emp_id) {
		this.handle_emp_id = handle_emp_id;
	}
	

}
