//Cable company billing

import java.util.Scanner;

class cable_company {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 6-digit customer account number: ");
        int ac = sc.nextInt();

        System.out.println("Customer codes: B/b for Business customer and R/r for Residential customer");

        System.out.print("Enter customer code: ");
        char c = sc.next().charAt(0);
        int pc;
        float bill;
        if (c == 'R' || c == 'r') {
            System.out.print("Enter the number of Premium channels: ");
            pc = sc.nextInt();
            bill = (pc * 7.50f) + 4.50f + 20.50f;
            System.out.println("Billing Details: ");
            System.out.println("Account number: " + ac);
            System.out.println("Bill Amount: $ " + bill);

        }

        else if (c == 'B' || c == 'b') {
            System.out.print("Enter number of connections: ");
            int con = sc.nextInt();
            System.out.print("Enter the number of Premium channels: ");
            pc = sc.nextInt();
            if (con <= 10) {
                bill = 15.00f + 75.50f * con + (50.00f * pc);
                System.out.println("Billing Details: ");
                System.out.println("Account number: " + ac);
                System.out.println("Bill Amount: $ " + bill);
            } else {
                bill = 15.00f + 75.00f * con + 5 * (con - 10) + (50.00f * pc);
                System.out.println("Billing Details: ");
                System.out.println("Account number: " + ac);
                System.out.println("Bill Amount: $ " + bill);
            }
        } else {
            System.out.print("Enter a valid customer code!!");
        }

        sc.close();

    }
}