package alibaba0821;

import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/8/21 18:28
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(fun(arr));
    }

    public static int fun(int[] arr) {
        int length = arr.length;
        Arrays.sort(arr);
        int result = 0;
        HashMap<Integer, List<Integer>> edgeMap = new HashMap<>();
        HashMap<Integer, Integer> sizeMap = new HashMap<>();

//        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < length; i++) {
            List<Integer> list = new ArrayList<>();
//            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    list.add(arr[j]);
                }
            }
            edgeMap.put(arr[i], list);
            sizeMap.put(arr[i], length - 1);
        }

        int hand = 0;
        int current = max;
        while (true) {
            List<Integer> list = edgeMap.get(current);
            if (list.size() == 0) break;

            if (hand == 1) {
                int maxSizeIndex = list.get(0);
                for (int i = 0; i < list.size(); i++) {
                    if (sizeMap.get(list.get(i)) > sizeMap.get(maxSizeIndex)) {
                        maxSizeIndex = sizeMap.get(list.get(i));
                    }
                }
                list.remove((Integer)maxSizeIndex);
                edgeMap.get(maxSizeIndex).remove((Integer)current);
                int currentSize = sizeMap.get(current);
                sizeMap.put(current, currentSize - 1);
                int maxSize = sizeMap.get(maxSizeIndex);
                sizeMap.put(maxSizeIndex, maxSize - 1);
                current = maxSizeIndex;
                result += max * current;
                hand = 0;
            } else if (hand == 0) {
                int minSizeIndex = list.get(0);
                for (int i = 0; i < list.size(); i++) {
                    if (sizeMap.get(list.get(i)) < sizeMap.get(minSizeIndex)) {
                        minSizeIndex = sizeMap.get(list.get(i));
                    }
                }
                list.remove((Integer)minSizeIndex);
                edgeMap.get(minSizeIndex).remove((Integer)current);
                int currentSize = sizeMap.get(current);
                sizeMap.put(current, currentSize - 1);
                int minSize = sizeMap.get(minSizeIndex);
                sizeMap.put(minSizeIndex, minSize - 1);
                current = minSizeIndex;
                result += minSizeIndex * current;
                hand = 1;
            }
        }

        return result;
    }
}
