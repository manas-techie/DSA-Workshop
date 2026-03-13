package Practice.LinkedList;

public class SwappingNodesInLL {
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

        a.next = b; // linking => a -> b 10-> 20
        b.next = c; // b->c  10 -> 20 -> 30
        c.next = d; // c-> d 10 -> 20 -> 30 -> 40
        d.next = e; // d -> e 10 -> 20 -> 30 -> 40 -> 50

        printLL(a);
        ListNode head = swapNodes(a, 2);
        printLL(head);
    }

//    Letcode 1721
//    Approach -> slow and fast pointer
//    Time Complexity O(n) Space Complexity O(1)
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode a = head;

        //Find the kth node from start and shift the fast pointer to kth node
        //means loop whill run k -1 time
        for (int i = 1; i < k; i++) {
            a = a.next;
            fast = fast.next;
        }

        //Shift the slow and fast pointer till last node
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        //swap the values
        int temp = a.val;
        a.val = slow.val;
        slow.val = temp;

        return head;
    }
}
