//Comparing strings

class section6_1
{
    public static void main(String args[])
    {
        /*String a = "Java";
        String b = "Java";
        String c = "Python";

        boolean result = a.equals(b);
        System.out.println("String a and b are equal: "+result);
        boolean result2 = b.equals(c);
        System.out.println("String b and c are equal: "+result2);
        */

        String a = new String("Java Programming");
        System.out.println(a.replace('J','j')); //replacement is done only to print but the actual string will be same 
        System.out.println(a.substring(0,4));
        boolean result = a.contains("Java");
        System.out.println(result);
        System.out.println(a);





    }

}