package Stack_DS;


class StackDS {
    private int[] arr = new int[5];
    private int idx = 0;

    void push(int x) {
        if (isfull()) {
            System.out.println("Stack is Full");
            return;
        }

        arr[idx] = x;
        idx++;
    }

    int pop() {
        if (idx == 0) {
            System.out.println("Stack is empty.");
            return -1;
        }
        int ele = arr[idx - 1];
        arr[idx - 1] = 0;
        idx--;
        return ele;
    }

    boolean isfull() {
        if (idx == arr.length) return true;
        else return false;
    }

    int size() {
        return idx;
    }

    boolean isEmpty() {
        if (idx == 0) return true;
        else return false;
    }

    void display() {
        for (int i = 0; i < idx; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}

public class StackImplementationUsingArray {
    public static void main(String[] args) {
        StackDS st = new StackDS();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        int ele = st.pop();
        System.out.println(ele);
        st.display();
        System.out.println(st.isfull());
        System.out.println(st.size());
        System.out.println(st.isEmpty());

    }
}
