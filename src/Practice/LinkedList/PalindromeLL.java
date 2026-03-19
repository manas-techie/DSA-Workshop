package Practice.LinkedList;

public class PalindromeLL {
    public static void main(String[] args) {
        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(20);
        ListNode e = new ListNode(10);


        a.next = b; // linking => a -> b 10-> 20
        b.next = c; // b->c  10 -> 20 -> 30
        c.next = d; // c-> d 10 -> 20 -> 30 -> 40
        d.next = e; // d -> e 10 -> 20 -> 30 -> 40 -> 50

        boolean isPalindrome = isPalindrome(a);
        System.out.println(isPalindrome);


    }

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

//    m - 1
//    T.C = O(n) S.C = O(n)
    public static boolean isPalindrome(ListNode head) {

        if (head.next == null || head == null) return true;
        //create a deepcopy
        ListNode newHead = new ListNode(head.val);
        ListNode t1 = head.next;
        ListNode t2 = newHead;
        while (t1 != null) {
            ListNode temp = new ListNode(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }

        newHead = reverseList(newHead);
        t1 = head;
        t2 = newHead;
        while (t1 != null) {
            if (t1.val != t2.val) return false;
            t2 = t2.next;
            t1 = t1.next;
        }
        return true;
    }

//    Leetcode 234
//    optimal approach
//    T.C = O(n) S.C = O(1)
    public boolean isPalindrome2(ListNode head) {

        if(head.next == null || head == null) return true;

        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode j = reverseList(slow);
        ListNode i = head;
        while(j != null){
            if(i.val != j.val) return false;
            i =i.next;
            j = j.next;
        }
        return true;
    }
}
