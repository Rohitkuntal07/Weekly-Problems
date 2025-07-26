import java.util.*;

public class StepWordsFinder {
    public static List<String> findStepWords(String baseWord, List<String> dictionary) {
        List<String> result = new ArrayList<>();
        int[] baseFreq = getFrequency(baseWord);

        for (String word : dictionary) {
            if (word.length() != baseWord.length() + 1) continue;

            int[] wordFreq = getFrequency(word);
            int diff = 0;

            for (int i = 0; i < 26; i++) {
                if (wordFreq[i] < baseFreq[i]) {
                    diff = -1;
                    break;
                }
                diff += wordFreq[i] - baseFreq[i];
            }

            if (diff == 1) {
                result.add(word);
            }
        }

        Collections.sort(result);
        return result;
    }

    private static int[] getFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String baseWord = sc.nextLine().trim();
        int n = Integer.parseInt(sc.nextLine().trim());

        List<String> dictionary = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            dictionary.add(sc.nextLine().trim());
        }

        sc.close();

        List<String> stepWords = findStepWords(baseWord, dictionary);
        for (String word : stepWords) {
            System.out.println(word);
        }
    }
}
