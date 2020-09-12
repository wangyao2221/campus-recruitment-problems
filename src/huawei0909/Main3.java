package huawei0909;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/9 19:00
 */
public class Main3 {
    public static class TreeNode {
        int val;
        int weight;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static long max = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, TreeNode> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            map.put(i, new TreeNode(i));
        }

        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            TreeNode node = map.get(id);
            node.weight = sc.nextInt();
            int leftId = sc.nextInt();
            int rightId = sc.nextInt();

            TreeNode left = map.get(leftId);
            if (left != null) {
                node.left = left;
            }

            TreeNode right = map.get(rightId);
            if (right != null) {
                node.right = right;
            }
        }

        fun(map.get(1));
        System.out.println(max);
    }

    public static void fun(TreeNode root) {
        maxWightSum(root.left, root.weight);
        maxWightSum(root.right, root.weight);
    }

    public static void maxWightSum(TreeNode root, long result) {
        if (result > max) max = result;
        if (root == null) return;
        long currentResult = root.weight ^ result;

        maxWightSum(root.left, currentResult);
        maxWightSum(root.left, root.weight);
        maxWightSum(root.right, currentResult);
        maxWightSum(root.right, root.weight);
    }
}


//5
//        1 1 2 3
//        2 4 -1 -1
//        3 2 -1 4
//        4 10 -1 5
//        5 3 -1 -1