package Practice.LinkedList;

public class ReverseLL {
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
        ListNode head = reverseList(a);
        printLL(head);
    }

    //    Leetcode 206
//    M-1 -> Iterative method
//    Time Complexity O(n) Space Complexity O(1)
    public static ListNode reverseList(ListNode head) {
        ListNode Curr = head;
        ListNode Prev = null;
        ListNode Next = null;

        while (Curr != null) {
            Next = Curr.next;
            Curr.next = Prev;
            Prev = Curr;
            Curr = Next;
        }
        return Prev;
    }
    //    M-2 -> Recursive method
//    Time Complexity O(n) Space Complexity O(n) -> call stack
    public static ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode a = head.next;
        ListNode newHead = reverseList2(a);

        a.next = head;
        head.next = null;
        return newHead;
    }
}
