package lee.mj.model;

public class User {
	private int id;
	private String login;
	private String password;
	private String phone;
	private String email;
	private String address;
	private String username;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	//-------------------------------------
	public boolean signIn(String login, String password) {
		System.out.println(login+"님이 로그인 했습니다.");
		return password.equals(this.password);
	}
	public boolean signOut(String login) {
		System.out.println(login+"님이 로그아웃 했습니다.");
		return false;
	}
	public User signUp(User user) {
		return user;
	}
	public boolean edit(User user) {
		return false;
	}
}
