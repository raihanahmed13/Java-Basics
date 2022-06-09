//Charity through movie tickets

import java.util.Scanner;

class charity
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter movie name: ");
        String mn = s.nextLine();

        System.out.println("Price of Adult ticket?");
        int ap = s.nextInt();
        System.out.println("Price of Child ticket?");
        int cp = s.nextInt();

        System.out.println("No. of adult tickets sold?");
        int as = s.nextInt();
        System.out.println("No. of child tickets sold?");
        int cs = s.nextInt();

        System.out.println("Percentage of donation?");
        float p = s.nextFloat();

        float GA = (ap*as) + (cp*cs);
        float AD = (GA*p)/100;
        float NS = GA-AD;

        System.out.println("\n");

        System.out.println("Movie Name: "+mn);
        System.out.println("Number of tickets sold: "+(as+cs));
        System.out.println("Gross Amount: Rs "+GA);
        System.out.println("Percentage of Gross Amount donated: "+p+"%");
        System.out.println("Amount Donated: Rs "+AD);
        System.out.println("Net Sale: Rs "+NS);

        s.close();


    }

    
}