package history.P0927;

import java.util.Arrays;

/**
 * @author wangyao2221
 * @date 2020/9/25 11:36
 */
public class Huawei02 {
    public static void main(String[] args) {
        int[] arr = {0,0,5,9,2,3};
        maxTime(arr);
    }

    public static void maxTime(int[] arr) {
        int[] flags = new int[arr.length];
        Arrays.fill(flags, 0);
        Arrays.sort(arr);

        int index = arr.length - 1;
        int timeIndex = 1;
        int[] result = new int[7];
        while (index >= 0) {
            if (flags[index] == 0) {
                if (timeIndex == 1 && arr[index] <= 2) {
                    result[timeIndex++] = arr[index];
                    flags[index] = 1;
                    index = arr.length - 1;
                } else if (timeIndex == 2) {
                    if (result[0] == 1) {
                        result[timeIndex] = arr[index];
                        flags[index] = 1;
                        index = arr.length - 1;
                    } else if (result[0] == 2 && arr[index] <= 4){
                        result[timeIndex++] = arr[index];
                        flags[index] = 1;
                        index = arr.length - 1;
                    }
                } else if ((timeIndex == 3 || timeIndex == 5) && arr[index] <= 5) {
                    result[timeIndex++] = arr[index];
                    flags[index] = 1;
                    index = arr.length - 1;
                } else if (timeIndex == 4 || timeIndex == 6) {
                    result[timeIndex++] = arr[index];
                    flags[index] = 1;
                    index = arr.length - 1;
                }
            }
        }

        System.out.println(Arrays.toString(result));
    }

    public static void check(int timeIndex, int num) {

    }
}
