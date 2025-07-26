import java.util.*;

public class SmallestNonRepresentableSum {
    public static int findSmallestNonRepresentable(int[] arr) {
        int res = 1;

        for (int value : arr) {
            if (value > res) {
                break;
            }
            res += value;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().trim().split("\\s+");
        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(findSmallestNonRepresentable(arr));
    }
}
