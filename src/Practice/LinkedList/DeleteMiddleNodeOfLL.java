package Practice.LinkedList;

public class DeleteMiddleNodeOfLL {
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
        ListNode head = deleteMiddle(a);
        printLL(head);
    }

//    Leetcode 2095
//    Single Pass Solution
//    Time Complexity O(n) Space Complexity O(1)
    public static ListNode deleteMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if (head.next == null) {
            return null;
        }

        //finding the left middle for even and pre-middle element for odd
        while (fast.next.next != null && fast.next.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //deleting the middle node
        slow.next = slow.next.next;

        return head;
    }
}
