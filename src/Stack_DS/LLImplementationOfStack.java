package Stack_DS;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class MyStack {
    Node head;
    int len;

    void push(int ele) {
        Node temp = new Node(ele);
        if (len == 0) head = temp;
        else {
            temp.next = head;
            head = temp;
        }
        len++;
    }

    int peek() {
        return head.val;
    }

    int pop() throws Exception {
        if (len == 0) {
            throw new Exception("STACK UNDERFLOW!!");
        }
        int x = head.val;
        head = head.next;
        len--;
        return x;
    }

    int size() {
        return len;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LLImplementationOfStack {
    public static void main(String[] args) throws Exception {
        MyStack st = new MyStack();
//        st.pop(); // Throw exceptionf
        st.push(12);
        st.push(10);
        st.push(13);
        st.push(17);
        st.push(18);
        st.display();

        System.out.println("PEEK: " + st.peek());

        int val = st.pop();
        System.out.println("POP: " + val);

        st.display();

        System.out.println("SIZE: " + st.size());
    }
}
