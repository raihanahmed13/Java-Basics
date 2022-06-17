//Conditional statements (if-else)

import java.util.Scanner;

class section8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        if (a<20)
        {
            System.out.println("This is  if block");
        }
        else if(a==30)
        {
            System.out.println("This is else-if block");
        }
        else if(a>20 && a<30)
        {
            System.out.println("This is the nested else-if 2 block");
        }
        else
        {
            System.out.println("This is else block");
        }

        sc.close();

    }
}