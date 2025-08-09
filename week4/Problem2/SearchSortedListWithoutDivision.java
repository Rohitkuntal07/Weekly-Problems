import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        int low = 0;
        int high = N - 1;
        boolean found = false;

        while (low <= high) {
            int diff = high - low;
            int half = 0;
            int temp = diff;
            while (temp >= 2) {
                temp -= 2;
                half++;
            }
            int mid = low + half;
            if (arr[mid] == x) {
                found = true;
                break;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println(found);
    }
}
