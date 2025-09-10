import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String[] dict = new String[N];
        for (int i = 0; i < N; i++) {
            dict[i] = sc.next();
        }
        String prefix = sc.next();

        List<String> result = new ArrayList<>();
        for (String word : dict) {
            if (word.startsWith(prefix)) {
                result.add(word);
            }
        }

        for (String word : result) {
            System.out.print(word + " ");
        }
    }
}
