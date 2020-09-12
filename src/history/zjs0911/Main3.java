package history.zjs0911;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/11 19:06
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chs = sc.next().toCharArray();
        int[] arr = new int[128];

        for (int i = 0; i < chs.length; i++) {
            arr[chs[i]]++;
            if (arr[chs[i]] == 3) {
                System.out.println(chs[i]);
                return;
            }
        }

        System.out.println("没有出现三次的字符");
    }
}
