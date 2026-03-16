package Practice.LinkedList;

public class SortLL {
    public static void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "  ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(30);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(150);
        ListNode d = new ListNode(100);
        ListNode e = new ListNode(30);
        ListNode f = new ListNode(200);

        a.next = b; // linking => a -> b 10-> 20
        b.next = c; // b->c  10 -> 20 -> 30
        c.next = d; // c-> d 10 -> 20 -> 30 -> 40
        d.next = e; // d -> e 10 -> 20 -> 30 -> 40 -> 50
        e.next = f; // d -> e 10 -> 20 -> 30 -> 40 -> 50 -> 60

        printLL(a);
        ListNode head = sortList(a);
        printLL(head);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        if (temp1 == null) temp.next = temp2;
        else temp.next = temp1;

        return dummy.next;
    }

    //    Leetcode 148
//    Time Complexity O(nlogn) Space Complexity O(1)
    public static ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode firstHalf = head;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = slow.next;
        slow.next = null;

        firstHalf = sortList(firstHalf);
        secondHalf = sortList(secondHalf);

        ListNode ans = mergeTwoLists(firstHalf, secondHalf);

        return ans;
    }
}
