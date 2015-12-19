package pojo;

public class ProductTypePojo {
	private Integer pro_type_id;	//number(5,0)
	private String pro_type_name;	//varchar2(30 byte)
	private String pro_type_desc;	//varchar2(200 byte)
	public Integer getPro_type_id() {
		return pro_type_id;
	}
	public void setPro_type_id(Integer pro_type_id) {
		this.pro_type_id = pro_type_id;
	}
	public String getPro_type_name() {
		return pro_type_name;
	}
	public void setPro_type_name(String pro_type_name) {
		this.pro_type_name = pro_type_name;
	}
	public String getPro_type_desc() {
		return pro_type_desc;
	}
	public void setPro_type_desc(String pro_type_desc) {
		this.pro_type_desc = pro_type_desc;
	}

}
