public class PalindromeString {
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"radar", "hello", "level", "world", "madam", "racecar"};
        for (String w : words)
            System.out.println(w + " is palindrome: " + isPalindrome(w));
    }
}
