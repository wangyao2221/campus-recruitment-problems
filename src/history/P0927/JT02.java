package history.P0927;

import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/9/27 16:38
 */
public class JT02 {
    static HashSet<String> visitedSet = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        line = line.substring(1, line.length() - 1);
        String[] edgeStrs = line.split(",");
        HashMap<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < edgeStrs.length; i++) {
            String edgeStr = edgeStrs[i].substring(1, edgeStrs[i].length() - 1);
            String[] edge = edgeStr.split("->");
            String from = edge[0];
            String to = edge[1];
            if (map.containsKey(from)) {
                map.get(from).add(to);
            } else {
                List<String> list = new ArrayList<>();
                list.add(to);
                map.put(from, list);
            }
        }

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (dfs(map, entry.getKey())) {
                System.out.println(1);
                return;
            }
        }
        System.out.println(-1);
    }

    public static boolean dfs(HashMap<String, List<String>> map, String cur) {
        if (visitedSet.contains(cur)) return true;
        visitedSet.add(cur);

        List<String> list = map.get(cur);
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                if(dfs(map, list.get(i))) return true;
            }
        }

        visitedSet.remove(cur);
        return false;
    }
}
//{(A->B),(B->C),(C->A)}