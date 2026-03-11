package LinkedList;


class SinglyLinkedList { //user define data structure
    private Node head;
    private Node tail;
    private int size; // By default, 0

    void insertAtStart(int val) {
        Node temp = new Node(val);
//        if linked list is empty
        if (head == null) {
            head = temp;
            tail = temp;
        } else { //linked list is not empty
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void insertAtEnd(int val) {
        Node temp = new Node(val);
//        if linked list is empty
        if (head == null) {
            head = temp;
            tail = temp;
        } else {  //linked list is not empty
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void insert(int index, int value) throws Error {
//        Base cases
        if (index == 0) {
            insertAtStart(value);
            return;
        }
        if (index == size) {
            insertAtEnd(value);
            return;
        }
        if (index > size || index < 0) {
            throw new Error("Invalid Index");
        }

        Node temp = new Node(value);
        Node x = head;
        for (int i = 1; i <= index - 1; i++) {
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }

    int getElement(int index) throws Error {
        if (index == 0) {
            return head.value;
        }
        if (index == size - 1) {
            return tail.value;
        }
        if (index >= size || index < 0) {
            throw new Error("Invalid Index!!");
        }
        Node temp = head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        return temp.value;
    }

    void setElement(int index, int value) throws Error {
        if (index == 0) {
            head.value = value;
            return;
        }
        if (index == size - 1) {
            tail.value = value;
            return;
        }
        if (index >= size || index < 0) {
            throw new Error("Invalid Index!!");
        }
        Node temp = head;
        for (int i = 1; i <= index; i++) {
            temp = temp.next;
        }
        temp.value = value;
    }

    void deleteAtStart() throws Error {
        if (head == null) throw new Error("LL is empty.");
        head = head.next;
        size--;
    }

    void deleteAtEnd() throws Error {
        if (head == null) throw new Error("LL is empty.");
        Node temp = head;
        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    void deleteAtIndex(int index) {
        if (head == null) throw new Error("LL is empty.");
        if (index >= size || index < 0) {
            throw new Error("Invalid Index!!");
        }
        if (index == 0) {
            deleteAtStart();
            return;
        }
        if (index == size - 1) {
            deleteAtEnd();
            return;
        }
        Node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "  ");
            temp = temp.next;
        }
        System.out.println();
    }

    void length() {
        System.out.println("Length of Linked List is: " + size);
    }

}

public class ImplementationLL {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);

        ll.length();

        ll.display();

        ll.insertAtStart(500);

        ll.display();

        ll.insert(0, 200);

        ll.display();

        ll.insert(2, 1000);

        ll.display();

        System.out.println(ll.getElement(2));
//        ll.getElement(-1);

        ll.setElement(1, 20);
        ll.display();

        ll.deleteAtIndex(2);
        ll.display();

    }
}
