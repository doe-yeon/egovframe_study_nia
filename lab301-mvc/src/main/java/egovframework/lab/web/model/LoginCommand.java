package egovframework.lab.web.model;

public class LoginCommand {

	// TODO [Step 1-2-3] 커맨드 객체 완성하기
	private String id;
	private String password;
	private String loginType;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginType() {
		return loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}


}