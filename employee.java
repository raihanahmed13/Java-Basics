import java.util.Scanner;

class employee
{
public static void main(String args[])
{
	Scanner s = new Scanner(System.in);
	Scanner s1 = new Scanner(System.in);
	Scanner s2 = new Scanner(System.in);
	
	
	System.out.println("Enter name: ");
	String name = s.nextLine();
	System.out.println("Enter Age: ");
	int age = s.nextInt();
	
	System.out.println("Which Department: ");
	String dept = s1.nextLine();
	System.out.println("Enter your salary: ");
	float salary = s.nextFloat();
	System.out.println("Enter Email ID: ");
	String email = s2.nextLine();
	System.out.println("Enter your phone number: ");
	long phone = s.nextLong();
	
	System.out.println("Your details are: ");
	System.out.println("Name: "+name);
	System.out.println("Age: "+age);
	System.out.println("Department: "+dept);
	System.out.println("Salary: "+salary);
	System.out.println("EmaiId: "+email);
	System.out.println("Phone: "+phone);

	s.close();
	s1.close();
	s2.close();  

	
}
}

