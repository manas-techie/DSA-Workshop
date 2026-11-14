package Stack_DS;

import java.util.*;

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class RemoveNodesFromLL {
    //    Leetcode 2487
    // Time Complexity O(n) Space Complexity and Auxiliary Space O(n)
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            if (!st.isEmpty() && st.peek().val < temp.val) {
                st.pop();
            } else {
                st.push(temp);
                temp = temp.next;
            }
        }
        while (!st.isEmpty()) {
            ListNode top = st.pop();
            top.next = temp;
            temp = top;
        }

        return temp;
    }
}
