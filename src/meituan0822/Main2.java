package meituan0822;

import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/8/22 17:07
 */
public class Main2 {
    static class Order {
        int id;
        int value;

        public Order(int id, int value) {
            this.id = id;
            this.value = value;
        }
    }

    static class OrderComparator implements Comparator<Order> {
        @Override
        public int compare(Order o1, Order o2) {
            return -o1.value + o2.value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            int price = v = v + 2 * w;
            orders[i] = new Order(i + 1, price);
        }

        fun(m, orders);
    }

    private static void fun(int m, Order[] orders) {
        List<Order> list = Arrays.asList(orders);
        Collections.sort(list, new OrderComparator());

        int[] result = new int[m];
        for (int i = 0; i < m; i++) {
            result[i] = orders[i].id;
        }
        Arrays.sort(result);
        for (int i = 0; i < m; i++) {
            System.out.println(result[i] + " ");
        }
    }
}
