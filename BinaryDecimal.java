public class BinaryDecimal {
    public static int bin2dec(String s) {
        if (s.isEmpty()) return 0;
        int lastBit = (s.charAt(s.length() - 1) == '1') ? 1 : 0;
        return bin2dec(s.substring(0, s.length() - 1)) * 2 + lastBit;
    }

    public static void main(String[] args) {
        String binary = "1010";
        System.out.println(bin2dec(binary));
    }
}
