package LinkedList;

public class ShallowCopyOfNode {
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

        Node temp = a; //Shallow copy of a
//        Node temp = new Node(10); //Deep copy
        System.out.println(a);
        System.out.println(temp);

        System.out.println(a.next.value);
    }
}
