package history.huawei0902;

import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/9/2 19:42
 */
public class Main1 {
    private static class F {
        public int value;
        public int index;

        public F(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {
        int[][] candies = {{2,2}, {2,1}, {3,2}, {5,2}, {3,1}, {7,2}};

        ArrayList<F>[] list = new ArrayList[2];
        list[0] = new ArrayList<F>();
        list[1] = new ArrayList<F>();


        for (int i = 0; i < candies.length; i++) {
            if (candies[i][1] == 1) {
                list[0].add(new F(candies[i][0], i));
            } else {
                list[1].add(new F(candies[i][0], i));
            }
        }

        Collections.sort(list[0], new Comparator<F>() {
            @Override
            public int compare(F o1, F o2) {
                return o2.value - o1.value;
            }
        });

        Collections.sort(list[1], new Comparator<F>() {
            @Override
            public int compare(F o1, F o2) {
                return o2.value - o1.value;
            }
        });

        int sum1 = 0;
        int sum2 = 0;
        int[] index1 = new int[3];
        int[] index2 = new int[3];

        for (int i = 0; i < list[0].size() && i < 3; i++) {
            sum1 += list[0].get(i).value;
            index1[i] = list[0].get(i).index + 1;
        }

        for (int i = 0; i < list[1].size() && i < 3; i++) {
            sum2 += list[1].get(i).value;
            index2[i] = list[1].get(i).index + 1;
        }

        Arrays.sort(index1);
        Arrays.sort(index2);

        if (sum1 > sum2) {
            for (int i = 0; i < index1.length; i++) {
                System.out.print(index1[i] + " ");
            }
            System.out.println();
            System.out.println(1);
            System.out.println(sum1);
        } else {
            for (int i = 0; i < index1.length; i++) {
                System.out.print(index2[i] + " ");
            }
            System.out.println();
            System.out.println(2);
            System.out.println(sum2);
        }
    }
}
