package Practice.LinkedList;


public class MiddleOfLinkedList {
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

        ListNode middleNode = middleNode(a);
        System.out.println(middleNode.val);
    }

    //    Leetcode 876
//    Approach 1
//    Time Complexity O(n) Space Complexity O(1)
    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }

        temp = head;
        for (int i = 1; i <= count / 2; i++) {
            temp = temp.next;
        }

        return temp;
    }

    //    Approach 2 - > Slow and fast pointer
    public static ListNode middleNode2(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

//        we have to write fast != null because if fast == null , null.next is equal to undefined its gives error
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
