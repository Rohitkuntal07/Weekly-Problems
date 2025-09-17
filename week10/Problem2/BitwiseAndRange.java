public class BitwiseAndInRange {
    public static int rangeBitwiseAnd(int M, int N) {
        int shift = 0;
        while (M < N) {
            M >>= 1;
            N >>= 1;
            shift++;
        }
        return M << shift;
    }
}
