package j09_접근지정자.b;

public class Teacher {
	private String name;
	private String address;
	private String phone;
	
	// 알트 + shift + s
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void showInfo() {
		String _address = createMassage(name, address);
		String _phone = createMassage(name, phone);
		
		System.out.println(_address);
		System.out.println(_phone);
	}
	// 캡슐화 방식
	private String createMassage(String name, String value) {
		return name + "님: " + value;
		
		
	}
}
