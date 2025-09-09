import java.util.*;

public class SwapBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      
        int result = ((n & 0xAA) >> 1) | ((n & 0x55) << 1);

        System.out.println(result);
    }
}
