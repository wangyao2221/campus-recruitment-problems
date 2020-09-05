package bytedance0823;

import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/8/23 09:27
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        while (m-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            int maxNum = 0;
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                if (maxNum < arr[i][0]) {
                    maxNum = arr[i][0];
                }
                arr[i][1] = sc.nextInt();
                if (maxNum < arr[i][1]) {
                    maxNum = arr[i][1];
                }
            }
            System.out.println(fun(arr, maxNum) ? "YES" : "NO");
        }
    }

    public static boolean fun(int[][] arr, int maxNum) {
        int[] edge = new int[maxNum + 1];
        HashMap<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

        for (int i = 0; i < arr.length; i++) {
            edge[arr[i][0]] = arr[i][1];
        }

        for (int i = 0; i < edge.length; i++) {
            int to = edge[i];

            List<Integer> list = new ArrayList<>();
            for (int j = i + 1; j < to - 1; j++) {
                if (edge[j] > edge[i]) {
                    if (map.containsKey(j)) return false;
                    list.add(j);
                }
                if (list.size() > 0) {
                    map.put(i, list);
                }
            }
        }

        return bfs(map, maxNum);
    }

    public static boolean bfs(HashMap<Integer, List<Integer>> map, int maxNum) {
        boolean[] visited = new boolean[maxNum];
        Queue<Integer> queue = new LinkedList<>();
        int visitCount = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            int from = entry.getKey();
            visited[from] = true;
            queue.add(from);
            visitCount++;

            while (!queue.isEmpty()) {
                int f = queue.poll();
                List<Integer> list = map.get(f);
                if (list != null) {
                    for (int i = 0; i < list.size(); i++) {
                        int t = list.get(i);
                        visitCount++;
                        if (visited[t] == true) {
                            return false;
                        } else {
                            visited[t] = true;
                            queue.add(t);
                        }
                    }
                }
            }

            break;
        }

        if (map.size() == visitCount) {
            return true;
        } else {
            return false;
        }
    }
}
