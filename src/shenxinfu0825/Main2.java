package shenxinfu0825;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/25 18:51
 */
public class Main2 {
//    public static void main(String[] args) {
//        int[] pre = new int[10];
//        int[] replace = new int[10];
//
//        for (int i = 0; i < pre.length; i++) {
//            pre[i] = -1;
//            replace[i] = -1;
//        }
//
//        Scanner sc = new Scanner(System.in);
//        String numStr = sc.next();
//        char[] chs = numStr.toCharArray();
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//
//            // 2 3需要保存把2替换成3
//            replace[a] = b;
//
//            while (true) {
//                if (pre[a] != -1) {
//                    a = pre[a];
//                } else {
//                    break;
//                }
//            }
//            pre[b] = a;
//
//            // 0 2, 2 3 3的前置数字2，2的前置数字是1，0需要替换成3
//            replace[a] = b;
//        }
//
//        for (int i = 0; i < chs.length; i++) {
//            if (replace[chs[i] - '0'] != -1) {
//                chs[i] = (char)(replace[chs[i] - '0'] + '0');
//            }
//        }
//
//        System.out.println(new String(chs));
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numStr = sc.next();
        char[] chs = numStr.toCharArray();
        int n = sc.nextInt();

        int[] map = new int[10];
        for (int i = 0; i < map.length; i++) {
            map[i] = -1;
        }

        ArrayList<Integer> needReplace = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            map[from] = to;
            needReplace.add(0, from);
        }

        for (int i = 0; i < needReplace.size(); i++) {
            int from = needReplace.get(i);
            int to = -1;

            int fromCopy = from;
            while (true) {
                if (map[fromCopy] != -1) {
                    to = map[fromCopy] ;
                    fromCopy = to;
                    System.out.print(1);
                } else {
                    break;
                }
            }

            if (to != -1) {
                map[from] = to;
            }
        }

        for (int i = 0; i < chs.length; i++) {
            if (map[chs[i] - '0'] != -1) {
                int to = map[chs[i] - '0'];
                chs[i] = (char)(to + '0');
            }
        }

        System.out.println(new String(chs));
    }
}
