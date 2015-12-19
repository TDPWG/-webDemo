package action;

import intercepter.Page;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import service.UserManagerService;
import vo.UserManagerVo;

import com.opensymphony.xwork2.ModelDriven;

public class UserManagerAction extends BaseAction implements ModelDriven<UserManagerVo> {

	private static final long serialVersionUID = 6673732137802043529L;

	private UserManagerVo  userManagerVo=new UserManagerVo();
	

	public UserManagerVo getUserManagerVo() {
		return userManagerVo;
	}
	
	public void setUserManagerVo(UserManagerVo userManagerVo) {
		this.userManagerVo = userManagerVo;
	}

	
	@Autowired
	private UserManagerService  userManagerService  ;

	public String getCustInfoList() {
		try{
		if(this.pagination==null){			
			pagination=new Page(1L,15L);
		}
		userManagerVo.setPage(pagination);
		@SuppressWarnings("rawtypes")
		List list= userManagerService.getCustInfoList(userManagerVo);
		this.formatData(list);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData("[]");
		}
		return SUCCESS;
	}


	public String getCustomerById() {
		try{
			userManagerVo=userManagerService.getCustomerById(userManagerVo.getUser_id());
			this.formatData(userManagerVo);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData("");
		}
		
		return SUCCESS;
	}


	public String addCustomer() {
		try{
			userManagerService.addCustomer(userManagerVo);
			this.formatData(true);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData(false);
		}
		return SUCCESS;
	}


	public String deleteCustomerById() {
		try{
			userManagerService.deleteCustomerById(userManagerVo.getUser_id());
			this.formatData(true);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData(false);
		}
		return SUCCESS;
	}


	public String updateCustomer() {
		try{
			userManagerService.updateCustomer(userManagerVo);
			this.formatData(true);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData(false);
		}
		return SUCCESS;
	}


	public String getEmpInfoList( ) {
		try{
			@SuppressWarnings("rawtypes")
			List list=userManagerService.getEmpInfoList(userManagerVo);
			this.formatData(list);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData("[]");
		}
		return SUCCESS;
	}


	public String getEmpById() {
		try{
			userManagerVo=userManagerService.getEmpById(userManagerVo.getUser_id());
			this.formatData(userManagerVo);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData("");
		}
		return SUCCESS;
	}


	public String addEmp( ) {
		try{
			userManagerService.addEmp(userManagerVo);
			this.formatData(true);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData(false);
		}
		return SUCCESS;
	}


	public String deleteEmpById( ) {
		try{
			userManagerService.deleteEmpById(userManagerVo.getUser_id());
			this.formatData(true);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData(false);
		}
		return SUCCESS;
	}


	public String updateEmp() {
		try{
			userManagerService.updateEmp(userManagerVo);
			this.formatData(true);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData(false);
		}
		return SUCCESS;
	}


	public String updateUserPwd() {
		try{
			userManagerService.updateEmp(userManagerVo);
			this.formatData(true);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData(false);
		}
		return SUCCESS;
	}


	public String updateEmpSalaryByEmpId( ) {
		try{
			userManagerService.updateEmpSalaryByEmpId(userManagerVo);
			this.formatData(true);
		}catch(Exception e){
			e.printStackTrace();
			this.formatData(false);
		}
		return SUCCESS;
	}


	@Override
	public UserManagerVo getModel() {
		return userManagerVo;
	}
	
}
