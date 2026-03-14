package Practice.LinkedList;

public class IntersectionOfTwoLL {
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

        ListNode A = new ListNode(80);
        ListNode B = new ListNode(100);


        A.next = B;
        B.next = e;
        e.next = f;


        a.next = b; // linking => a -> b 10-> 20
        b.next = c; // b->c  10 -> 20 -> 30
        c.next = d; // c-> d 10 -> 20 -> 30 -> 40
        d.next = e; // d -> e 10 -> 20 -> 30 -> 40 -> 50
        e.next = f; // d -> e 10 -> 20 -> 30 -> 40 -> 50 -> 60

        printLL(a);
        ListNode intersectionNode = getIntersectionNode(a, A);
        System.out.println(intersectionNode.val);

    }

//    Leetcode 160
//    Time Complexity O(lenA + lenB) Space Complexity O(1)
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;

//        Find the length of A and B LL
        int lenA = 0, lenB = 0;
        while (tempA != null) {
            tempA = tempA.next;
            lenA++;
        }

        while (tempB != null) {
            tempB = tempB.next;
            lenB++;
        }

//        Move the pointer to both pointer can be in parallel
        tempA = headA;
        tempB = headB;
        for (int i = 1; i <= Math.abs(lenA - lenB); i++) {
            if (lenA > lenB) {
                tempA = tempA.next;
            } else {
                tempB = tempB.next;
            }
        }

//        Move both pointer and check if Nodes are same
        while (tempA != null && tempB != null) {
            if (tempA == tempB) return tempA;
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return null;
    }
}
