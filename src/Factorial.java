public class Factorial {
    public static int factorial(int n) {
        //Base Case
        if (n > 0) {
            if (n == 1)
                return 1;
                //Recalls itself (method)
            else return n * factorial(n - 1);
        }
        else {
            System.out.println("Not defined for numbers < 1");
            return -1;
        }
    }

    public static void main(String[] args) {
        int n1 = 10, n2 = 4, n3 = 6;

        System.out.println(n1 + " Factorial is = " + factorial(n1));
    }
}
