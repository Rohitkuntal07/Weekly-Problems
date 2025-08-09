import java.util.*;
public class FirstRecurringCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashSet<Character> seen = new HashSet<>();
        String result = null;

        for (char c : s.toCharArray()) {
            if (seen.contains(c)) {
                result = String.valueOf(c);
                break;
            }
            seen.add(c);
        }

        System.out.println(result);
    }
}
