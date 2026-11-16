package Queue;

import com.sun.security.jgss.GSSUtil;

import java.util.LinkedList;
import java.util.Queue;

public class TraverseInQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        display(q);
    }

    private static void display(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
    }
}
