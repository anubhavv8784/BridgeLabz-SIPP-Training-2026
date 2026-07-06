import java.util.*;

class Stack<T> {

    ArrayList<T> list = new ArrayList<>();

    void push(T data) {
        list.add(data);
    }

    T pop() {
        return list.remove(list.size() - 1);
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Removed : " + s.pop());
    }
}