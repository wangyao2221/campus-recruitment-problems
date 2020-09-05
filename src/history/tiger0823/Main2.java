package history.tiger0823;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * @author wangyao2221
 * @date 2020/8/23 17:21
 */
public class Main2 {
    public static void main(String[] args) {
        int[] prices = {3, 6, 8};
        int m = 14;

        System.out.println(new Main2().combinationSum(prices, m).toString());
    }

    /**
     * 合适的股票每手价格组合
     *
     * @param prices int整型一维数组 股票数量
     * @param m      int整型 资产值
     * @return int整型ArrayList<ArrayList <>>
     */
    public ArrayList<ArrayList<Integer>> combinationSum(int[] prices, int m) {
        if (m == 0) return new ArrayList<ArrayList<Integer>>();
        // write code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        find(prices, m, 0, 0, list, result);

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < result.size(); i++) {
            Collections.sort(result.get(i));
        }

        for (int i = 0; i < result.size(); ) {
            if (set.contains(result.get(i).toString())) {
                result.remove(i);
            } else {
                set.add(result.get(i).toString());
                i++;
            }
        }

//        Collections.sort(result, new Comparator<ArrayList<Integer>>() {
//            @Override
//            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
//                return o1.size() - o2.size();
//            }
//        });

        return result;
    }

    public void find(int[] prices, int m, int loc, int sum, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result) {
        if (sum == m) {
            result.add(list);
            return;
        }

        if (sum > m || loc == prices.length) return;

        find(prices, m, loc + 1, sum, (ArrayList<Integer>) list.clone(), result);
        sum += prices[loc];
        list.add(prices[loc]);
        find(prices, m, loc + 1, sum, (ArrayList<Integer>) list.clone(), result);
    }
}
