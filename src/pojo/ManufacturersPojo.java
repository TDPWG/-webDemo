package pojo;

public class ManufacturersPojo {
	private Long manu_id;	//number(10,0)
	private String manu_name;	//varchar2(50 byte)
	public Long getManu_id() {
		return manu_id;
	}
	public void setManu_id(Long manu_id) {
		this.manu_id = manu_id;
	}
	public String getManu_name() {
		return manu_name;
	}
	public void setManu_name(String manu_name) {
		this.manu_name = manu_name;
	}

}
