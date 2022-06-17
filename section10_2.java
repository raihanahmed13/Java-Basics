//break statement in loops

import java.util.Scanner;

class section10_2 {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter the value: ");
            n=sc.nextInt();
            if(n<0)
            {
                break;
            }
        }
        System.out.print("While loop has been ended ");

        sc.close();
    }

}