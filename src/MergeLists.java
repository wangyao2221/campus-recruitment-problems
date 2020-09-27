import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeLists {

    static class ListNode{
        ListNode next;
        int val;
        public ListNode(int val){
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        String blank = in.nextLine();
        ListNode[] lists = new ListNode[k];
        String[] data = new String[k];
        for (int i = 0; i < k; i++) {
            data[i] = in.nextLine();
        }
        ListNode p = null;
        for (int i = 0; i < k; i++) {
            String inputData = data[i];
            String[] tmp = inputData.split(" ");
//            System.out.println(tmp.length);
            for (int j = 0; j < tmp.length; j++) {
//                System.out.print(tmp[j] + " ");
                if(j == 0){
                    if(tmp[j].equals("")){
                        break;
                    }
                    lists[i] = new ListNode(Integer.valueOf(tmp[j]));
                    p = lists[i];
                    continue;
                }
                ListNode newNode = new ListNode(Integer.valueOf(tmp[j]));
                p.next = newNode;
                p = p.next;
            }
//            System.out.println();
        }

        ListNode rz = mergeKLists(lists);

        while (rz != null){
            System.out.print(rz.val + " ");
            rz = rz.next;
        }
        System.out.println();
    }
    public static ListNode mergeKLists(ListNode[] lists){
        if(lists.length == 0)
            return null;
        if(lists.length == 1)
            return lists[0];
        if(lists.length == 2){
            return mergeTwoLists(lists[0],lists[1]);
        }

        int mid = lists.length/2;
        ListNode[] l1 = new ListNode[mid];
        for(int i = 0; i < mid; i++){
            l1[i] = lists[i];
        }

        ListNode[] l2 = new ListNode[lists.length-mid];
        for(int i = mid,j=0; i < lists.length; i++,j++){
            l2[j] = lists[i];
        }

        return mergeTwoLists(mergeKLists(l1),mergeKLists(l2));

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode head = null;
        if (l1.val <= l2.val){
            head = l1;
            head.next = mergeTwoLists(l1.next, l2);
        } else {
            head = l2;
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }

}
