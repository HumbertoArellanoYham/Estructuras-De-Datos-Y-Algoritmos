package queue.excercise3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StackOrdered myStack = new StackOrdered();

        Deque<Integer> stackMessy = new ArrayDeque<>();

        stackMessy.add(5);
        stackMessy.add(1);
        stackMessy.add(4);
        stackMessy.add(2);

        printStackSorted(myStack.ordenar(stackMessy));

    }

    public static void printStackSorted(Deque<Integer> stackA){
        for (Integer element : stackA) {
            System.out.println(element);
        }
    }
}
