package history.P0927;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangyao2221
 * @date 2020/9/25 19:50
 */
public class Sougou03 {
    public static class Interval {
        public int start;
        public int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {
        Interval[] intervals = new Interval[]{new Interval(0, 1), new Interval(0, 2), new Interval(2, -1), new Interval(2, 1)};
        fun(3, 4, intervals);
    }

    public static int[] fun(int n, int m, Interval[] intervals) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < intervals.length; i++) {
            int start = intervals[i].start;
            int end = intervals[i].end;
            if (map.containsKey(intervals[i].start)) {
                map.get(start).add(end);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(end);
                map.put(start, list);
            }
        }

        int[] visit = new int[n];
        dfs(map, 0, visit);

        return null;
    }

    public static boolean dfs(Map<Integer, List<Integer>> map, int from, int[] visit) {
        if (from == -1) {
            return true;
        }

        List<Integer> list = map.get(from);

        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) >= 0 && visit[list.get(i)] == 1) {
                    visit[from] = 1;
                    return true;
                }
            }

            for (int i = 0; i < list.size(); i++) {
                boolean flag = dfs(map, list.get(i), visit);
                if (flag) {
                    visit[from] = 1;
                    return true;
                }
            }
        }

        visit[from] = -1;
        return false;
    }
}
