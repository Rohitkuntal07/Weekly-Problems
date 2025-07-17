import java.util.*;

public class SubArraySumKbruteForce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();         // number of days
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();   // calories burned
        }

        int k = sc.nextInt();         // target
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum += nums[l];
                }
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
