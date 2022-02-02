public class FactorialLoop {
    static int factorial (int n) {
        int ans = 1;
        for (int i = n; i > 0; --i) {
            ans*=i;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
