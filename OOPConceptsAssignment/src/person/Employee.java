package person;

public class Employee extends Person implements PersonInterface {

	protected int employeeId;
	protected double employeeSalary;
	public double totalSalary;
	public int earnHolidays;
	
	Employee(int employeeId, String name, char gender, int age, double employeeSalary, Address addr){
		super(name, gender,  age);
		//super.createAddress(addr.streetName, addr.houseNumber, addr.zipcode, addr.city, addr.state);
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}
	
	public void setTotalSalary() {
		this.totalSalary = this.employeeSalary;
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public int getEarnHoliday() {
		return earnHoliday;
	}
	public double calculate(int count) {
		return count/7;
	}
	
	public void showAddress(Address address) {
		System.out.printf("%d %s %s %s %d",address.houseNumber, address.streetName, address.city, address.state, address.zipcode);
	}
	public void setEarnHoliday(int numberOfWeekWorked) {
		
		this.earnHoliday = (int) Math.ceil(this.calculate(numberOfWeekWorked)); //for every week the employee earn one day holiday
	}

	private int earnHoliday;
	
	public Employee(int id, String pname,char pGender,int pAge, double salary) {
		super(pname, pGender, pAge);
		this.employeeId = id;
		this.employeeSalary = salary;
	}
	
	public void setTotalSalary(double rate) {
		this.totalSalary=this.employeeSalary*(1 + rate);
	}
	
	public void display() {
		System.out.printf("EmployeeId: %d ", this.employeeId);
		System.out.println("");
		super.display();
		System.out.println("");
		System.out.printf("earn holiday: %d days", this.getEarnHoliday());
		System.out.println("");
		System.out.printf("Salary: %f", this.getTotalSalary());
	}
}
