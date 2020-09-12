package history.tencent0906.wy;


import java.util.*;

public class Ten03 {
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

        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
//        ArrayList<Map.Entry<String, Integer>> desc = new ArrayList<>(map.entrySet());

        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> pair1, Map.Entry<String, Integer> pair2) {
                if (pair1.getValue().equals(pair2.getValue())) {
                    return pair1.getKey().compareTo(pair2.getKey());
                }

                return -pair1.getValue().compareTo(pair2.getValue());
            }
        });

        for (int i = 0; i < k; i++) {
            System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
        }

        list.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> pair1, Map.Entry<String, Integer> pair2) {
                if (pair1.getValue().equals(pair2.getValue())) {
                    return pair1.getKey().compareTo(pair2.getKey());
                }

                return pair1.getValue().compareTo(pair2.getValue());
            }
        });

        for (int i = 0; i < k; i++) {
            System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
        }
    }
}
