import java.util.*;

public class FriendGroups {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();         
        Map<Integer, List<Integer>> friendship = new HashMap<>();
        for (int i = 0; i < N; i++) {
            friendship.put(i, new ArrayList<>());
        }
        for (int i = 0; i < N; i++) {
            String line = sc.nextLine().trim();
            if (!line.equals("-1") && !line.isEmpty()) {
                String[] parts = line.split(" ");
                for (String p : parts) {
                    friendship.get(i).add(Integer.parseInt(p));
                }
            }
        }

        boolean[] visited = new boolean[N];
        int groups = 0;

        for (int student = 0; student < N; student++) {
            if (!visited[student]) {
                Queue<Integer> queue = new LinkedList<>();
                queue.add(student);
                visited[student] = true;

                while (!queue.isEmpty()) {
                    int current = queue.poll();
                    for (int friend : friendship.get(current)) {
                        if (!visited[friend]) {
                            visited[friend] = true;
                            queue.add(friend);
                        }
                    }
                }
                groups++;
            }
        }

        System.out.println(groups);
    }
}
