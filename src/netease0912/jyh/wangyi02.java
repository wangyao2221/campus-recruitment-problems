package netease0912.jyh;

import java.util.HashMap;
import java.util.Scanner;
class TreeNode{
    TreeNode left;
    TreeNode right;
    int val;
    public TreeNode(int val){
        this.val = val;
    }
}
public class wangyi02 {
    static int rz = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        HashMap<Integer,TreeNode> map = new HashMap<>();
        TreeNode head = new TreeNode(1);
        map.put(1,head);
        for (int i = 0; i < n; i++) {
            int root = in.nextInt();
            String sonLoc = in.next();
            int son = in.nextInt();
            TreeNode rootNode;
            TreeNode sonNode;

            if(!map.containsKey(root)){
                rootNode = new TreeNode(root);
                map.put(root,rootNode);
            }
            else rootNode = map.get(root);

            if(!map.containsKey(son)){
                sonNode = new TreeNode(son);
                map.put(son,sonNode);
            }
            else sonNode = map.get(son);

            if(sonLoc.equals("left")){
                rootNode.left = sonNode;
            }
            else {
                rootNode.right = sonNode;
            }
        }
        int rzz = find(head);
        System.out.println(rz);

    }

    private static int find(TreeNode root) {
        if(root == null)return 0;
        int leftNum = find(root.left);
        int rightNum = find(root.right);
        if(leftNum == 1 && rightNum == 1){
            rz++;
        }
        return leftNum > rightNum?leftNum + 1 : rightNum + 1;
    }


}
