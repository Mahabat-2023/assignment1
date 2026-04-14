public class Fibonacci {
    public static int count = 0;

    public static int fib(int n) {
        count++;
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;
        int result = fib(n);
        System.out.println("Fibonacci number at position " + n + " is: " + result);
        System.out.println("Total method calls: " + count);
    }
}
