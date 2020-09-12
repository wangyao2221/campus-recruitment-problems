package history.tencent0906.wy;

import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/9/6 21:13
 */
public class Main03 {
    static class Pair {
        String first;
        int second;

        public Pair(String first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        String[] arr = new String[n];
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
            if (map.containsKey(arr[i])) {
                int value = map.get(arr[i]);
                map.put(arr[i], value + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        List<Pair> list = new ArrayList<Pair>();
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            list.add(new Pair(pair.getKey(), pair.getValue()));
        }

        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.second != o2.second) {
                    return o2.second - o1.second;
                } else {
                    return o1.first.compareTo(o2.first);
                }
            }
        });

        for (int i = 0; i < k; i++) {
            System.out.println(list.get(i).first + " " + list.get(i).second);
        }

        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.second == o2.second) {
                    return o2.second - o1.second;
                } else {
                    return -o1.first.compareTo(o2.first);
                }
            }
        });

        for (int i = 0; i < k; i++) {
            System.out.println(list.get(list.size() - i - 1).first + " " + list.get(list.size() - i - 1).second);
        }
    }
}
