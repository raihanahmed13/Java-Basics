//loops

import java.util.Scanner;

class section10
{
    public static void main(String args[]) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        while(n>=0) //true 10>0 true 
        {
            sum+=n; // 5 // 15 25
            System.out.println("Enter the value:");
            n=sc.nextInt(); //10 //10 -5
            
        }
        System.out.print("Sum is :" +sum);

        sc.close();
    }
   
}