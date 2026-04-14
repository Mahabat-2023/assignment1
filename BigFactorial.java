import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static BigInteger factorial(int n) {
        if (n <= 1) return BigInteger.ONE;
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        if (input.hasNextInt()) {
            int n = input.nextInt();
            System.out.println("Factorial of " + n + " is " + factorial(n));
        }
    }
}
