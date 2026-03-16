package Practice.LinkedList;

public class MergeTwoSortedList {
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
        ListNode b = new ListNode(30);
        ListNode c = new ListNode(65);
        ListNode d = new ListNode(80);
        ListNode e = new ListNode(85);
        ListNode f = new ListNode(90);

        ListNode A = new ListNode(20);
        ListNode B = new ListNode(40);
        ListNode C = new ListNode(100);

        a.next = b; // linking => a -> b 10-> 20
        b.next = c; // b->c  10 -> 20 -> 30
        c.next = d; // c-> d 10 -> 20 -> 30 -> 40
        d.next = e; // d -> e 10 -> 20 -> 30 -> 40 -> 50
        e.next = f; // d -> e 10 -> 20 -> 30 -> 40 -> 50 -> 60


        A.next = B;
        B.next = C;

        printLL(a);
        ListNode head = mergeTwoLists(a, A);
        printLL(head);
    }

//    Leetcode 21
//    Time Complexity O(n+m) Sppace Complexity O(1)
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2  = temp2.next;
            }
            temp = temp.next;
        }

        if(temp1 == null) temp.next = temp2;
        else temp.next = temp1;

        return dummy.next;
    }
}
