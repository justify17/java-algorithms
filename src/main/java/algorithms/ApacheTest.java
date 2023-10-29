package algorithms;

import algorithms.helperClasses.ListNode;

public class ApacheTest {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(0, new ListNode(1, new ListNode(2)));
        System.out.println(listNode);

        ListNode result = rotateRight(listNode, 4);
        System.out.println(result);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        int size = 0;

        ListNode next = head;
        while (next != null) {
            next = next.getNext();
            size++;
        }

        k = k % size;

        if(k == 0) {
            return head;
        }

        ListNode start = head;

        next = head;
        for (int i = 0; i < size; i++) {
            if (i == size - k - 1) {
                start = next.getNext();
                next.setNext(null);
                next = start;
                continue;
            }

            if (i == size - 1) {
                next.setNext(head);
            }

            next = next.getNext();
        }

        return start;
    }
}
