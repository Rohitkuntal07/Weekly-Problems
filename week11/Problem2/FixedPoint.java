import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int low = 0, high = n - 1, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == mid) {
                ans = mid;
                break;
            } else if (arr[mid] > mid) high = mid - 1;
            else low = mid + 1;
        }
        if (ans == -1) System.out.println("False");
        else System.out.println(ans);
    }
}
