import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();             // Read number of elements
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {     // Read array elements
            arr[i] = sc.nextInt();
        }

        int min = arr[0];                 // Assume first element is min
        for (int i = 1; i < n; i++) {     // Loop to find actual min
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);          // Prints the minimum element
    }
}
