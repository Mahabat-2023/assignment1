public class ReverseString {
    public static String reverse(String s) {
        if (s.isEmpty()) return s;
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String test = "AITU";
        System.out.println(reverse(test));
    }
}
