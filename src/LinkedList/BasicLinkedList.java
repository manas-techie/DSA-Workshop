package LinkedList;


class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}


public class BasicLinkedList {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b; // linking => a -> b 10-> 20
        b.next = c; // b->c  10 -> 20 -> 30
        c.next = d; // c-> d 10 -> 20 -> 30 -> 40
        d.next = e; // d -> e 10 -> 20 -> 30 -> 40 -> 50

        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("a.next: " + a.next);

        System.out.println("a value: " + a.value);
        System.out.println("b value: " + a.next.value);
        System.out.println("c value: " + a.next.next.value);
        System.out.println("d value: " + a.next.next.next.value);
        System.out.println("e value: " + a.next.next.next.next.value);
    }
}
