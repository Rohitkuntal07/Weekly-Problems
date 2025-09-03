import java.util.*;

public class Main {
    public static String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        for (String w : s.split("[^a-z]+")) {
            if (!w.isEmpty()) words.add(w);
        }
        Collections.reverse(words);
        StringBuilder result = new StringBuilder();
        int index = 0;
        StringBuilder word = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                word.append(c);
            } else {
                if (word.length() > 0) {
                    result.append(words.get(index++));
                    word.setLength(0);
                }
                result.append(c);
            }
        }
        if (word.length() > 0) result.append(words.get(index));
        return result.toString();
    }
}
