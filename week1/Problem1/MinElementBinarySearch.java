import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();             // Read size of array
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {     // Read array elements
            arr[i] = sc.nextInt();
        }

        int low = 0;
        int high = n - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > arr[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        System.out.println(arr[low]);     // Print the minimum element
    }
}
