import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] listeners = new int[N];
        for (int i = 0; i < N; i++) listeners[i] = sc.nextInt();
        int M = sc.nextInt();
        int[] towers = new int[M];
        for (int i = 0; i < M; i++) towers[i] = sc.nextInt();
        Arrays.sort(listeners);
        Arrays.sort(towers);
        int i = 0, j = 0, ans = 0;
        while (i < N) {
            while (j < M - 1 && Math.abs(towers[j + 1] - listeners[i]) <= Math.abs(towers[j] - listeners[i])) j++;
            ans = Math.max(ans, Math.abs(towers[j] - listeners[i]));
            i++;
        }
        System.out.println(ans);
    }
}
