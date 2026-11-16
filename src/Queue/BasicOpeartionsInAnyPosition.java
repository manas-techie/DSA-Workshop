package Queue;

import java.util.LinkedList;
import java.util.Queue;

// Time Complexity O(N) and Auxiliary Space O(1)
public class BasicOpeartionsInAnyPosition {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        display(q);
        addAtIndex(q, 60, 3);
        display(q);
        int ele = removeAtIndex(q, 3);
        display(q);
        System.out.println(peekAtIndex(q, 0));
        System.out.println(peekAtIndex(q, 3));
        System.out.println(peekAtIndex(q, 4));

    }

    private static void display(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
        System.out.println();
    }

    private static void addAtIndex(Queue<Integer> q, int val, int idx) {
        int n = q.size();
        if (idx < 0 || idx > n) {
            System.out.println("Invalid index");
            return;
        }
        if (idx < n) {
            for (int i = 1; i <= idx; i++) {
                q.add(q.remove());
            }
        }
        q.add(val);
        for (int i = 1; i <= n - idx; i++) {
            q.add(q.remove());
        }
    }

    private static int removeAtIndex(Queue<Integer> q, int idx) {
        int n = q.size();
        if (idx < 0 || idx >= n) {
            System.out.println("Invalid index");
            return -1;
        }
        for (int i = 1; i <= idx; i++) {
            q.add(q.remove());
        }
        int ele = q.remove();
        for (int i = 1; i <= q.size() - idx; i++) { //use the current size of queue or n - idx -1 because 1 element is removed from the queue
            q.add(q.remove());
        }
        return ele;
    }

    private static int peekAtIndex(Queue<Integer> q, int idx) {
        int n = q.size();
        if (idx < 0 || idx >= n) {
            System.out.println("Invalid index");
            return -1;
        }
        for (int i = 1; i <= idx; i++) {
            q.add(q.remove());
        }
        int ele = q.remove();
        q.add(ele);
        for (int i = 1; i <= n - idx - 1; i++) {
            q.add(q.remove());
        }
        return ele;
    }

}
