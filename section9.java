//Nested if-else

class section9 {
    public static void main(String args[]) {
        int a = -5, b = 2, c = 10, d = -1;

        if (b > 0) {
            if (c > 5) {
                System.out.print("This is first if block");
            }

            else {
                System.out.print("This is first else block");
            }
        }

        else {
            if (a > d) {
                System.out.print("a is greater");
            } 
            else {
                System.out.print("d is greater");
            }
        }

    }
}