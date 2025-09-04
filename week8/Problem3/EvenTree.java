import java.util.*;

class Solution {
    static List<List<Integer>> graph;
    static int removableEdges;

    static int dfs(int node, int parent) {
        int size = 1;
        for (int child : graph.get(node)) {
            if (child != parent) {
                int subtree = dfs(child, node);
                if (subtree % 2 == 0) removableEdges++;
                else size += subtree;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) graph.add(new ArrayList<>());
        for (int i = 0; i < n - 1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        removableEdges = 0;
        dfs(1, -1);
        System.out.println(removableEdges);
    }
}
