package bytedance0809;

/**
 * @author wangyao2221
 * @date 2020/8/9 18:54
 */
public class Main2 {
    public static void main(String[] args) {
        System.out.println(fun(5, new int[]{1,2,3,4,5}));
    }

    public static long fun(int n, int[] arr) {
        int[] arr1 = new int[n - 1];
        int[] arr2 = new int[n - 1];

        int sign = 1;
        for (int i = 1; i < n; i++) {
            arr1[i - 1] = arr[i] * sign * -1;
            arr2[i - 1] = arr[i] * sign;
            sign = -sign;
        }


        // 计算从第二位开始- + - +的序列结果
        long max1 = Long.MIN_VALUE;
        int startIndex = 1;
        int flag = 1;
        long tmp = 0;
        for (int i = 0; i < arr1.length; i++) {
            tmp += arr1[i];
            if (tmp > max1) {
                max1 = tmp;
                flag = startIndex;
            }
            if (tmp < 0) {
                tmp = 0;
                startIndex = i + 2;
            }
        }

        // 计算从第二位开始+ - + -的序列结果
        long max2 = Long.MIN_VALUE;
        tmp = 0;
        for (int i = 0; i < arr2.length; i++) {
            tmp += arr2[i];
            if (tmp > max2) {
                max2 = tmp;
            }
            if (tmp < 0) {
                tmp = 0;
            }
        }

        if (arr[0] > 0 && flag == 1) {
            max1 += arr[0];
        }
        
        return max1 > max2 ? max1 : max2;
    }

    /**
     * 1 2 3 4 5
     * 可以把它转换成子序列和最大的问题
     * 也就是转换成 -2 3 -4 5的最大和max1、2 -3 4 -5的最大和max2
     * 并且需要标记-2 3 -4 5的最大和是否是从-2开始，如果是并且第一位>0，则要把第一位给加上重新赋值给max1
     * 最后比较max1和max2中更大的那个值
     * @param n
     * @param arr
     * @return
     */
    public static long fun_(int n, int[] arr) {
        if (n == 1) return arr[0];

        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long tmp1 = 0;
        long tmp2 = 0;

        int sign = 1;
        int flag = 0;
        int startIndex = 1; // 标记最大值序列是否从1开始
        for (int i = 1; i < n; i++) {
            tmp1 -= sign * arr[i];
            if (tmp1 > max1) {
                flag = startIndex;
                max1 = tmp1;
            }
            if (tmp1 < 0) {
                tmp1 = 0;
                startIndex = i + 1;
            }

            tmp2 += sign * arr[i];
            if (tmp2 > max2) max2 = tmp2;
            if (tmp2 < 0) {
                tmp2 = 0;
            }

            sign = -sign;
        }

        if (arr[0] > 0 && flag == 1) {
            max1 += arr[0];
        }

        return max1 > max2 ? max1 : max2;
    }
}
