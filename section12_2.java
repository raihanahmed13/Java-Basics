//Average 

import java.util.Scanner;

class section12_2
{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int n = sc.nextInt();
        int marks[] = new int[n];

        System.out.println("Enter marks: ");
        for(int i=0; i<n; i++)
        {
            marks[i]=sc.nextInt();

        }

        int sum = 0;
        double average;
        for(int i:marks)
        {
            sum=sum+i; //sum+=i;

        }

        average = (double)sum/(double)n;
        System.out.println("Sum of the marks: "+sum);
        System.out.println("Average: "+average);

        sc.close();

        
    }
}