public class Palindrome {
    public static boolean isPalindrome(String s) {
        // Base case: if string is empty or has 1 char, it's a palindrome
        if (s.length() <= 1) {
            return true;
        }
        // Check if first and last characters are the same
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        // Recursive call with the middle part of the string
        return isPalindrome(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        String word1 = "kazak";
        String word2 = "hello";

        // This will print the results to the console
        System.out.println("Is '" + word1 + "' a palindrome? " + isPalindrome(word1));
        System.out.println("Is '" + word2 + "' a palindrome? " + isPalindrome(word2));
    }
}
