package person;
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		/*System.out.println("Enter Name: ");
		String emp1Name = scan.nextLine();
		System.out.println("Enter Gender: ");
		char emp1Gender = scan.nextLine().charAt(0);
		System.out.println("Enter Age: ");
		int emp1Age = scan.nextInt();
		
		System.out.println("Enter Idnumber: ");
		int emp1Id = scan.nextInt();
		
		System.out.println("Enter Salary: ");
		double emp1Salary = scan.nextDouble();
		
		System.out.println("Enter Street Name: ");
		String streetName = scan.next();
		//scan.next();
		System.out.println("Enter House number: ");
		int houseNumber = scan.nextInt();
		System.out.println("Enter State: ");
		String state = scan.next();
		System.out.println(state);
		//scan.next();
		
		System.out.println("Enter city: ");
		String city = scan.next();
		//scan.next();
		System.out.println("Enter zipcode: ");
		int zipcode = scan.nextInt();
		
		
		//creating employee
		
		Employee emp1 = new Employee(emp1Id, emp1Name, emp1Gender, emp1Age, emp1Salary);
		emp1.createAddress(streetName, houseNumber, zipcode, city, state);
		System.out.println("How Week worked: ");
		int numOfWeeks = scan.nextInt();
		emp1.setEarnHoliday(numOfWeeks);
		System.out.println("Bonus rate: ");
		double Brate = scan.nextDouble();
		
		emp1.setTotalSalary(Brate);
		
		emp1.display();*/

	//working with Student class
	System.out.println("Enter student Id: ");
	int stud1Id = scan.nextInt();
	System.out.println("Enter student name: ");
	String stud1Name = scan.nextLine();
	System.out.println("Enter student gender(M/F): ");
	char stud1Gender = scan.nextLine().charAt(0);
	System.out.println("Enter student age: ");
	int stud1Age = scan.nextInt();
	System.out.println("What is grade for subject 1: ");
	double stud1Subject1 = scan.nextDouble();
	System.out.println("What is grade for subject 2: ");
	double stud1Subject2 = scan.nextDouble();
	System.out.println("What is grade for subject 3: ");
	double stud1Subject3 = scan.nextDouble();
	System.out.println("Major: ");
	String stud1Major = scan.next();
	
	//get address informations
	System.out.println("Enter House number: ");
	int stud1HouseNumber = scan.nextInt();
	System.out.println("Enter Street Name: ");
	String stud1StreetName = scan.next();
	//scan.next();
	System.out.println("Enter city: ");
	String stud1City = scan.next();
	System.out.println("Enter State: ");
	String stud1State = scan.next();
	//scan.next();
	//scan.next();
	System.out.println("Enter zipcode: ");
	int stud1Zipcode = scan.nextInt();
	
	
	//creating employee
	
	Student stud1 = new Student(stud1Id, stud1Name, stud1Gender, stud1Age, stud1Subject1, stud1Subject2, stud1Subject3, stud1Major);
	stud1.createAddress(stud1StreetName, stud1HouseNumber, stud1Zipcode, stud1City, stud1State);
	stud1.display();
	scan.close();
	}
}
