package alibaba0904;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/9/4 08:48
 */
public class Main2 {
    public static class TreeNode {
        public TreeNode left;
        public TreeNode right;
        public int val;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        HashMap<Integer, TreeNode> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (map.size() < n){
            int start = sc.nextInt();
            int end = sc.nextInt();

            TreeNode node = null;
            if (map.containsKey(start)) {
                 node = map.get(start);
            } else {
                node = new TreeNode(start);
                map.put(start, node);
            }

            if (node.left == null) {
                TreeNode left = new TreeNode(start);
                map.put(end, left);
                node.left = left;
            } else if(node.right == null) {
                TreeNode right = new TreeNode(start);
                map.put(end, right);
                node.right = right;
            }
        }

        System.out.println();
    }

//    public static int fun(TreeNode root) {
//
//    }

}
