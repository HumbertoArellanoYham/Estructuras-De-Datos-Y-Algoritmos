package queue.exercise4;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinimumElement {
    Deque<Integer> valuesInTheStackA = new ArrayDeque<>();
    Deque<Integer> elementsMinor = new ArrayDeque<>();

    public void push(Integer data){
        valuesInTheStackA.push(data); //4 - 2 - 5

        if(elementsMinor.isEmpty() || data <= elementsMinor.peek()){ // 2 - 4
            elementsMinor.push(data);
        }
    }

    public int pop(){
        int remove = valuesInTheStackA.pop();  // 5
        if(remove == elementsMinor.peek()){
            elementsMinor.pop();
        }

        return remove;
    }

    public int min(){
        return elementsMinor.peek();
    }
}
