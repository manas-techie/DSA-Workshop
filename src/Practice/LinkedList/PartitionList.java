package Practice.LinkedList;

public class PartitionList {
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
        ListNode e = new ListNode(20);
        ListNode f = new ListNode(45);

        a.next = b; // linking => a -> b 10-> 20
        b.next = c; // b->c  10 -> 20 -> 30
        c.next = d; // c-> d 10 -> 20 -> 30 -> 40
        d.next = e; // d -> e 10 -> 20 -> 30 -> 40 -> 50
        e.next = f; // d -> e 10 -> 20 -> 30 -> 40 -> 50 -> 60

        printLL(a);
        ListNode head = partition(a, 30);
        printLL(head);
    }

    //    Leetcode 86
//    Time Complexity O(n) Space Complexity O(1)
    public static ListNode partition(ListNode head, int x) {
        ListNode a = new ListNode(-1);
        ListNode b = new ListNode(-1);
        ListNode tempA = a;
        ListNode tempB = b;
        ListNode temp = head;

        while (temp != null) {
            if (temp.val < x) {
                tempA.next = temp;
                tempA = tempA.next;
            } else {
                tempB.next = temp;
                tempB = tempB.next;
            }
            temp = temp.next;
        }

        tempB.next = null; //last node
        a = a.next;
        b = b.next;

        tempA.next = b; //list a attached to list b

        if (a == null) return b;
        return a;
    }
}
