package queue.exercise2test;

import queue.exercise1.MyQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(9);
        myQueue.add(10);

        System.out.println(myQueue.remove());
        System.out.println(myQueue.peek());
        myQueue.add(6);

        System.out.print(System.lineSeparator());
        while(!myQueue.isEmpty()){
            System.out.println(myQueue.remove());
        }
    }
}
