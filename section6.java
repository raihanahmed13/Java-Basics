//Strings

class section6
{
    public static void main(String args[])
    {
        String a = "Raihan";
        String b = "Sahil";
        String c = "Raushan";

        System.out.println("This is the first name: "+a);
        System.out.println("This is the second name: "+b);
        System.out.println("This is the third name: "+c);

        int l =a.length();
        System.out.println("Length of first string: "+l);
        System.out.println("Length of the second string: "+b.length());
        System.out.println("Length of the third string: "+c.length());


        String firstname = "Java";
        String lastname = "Programming-";
        String fullname = lastname.concat(firstname);

        System.out.println("This is the fullname: "+fullname);



    }
}