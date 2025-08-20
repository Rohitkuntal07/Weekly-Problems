public class MisereNim {
    public static boolean hasForcedWin(int[] heaps) {
        boolean allOnes = true;
        for (int h : heaps) {
            if (h != 1) {
                allOnes = false;
                break;
            }
        }
        if (allOnes) {
            return heaps.length % 2 == 0;
        }
        int xor = 0;
        for (int h : heaps) {
            xor ^= h;
        }
        return xor != 0;
    }
