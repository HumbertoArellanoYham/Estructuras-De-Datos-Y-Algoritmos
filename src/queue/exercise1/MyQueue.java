package queue.exercise1;

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {
    Deque<Integer> firstStack = new ArrayDeque<>();
    Deque<Integer> secondStack = new ArrayDeque<>();

    public void add(Integer value){
        firstStack.push(value);
    }

    private void switchStack(){
        if(secondStack.isEmpty()){
            while(!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }
        }
    }

    public Integer peek(){
        switchStack();

        return secondStack.peek();
    }

    public Integer remove(){
        switchStack();

        return secondStack.pop();
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public Integer size(){
        return firstStack.size() + secondStack.size();
    }
}
