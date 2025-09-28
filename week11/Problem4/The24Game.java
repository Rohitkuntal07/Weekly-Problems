import java.util.*;

public class Main {
    static final double EPS = 1e-6;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[4];
        for (int i = 0; i < 4; i++) nums[i] = sc.nextDouble();
        System.out.println(solve(nums) ? "true" : "false");
    }
    static boolean solve(double[] nums) {
        List<Double> list = new ArrayList<>();
        for (double n : nums) list.add(n);
        return backtrack(list);
    }
    static boolean backtrack(List<Double> nums) {
        if (nums.size() == 1) return Math.abs(nums.get(0) - 24) < EPS;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.size(); j++) {
                if (i == j) continue;
                List<Double> next = new ArrayList<>();
                for (int k = 0; k < nums.size(); k++) if (k != i && k != j) next.add(nums.get(k));
                for (double val : compute(nums.get(i), nums.get(j))) {
                    next.add(val);
                    if (backtrack(next)) return true;
                    next.remove(next.size() - 1);
                }
            }
        }
        return false;
    }
    static List<Double> compute(double a, double b) {
        List<Double> res = new ArrayList<>();
        res.add(a + b);
        res.add(a - b);
        res.add(b - a);
        res.add(a * b);
        if (Math.abs(b) > EPS) res.add(a / b);
        if (Math.abs(a) > EPS) res.add(b / a);
        return res;
    }
}
