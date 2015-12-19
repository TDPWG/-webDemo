package pojo;

public class RepositoryTypePojo {
	private Integer rep_type_id;	//number(5,0)
	private String rep_type_name;	//varchar2(30 byte)
	private String rep_type_desc;	//varchar2(200 byte)
	public Integer getRep_type_id() {
		return rep_type_id;
	}
	public void setRep_type_id(Integer rep_type_id) {
		this.rep_type_id = rep_type_id;
	}
	public String getRep_type_name() {
		return rep_type_name;
	}
	public void setRep_type_name(String rep_type_name) {
		this.rep_type_name = rep_type_name;
	}
	public String getRep_type_desc() {
		return rep_type_desc;
	}
	public void setRep_type_desc(String rep_type_desc) {
		this.rep_type_desc = rep_type_desc;
	}

}
