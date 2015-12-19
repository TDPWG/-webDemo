package dao;

import java.util.List;

import pojo.PositionPojo;

public interface PosManagerDao {

	public void  addPosition(PositionPojo pos);
	public void  deletePosition(Long pos_id);
	public void  updatePosition(PositionPojo pos);
	public PositionPojo getPositionById(Long pos_id);
	public List  getPostionByDep(Long dep_id); 
	public List  geAlltPositions();
}
