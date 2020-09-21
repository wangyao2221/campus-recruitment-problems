package history.netease0912.wy;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/12 16:50
 */
public class Main4 {
    static int max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] numStrs = line.split(" ");
        int[] nums = new int[numStrs.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(numStrs[i]);
        }

        dfs(nums, 0, nums.length,0);
        System.out.println(max);
    }

    public static void dfs(int[] nums ,int start, int end, int sum) {
        if ((sum + nums[start]) % 7 == 0) {
            if ((sum + nums[start]) > max) max = sum + nums[start];
        }

        for (int i = start + 1; i < end; i++) {
            dfs(nums ,i, end, sum + nums[start]);
        }
    }
}
