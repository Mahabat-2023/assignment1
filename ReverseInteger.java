public class ReverseInteger {
    public static void printReversal(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }
        System.out.print(n % 10);
        printReversal(n / 10);
    }

    public static void main(String[] args) {
        int testNumber = 12345;
        printReversal(testNumber);
        System.out.println();
    }
}
