package tiger0823;

import java.util.ArrayList;

/**
 * @author wangyao2221
 * @date 2020/8/23 17:38
 */
public class Main21 {
    public static void main(String[] args) {
        int[] prices = {3, 8, 6};
        int m = 14;

        System.out.println(new Main2().combinationSum(prices, m).toString());
    }

    public ArrayList<ArrayList<Integer>> combinationSum (int[] prices, int m) {
        // write code here
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backTrack(prices, 0, m, new ArrayList<Integer>(), result);

        return result;
    }


    public static void backTrack(int[] prices, int index, int m, ArrayList<Integer> tmp, ArrayList<ArrayList<Integer>> result) {
        if (m == 0) {
            result.add(new ArrayList<>(tmp));
            return;
        }

        for (int i = index; i < prices.length; i++) {
            if (m - prices[i] < 0) break;
            tmp.add(prices[i]);
            backTrack(prices, index + 1, m - prices[i], tmp, result);
            tmp.remove(tmp.size() - 1);
        }
    }
}
