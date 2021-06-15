package person;

public class Person {

	static int count=0;
	protected int pAge;
	protected char pGender;
	protected String pname;
	private Address address;
	
	public Person() {
		count++;
	}
	public Person(String name, char gender, int age) {
		this.pAge = age;
		this.pname = name;
		this.pGender = gender;
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
