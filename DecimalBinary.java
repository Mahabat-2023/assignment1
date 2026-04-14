public class DecimalBinary {
    public static String dec2bin(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return dec2bin(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int decimal = 10;
        System.out.println(dec2bin(decimal));
    }
}
