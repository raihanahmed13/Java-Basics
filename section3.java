import java.util.Scanner;

class section3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String s = sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your CGPA: ");
		float cgpa = sc.nextFloat();
		
		System.out.println("Name: "+s);
		System.out.println("Age: "+age);
		System.out.println("CGPA: "+cgpa);
		
		sc.close();
	}
}