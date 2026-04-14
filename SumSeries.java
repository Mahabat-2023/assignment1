public class SumSeries {
    public static double sum1(int i) {
        if (i <= 1) return 1.0;
        return 1.0 / i + sum1(i - 1);
    }

    public static double sum2(int i) {
        if (i <= 1) return 1.0 / 3.0;
        return (double) i / (2 * i + 1) + sum2(i - 1);
    }

    public static double sum3(int i) {
        if (i <= 1) return 1.0 / 2.0;
        return (double) i / (i + 1) + sum3(i - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum1(5): " + sum1(n));
        System.out.println("Sum2(5): " + sum2(n));
        System.out.println("Sum3(5): " + sum3(n));
    }
}
