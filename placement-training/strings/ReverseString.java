public class ReverseString {
    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char t = chars[left];
            chars[left++] = chars[right];
            chars[right--] = t;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world", "java", "programming"};
        for (String w : words)
            System.out.println(w + " -> " + reverse(w));
    }
}
