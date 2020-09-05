package tiger0823;

import java.util.Scanner;

/**
 * @author wangyao2221
 * @date 2020/8/23 16:47
 */
public class Main1 {

    public static class ListNode {
        int val;
        ListNode next = null;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12,13,14,15,16,17,18};
        ListNode head = createList(arr);
        lineUp(head);
    }

    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode currentNode = head;
        for (int i = 1; i < arr.length; i++) {
            currentNode.next = new ListNode(arr[i]);
            currentNode = currentNode.next;
        }
        return head;
    }

    public static ListNode lineUp(ListNode head) {
        // write code here
        ListNode currentNode = head;
        ListNode otherHead = null;
        ListNode otherCurrentNode = otherHead;

        while (currentNode.next != null) {
            ListNode currentNext = currentNode.next;
            currentNode.next = currentNext.next;

            if (otherHead == null) {
                otherHead = currentNext;
                otherCurrentNode = otherHead;
            } else {
                otherCurrentNode.next = currentNext;
                otherCurrentNode = otherCurrentNode.next;
                currentNext.next = null;
            }

            currentNode = currentNode.next;
        }

        currentNode.next = otherHead;

        return head;
    }
}
