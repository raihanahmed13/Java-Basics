//Switch case2
import java.util.Scanner;

class section9_2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the month: ");
        String s = sc.nextLine();

        switch (s) 
        {
            case "January":
            System.out.print("First Month");
            break;

            case "February":
            System.out.print("Second Month");
            break;

            case "March":
            System.out.print("Third Month");
            break;

            case "April":
            System.out.print("Fourth Month");
            break;

            case "May":
            System.out.print("Fifth Month");
            break;

            case "June":
            System.out.print("Sixth Month");
            break;

            case "July":
            System.out.print("Seventh Month");
            break;
            
            case "August":
            System.out.print("Eigth Month");
            break;

            case "September":
            System.out.print("Nine Month");
            break;

            case "October":
            System.out.print("Tenth Month");
            break;
            
            case "November":
            System.out.print("Eleventh Month");
            break;

            case "December":
            System.out.print("Twelvth Month");
            break;

            default :
            System.out.print("Enter a valid month!!");
            

        }

        sc.close();
    }
}