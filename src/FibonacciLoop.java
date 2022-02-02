public class FibonacciLoop {
    static int fibonacci (int n){
        int ans = 0, temp = 1, temp2 = 0, i = 1;

        for (i = 1; i < n; i++) {
            ans = temp + temp2;
            temp2 = temp;
            temp = ans;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
