package person;

public class Employee extends Person, PersonInterface{
	
	protected int employeeId;
	protected double employeeSalary;
	public double totalSalary;
	
	Employee(String name, char gender, int age, int employeeId, double employeeSalary, Address addr){
		super(name, gender,  age);
		super.createAddress(addr.streetName, addr.houseNumber, addr.zipcode, addr.city, addr.state);
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
	}
	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	public double getTotalSalary() {
		return totalSalary;
	}
	public int getEarnHoliday() {
		return earnHoliday;
	}
	public double calculate(int count) {
		
	}
	
	public void showAddress(String address) {
		
	}
	public void setEarnHoliday(int numberOfWeekWorked) {
		
		this.earnHoliday = numberOfWeekWorked/7; //for every week the employee earn one day holiday
	}

	private int earnHoliday;
	
	public Employee(String pname,char pGender,int pAge, int id, double salary) {
		super(pname, pGender, pAge);
		this.employeeId = id;
		this.employeeSalary = salary;
	}
	
	public double totalsalary(double rate) {
		return this.employeeSalary*(1 + rate);
	}
	
	public void display() {
		System.out.printf("%d ", this.employeeId);
		super.display();
		System.out.printf("earn holiday : %d days", this.earnHoliday);
		System.out.printf("Salary: %0.3f", this.totalSalary);
	}
}
