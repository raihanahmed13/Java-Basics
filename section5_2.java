//Logical Operator

import java.util.Scanner;
class section5_2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int a= s.nextInt();
        int b = s.nextInt();

        System.out.println(a>5 || a<3);
        System.out.println(a>5 || a>3);
        System.out.println(a>15 || a>13);
        System.out.println(!(a>15 || a<3));
        System.out.println(!(a>15 || a>13));

        System.out.println(a>b && a>5);
        System.out.println(a<b && a>5);

        s.close();


    }
    
}