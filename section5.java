//Assignment Operator

import java.util.Scanner;
class section5
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the value of a: ");

		int a = s.nextInt();
		a+=5;  //a=a+5
		a-=2;  //a=a-2
		a*=5;  //a=a*5
		a/=2;   //a=a/2
		a%=3;   //a=a%3;

		System.out.println("After all operation--");

		System.out.println("a = "+a);

		s.close();

		
		
	}
}