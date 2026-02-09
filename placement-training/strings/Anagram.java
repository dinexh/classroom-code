import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] a = s1.toLowerCase().toCharArray();
        char[] b = s2.toLowerCase().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String[][] pairs = {{"listen", "silent"}, {"hello", "world"}, {"anagram", "nagaram"}};
        for (String[] p : pairs)
            System.out.println(p[0] + " & " + p[1] + " are anagrams: " + isAnagram(p[0], p[1]));
    }
}
