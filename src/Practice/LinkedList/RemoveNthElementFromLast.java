package Practice.LinkedList;

public class RemoveNthElementFromLast {

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
        ListNode head = removeNthFromEnd(a, 2);
        printLL(head);
    }

    //    Leetocode 19
//    Double pass solution
//    Time Complexity O(len) Space Complexity O(1)
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head.next == null) {
            return null;
        }

        ListNode temp = head;
        int len = 0;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len == n) {
            head = head.next;
            return head;
        }

//  n th node from last = (len - n + 1) from start
//  we need (len - n)th node from start
//  the for loop  1 to len - n -1
        temp = head;
        for (int i = 1; i < len - n; i++) {
            temp = temp.next;
        }
//            deletion
        temp.next = temp.next.next;

        return head;
    }

//    Approach 2 -> slow & fast pointer
//    Time Complexity O(n) Space Complexity O(1)

    public static ListNode removeNthFromEnd2(ListNode head, int n) {

        if (head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        //Remove head edge case [1,2] n = 2 or length is equal to n
        if (fast == null) {
            head = head.next;
            return head;
        }

        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        //deletion
        slow.next = slow.next.next;

        return head;
    }
}
