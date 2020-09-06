package tencent0906.jyh;

import java.util.*;


public class ten04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        if (n == 1) {
            System.out.println(0);
            return;
        }
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//            int m = sc.nextInt();
//            List<HashSet<Integer>> list = new ArrayList<>();
//            HashSet<Integer> set = new HashSet<Integer>();
//            for (int i = 0; i < m; i++) {
//                int num = sc.nextInt();
//                HashSet<Integer> set_ = new HashSet<>();
//                int flag = 0;
//                for (int j = 0; j < num; j++) {
//                    int num_ = sc.nextInt();
//                    set_.add(num_);
//                    if (num_ == 0) {
//                        flag = 1;
//                    }
//                }
//                list.add(set_);
//                if (flag == 1) set.addAll(set_);
//            }
        Arrays.sort(arr);

        int len = arr.length;
        if (len % 2 == 0) {
            int midLen = len / 2;
            for (int i = 0; i < n; i++) {
                if (i < midLen) {
                    System.out.println(arr[midLen]);
                } else if (i >= midLen) {
                    System.out.println(arr[midLen - 1]);
                }
            }
        } else {
            int midLen = len / 2;
            for (int i = 0; i < n; i++) {
                if (i < midLen) {
                    System.out.println((arr[midLen] + arr[midLen + 1]) / 2);
                } else if (i == midLen) {
                    System.out.println((arr[midLen - 1] + arr[midLen + 1]) / 2);
                } else {
                    System.out.println((arr[midLen - 1] + arr[midLen]) / 2);
                }
            }
        }
    }
}
