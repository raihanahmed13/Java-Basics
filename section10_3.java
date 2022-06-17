//continue statement in loops

import java.util.Scanner;

class section10_3 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter the value: ");
            n=sc.nextInt();
           
            if(n==5)
            {
                continue;
            }
           
            System.out.println(n);
            if(n==5)
            {
                break;
            }
           

        }

        sc.close();
        
    }

}