// Using Prefix Sum + HashMap

import java.util.*;

public class SubArraySumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();         // number of days
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();   // calories burned per day
        }

        int k = sc.nextInt();         // target calories
        int sum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);                // base case

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}


