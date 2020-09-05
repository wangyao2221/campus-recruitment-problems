package shell0811;

/**
 * @author wangyao2221
 * @date 2020/8/11 19:08
 */
public class Main3 {
    /**
     * 滑动窗口
     * @param args
     */
    public static void main(String[] args) {
//        int x = 1000000000;
//        int y = 1000000000;
//        System.out.println(Math.sqrt(x * y));
//        System.out.println(fun(3, new int[]{1,2,3}));
        System.out.println((byte)10);
    }

    public static int fun(int n, int[] arr) {
        int minLen = Integer.MAX_VALUE;
        int maxValue = 0;

        for (int i = 0; i < arr.length; i++) {
            maxValue |= arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int orResult = arr[i];
            for (int j = i; j < arr.length; j++) {
                orResult = orResult | arr[j];
                if (orResult == maxValue && j - i + 1 < minLen) {
                    minLen = j - i + 1;
                    break;
                }
            }
        }

        return minLen;
    }

    public static int fun_(int n, int[] arr) {
        int minLen = n;
        char[][] binaryString = new char[n][];

        for (int i = 0; i < n; i++) {
            binaryString[i] = Integer.toBinaryString(arr[i]).toCharArray();
        }

        

        return 0;
    }
}
