package Practice.LinkedList;

public class RemoveDuplicates {
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
        ListNode c = new ListNode(20);
        ListNode d = new ListNode(40);
        ListNode e = new ListNode(50);
        ListNode f = new ListNode(50);

        a.next = b; // linking => a -> b 10-> 20
        b.next = c; // b->c  10 -> 20 -> 30
        c.next = d; // c-> d 10 -> 20 -> 30 -> 40
        d.next = e; // d -> e 10 -> 20 -> 30 -> 40 -> 50
        e.next = f; // d -> e 10 -> 20 -> 30 -> 40 -> 50 -> 60

        printLL(a);
        ListNode head = deleteDuplicates(a);
        printLL(head);
    }

//    Leetcode 83
//    Approach 1 => two pointer
//    Time Complexity O(n) Space Complexity O(1)
    public static ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        ListNode A = head;
        ListNode B = head;

        while(B != null){
            if (A.val == B.val){
                B = B.next;
            } else{
                A.next = B;
                A = A.next;
            }
        }
        A.next = B;

        return head;

    }

//    Approach 2
    public static ListNode deleteDuplicates2(ListNode head) {
        ListNode temp = head;

        while (temp != null && temp.next != null){
            if(temp.val  == temp.next.val){
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return head;

    }
}
