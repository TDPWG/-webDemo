package pojo;

import java.math.BigDecimal;

public class RepositoriesPojo {
	private Long rep_id;	//number(10,0)
	private String rep_name;	//varchar2(30 byte)
	private Integer rep_type_id;	//number(5,0)
	private Long rep_size;	//number(10,0)
	private String rep_desc;	//varchar2(200 byte)
	private Short rep_be_used;	//number(1,0)
	private Short rep_is_full;	//number(1,0)
	private String rep_area;	//varchar2(20 byte)
	private BigDecimal rep_rent_price;	//number(10,0)
	public Long getRep_id() {
		return rep_id;
	}
	public void setRep_id(Long rep_id) {
		this.rep_id = rep_id;
	}
	public String getRep_name() {
		return rep_name;
	}
	public void setRep_name(String rep_name) {
		this.rep_name = rep_name;
	}
	public Integer getRep_type_id() {
		return rep_type_id;
	}
	public void setRep_type_id(Integer rep_type_id) {
		this.rep_type_id = rep_type_id;
	}
	public Long getRep_size() {
		return rep_size;
	}
	public void setRep_size(Long rep_size) {
		this.rep_size = rep_size;
	}
	public String getRep_desc() {
		return rep_desc;
	}
	public void setRep_desc(String rep_desc) {
		this.rep_desc = rep_desc;
	}
	public Short getRep_be_used() {
		return rep_be_used;
	}
	public void setRep_be_used(Short rep_be_used) {
		this.rep_be_used = rep_be_used;
	}
	public Short getRep_is_full() {
		return rep_is_full;
	}
	public void setRep_is_full(Short rep_is_full) {
		this.rep_is_full = rep_is_full;
	}
	public String getRep_area() {
		return rep_area;
	}
	public void setRep_area(String rep_area) {
		this.rep_area = rep_area;
	}
	public BigDecimal getRep_rent_price() {
		return rep_rent_price;
	}
	public void setRep_rent_price(BigDecimal rep_rent_price) {
		this.rep_rent_price = rep_rent_price;
	}
	
	

}
