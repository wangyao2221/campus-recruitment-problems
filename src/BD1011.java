import java.util.*;

/**
 * @author wangyao2221
 * @date 2020/10/11 11:24
 */
public class BD1011 {
    public static class Pair {
        public int no;
        public int score;

        public Pair(int no, int score) {
            this.no = no;
            this.score = score;
        }
    }
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int no = sc.nextInt();
            int score = sc.nextInt();
            if (map.containsKey(no)) {
                int originScore = map.get(no);
                map.put(no, originScore + score);
            } else {
                map.put(no, score);
            }
        }

        List<Pair> pairs = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pairs.add(new Pair(entry.getKey(), entry.getValue()));
        }

        Collections.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.score - o1.score;
            }
        });

        for (int i = 0; i < m; i++) {
            if (i == 0) {
                System.out.print(pairs.get(i).no);
            } else {
                System.out.print(" " + pairs.get(i).no);
            }
        }
    }
}
