package person;

public class Person1 {

	private int pAge;
	private char pGender;
	private String pname;
	private Address address;
	public int getpAge() {
		return pAge;
	}
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	public char getpGender() {
		return pGender;
	}
	public void setpGender(char pGender) {
		this.pGender = pGender;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void createAddress(String streetName, int houseNumber, int zipcode, String city, String state) {
		Address addr = new Address();
		addr.houseNumber = houseNumber;
		addr.streetName = streetName;
		addr.city = city;
		addr.state = state;
		addr.zipcode = zipcode;
		
		this.address = addr;
	}
	public void display() {
		System.out.println(this.pname);
		System.out.printf("%d %s %s %s %d",address.houseNumber, address.streetName, address.city, address.state, address.zipcode);
	}
}
