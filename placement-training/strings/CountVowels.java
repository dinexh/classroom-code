public class CountVowels {
    public static int countVowels(String s) {
        int count = 0;
        for (char c : s.toLowerCase().toCharArray())
            if ("aeiou".indexOf(c) != -1) count++;
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"hello", "world", "programming", "java", "education"};
        for (String w : words)
            System.out.println(w + " has " + countVowels(w) + " vowels");
    }
}
