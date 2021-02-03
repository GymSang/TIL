package test.encapsulation;

public class Member {
    private String name;
    private String address;
    private String phone;
    private String email;
    private String hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; //유효성 검사 
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address; //유효성 검사 
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone; //유효성 검사 
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email; //유효성 검사 
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby; //유효성 검사 
	}
    
}
//source generate setter and getter
//반드시 set method는 모두 유효성 검사를