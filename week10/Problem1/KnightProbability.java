import java.util.Scanner;

public class KnightProbability {
    static final int N = 8;
    static final int[][] MOVES = {
        {2,1}, {1,2}, {-1,2}, {-2,1},
        {-2,-1}, {-1,-2}, {1,-2}, {2,-1}
    };

    public static double knightProbability(int r, int c, int k) {
        double[][] curr = new double[N][N];
        curr[r][c] = 1.0;

        for (int step = 0; step < k; step++) {
            double[][] next = new double[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    double p = curr[i][j];
                    if (p == 0.0) continue;
                    double share = p / 8.0;
                    for (int[] mv : MOVES) {
                        int ni = i + mv[0];
                        int nj = j + mv[1];
                        if (ni >= 0 && ni < N && nj >= 0 && nj < N) {
                            next[ni][nj] += share;
                        }
                    }
                }
            }
            curr = next;
        }

        double total = 0.0;
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                total += curr[i][j];
        return total;
    }
}
