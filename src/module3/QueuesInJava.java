package module3;

import java.util.ArrayDeque;

public class QueuesInJava {

    public static void main(String[] args) {


        ArrayDeque<Object> stack = new ArrayDeque<>();
        stack.push(null);
        stack.peek();
        stack.poll();

        ArrayDeque<Object> deque = new ArrayDeque<>();
        deque.offer(null);
        deque.peek();
        deque.poll();


    }

}
