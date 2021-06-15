package person;
import java.util.Scanner;

public class Starter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
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
		String streetName = scan.nextLine();
		scan.next();
		System.out.println("Enter House number: ");
		int houseNumber = scan.nextInt();
		System.out.println("Enter State: ");
		String state = scan.nextLine();
		System.out.println(state);
		scan.next();
		
		System.out.println("Enter city: ");
		String city = scan.nextLine();
		scan.next();
		System.out.println("Enter zipcode: ");
		int zipcode = scan.nextInt();
		scan.close();
		
		//creating employee
		
		Employee emp1 = new Employee(emp1Id, emp1Name, emp1Gender, emp1Age, emp1Salary);
		emp1.createAddress(streetName, houseNumber, zipcode, city, state);
		emp1.display();
	}

}
