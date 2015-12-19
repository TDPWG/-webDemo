package pojo;

import java.math.BigDecimal;

public class ProductsPojo {
	private Long pro_id;	//number(10,0)
	private String pro_name;	//varchar2(30 byte)
	private Integer pro_type_id;	//number(5,0)
	private Long cust_id;	//number(10,0)
	private BigDecimal pro_price;	//number(12,0)
	private BigDecimal pro_count;	//number(15,0)
	private Long manu_id;
	public Long getPro_id() {
		return pro_id;
	}
	public void setPro_id(Long pro_id) {
		this.pro_id = pro_id;
	}
	public Long getCust_id() {
		return cust_id;
	}
	public void setCust_id(Long cust_id) {
		this.cust_id = cust_id;
	}
	public BigDecimal getPro_price() {
		return pro_price;
	}
	public void setPro_price(BigDecimal pro_price) {
		this.pro_price = pro_price;
	}
	public BigDecimal getPro_count() {
		return pro_count;
	}
	public void setPro_count(BigDecimal pro_count) {
		this.pro_count = pro_count;
	}
	public Long getManu_id() {
		return manu_id;
	}
	public void setManu_id(Long manu_id) {
		this.manu_id = manu_id;
	}	//number(10,0)
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public Integer getPro_type_id() {
		return pro_type_id;
	}
	public void setPro_type_id(Integer pro_type_id) {
		this.pro_type_id = pro_type_id;
	}

}
