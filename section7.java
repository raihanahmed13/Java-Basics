//join string method

class section7 {
    public static void main(String srgs[]) {
        String s1 = "JAVA";
        String s2 = "Programming";
        String s3 = "is very easy";
        String str = String.join("-", s1, s2, s3); // JAVA-Programming-is very easy
        System.out.println(str);

        // replaceAll

        System.out.println(s3.replaceAll("y", "i"));

        // replaceFirst

        String s4 = "xxyybbyyxx";
        System.out.println(s4.replaceFirst("xx", "tt"));

        // charAT

        String s5 = "HelloWorld";
        System.out.println(s5.charAt(5)); // W

        // indexOf

        String s6 = "Hello-Java";
        System.out.println(s6.indexOf('o')); // 4
        System.out.println(s6.indexOf("Java")); // 6

        // compareTo

        String s7 = "Java";
        String s8 = "java";

        System.out.println(s7.compareTo(s8));

        // toLowerCase and toUpperCase

        String s9 = "JaVa pRograMMing";
        System.out.println(s9.toLowerCase());
        System.out.println(s9.toUpperCase());

        //Split method

        String str2 = "Welcome to learn Java Programming";
        String[] str3 = str2.split(" ");
        System.out.println("String = ");
        for (String str4:str3)
        {
            System.out.print(str4+",");
        } 

    

    }
}