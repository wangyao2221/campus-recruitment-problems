package history.shopee0819;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/19 15:13
 */
public class Main1 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] chs = line.toCharArray();
//        for (int i = 0; i < chs.length; i++) {
//            System.out.println(chs[i]);
//        }
        handle(chs, 0, 0);
        System.out.println("\"" + sb.toString().substring(0, sb.length() - 2) + "\"");
    }

    public static void handle(char[] chs, int start, int pre) {
        if(chs.length == 0) return;
        if(start >= chs.length) return;
        if(chs[start] >= 'a' && chs[start] <= 'z') {
            sb.append(chs[start]);
            pre = 1;
        } else {
            if (pre == 1) {
                sb.append("\\n");
            }
            pre = 0;
        }
        start++;
        handle(chs, start, pre);
    }
}
