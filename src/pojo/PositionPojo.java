package pojo;

public class PositionPojo {
	private Long pos_id;	//number(10,0)
	private String pos_name;	//varchar2(30 byte)
	private String pos_desc;	//varchar2(200 byte)
	public Long getPos_id() {
		return pos_id;
	}
	public void setPos_id(Long pos_id) {
		this.pos_id = pos_id;
	}
	public String getPos_name() {
		return pos_name;
	}
	public void setPos_name(String pos_name) {
		this.pos_name = pos_name;
	}
	public String getPos_desc() {
		return pos_desc;
	}
	public void setPos_desc(String pos_desc) {
		this.pos_desc = pos_desc;
	}

}
