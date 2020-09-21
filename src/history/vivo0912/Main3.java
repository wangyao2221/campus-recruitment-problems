package history.vivo0912;

import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/9/12 19:58
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] tmp = line.substring(1, line.length() - 1).split(",");
        int[] arr = new int[tmp.length];

        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

        int[] inDegree = new int[arr.length];

        for (int i = 0; i < tmp.length; i++) {
            int start = arr[i];
            int end = i;
            if (start != -1) {
                inDegree[end]++;
                if (map.containsKey(start)) {
                    map.get(start).add(end);
                } else {
                    List<Integer> list = new ArrayList<>();
                    list.add(end);
                    map.put(start, list);
                }
            }
        }


    }
    // "1,2,-1,1"
}
