package tencent0906.wy;

import java.util.*;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n == 0 || m == 0) {
            System.out.println(0);
        }

        List<HashSet<Integer>> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            HashSet<Integer> set_ = new HashSet<>();
            int flag = 0;

            for (int j = 0; j < num; j++) {
                int newNum = sc.nextInt();

                set_.add(newNum);
                if (newNum == 0 || set.contains(newNum)) {
                    flag = 1;
                }
            }
            list.add(set_);
            if (flag == 1) {
                set.addAll(set_);
            }
        }

        fun(list, set);
        System.out.println(set.size());
    }

    private static void fun(List<HashSet<Integer>> list, HashSet<Integer> set) {
        for (int i = 0; i < list.size(); i++) {
            Iterator<Integer> it = list.get(i).iterator();
            while (it.hasNext()) {
                if (set.contains(it.next())) {
                    set.addAll(list.get(i));
                    break;
                }
            }
        }

        for (int i = 0; i < list.size(); i++) {
            Iterator<Integer> it = list.get(i).iterator();
            while (it.hasNext()) {
                if (set.contains(it.next())) {
                    set.addAll(list.get(i));
                    break;
                }
            }
        }
    }
}
