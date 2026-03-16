package Practice.LinkedList;

public class RotateLL {
    public static void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "  ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(60);

        a.next = b; // linking => a -> b 10-> 20
        b.next = c; // b->c  10 -> 20 -> 30
        c.next = d; // c-> d 10 -> 20 -> 30 -> 40
        d.next = e; // d -> e 10 -> 20 -> 30 -> 40 -> 50
        e.next = f; // d -> e 10 -> 20 -> 30 -> 40 -> 50 -> 60

        printLL(a);
        ListNode head = rotateRight(a, 2);
        printLL(head);
    }

    //    Leetcode 61
//    Time Complexity O(n) Space Complexity O(1)
    public static ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null) return head;

        int len = 0;
        ListNode temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }

        if (k != 0) k = k % len;
        if (k == 0) return head;

        ListNode slow = head;
        ListNode fast = head;

        for (int i = 1; i <= k; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

//        Store the next node of slow in temp
        temp = slow.next;

//        Divide the linked list
        slow.next = null;

//        Attacted the next of last nod to head
        fast.next = head;
//        change the head
        head = temp;

        return head;
    }
}
