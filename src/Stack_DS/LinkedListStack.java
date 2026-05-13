package Stack_DS;

class LinkedListStack {
    private Node head;
    private int size = 0;

    public LinkedListStack() {
        this.head = null;
    }

    public void push(int x) {
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow.");
            return -1;
        }
        int popEle = head.value;
        head = head.next;
        size--;
        return popEle;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is Empty.");
            return -1;
        }
        return head.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        Node tempHead = this.head;
        displayRecursive(tempHead);
        System.out.println();
    }

    public void displayRecursive(Node head) {
        if (head == null) return;
        displayRecursive(head.next);
        System.out.print(head.value + " ");
    }

    private class Node {
        int value;
        Node next;

        Node(int val) {
            this.value = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListStack st = new LinkedListStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.display();
        int ele = st.pop();
        System.out.println(ele);
        st.display();
        System.out.println(st.isEmpty());
        System.out.println(st.top());
    }
}
