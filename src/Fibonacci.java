public class Fibonacci {
    public static int fibonacci (int n) {
        //Base Case
        if (n == 1 || n == 0)
            return n;
        else return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
