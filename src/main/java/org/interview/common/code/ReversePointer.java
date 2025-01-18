package org.interview.common.code;

class ListNode {
    int value;
    ListNode next;

    ListNode(int value) {
        this.value = value;
    }
}

public class ReversePointer {
    public static void main(String[] args) {
        // linkedlist
        ListNode head = new ListNode(1);
        ListNode p = head;
        for (int i = 2; i <= 6; i++) {
            p.next = new ListNode(i);
            p = p.next;
        }
        ListNode q = head;
        while (q != null) {
            System.out.print(q.value + " ");
            q = q.next;
        }
        System.out.println();
        // reverse
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
        ListNode r = head;
        while (r != null) {
            System.out.print(r.value + " ");
            r = r.next;
        }
        System.out.println();
    }

}
