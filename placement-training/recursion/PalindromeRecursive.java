public class PalindromeRecursive {
    public static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String[] words = {"radar", "hello", "level", "world", "madam"};
        for (String w : words)
            System.out.println(w + " is palindrome: " + isPalindrome(w, 0, w.length() - 1));
    }
}
