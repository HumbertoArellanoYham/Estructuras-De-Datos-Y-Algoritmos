package queue.exercise2test;

/* You use two stack for implemente a queue *  methods:
*   - add(integer)
*   - remove()
*   - peek()
*   - size()
*   */

import java.util.ArrayDeque;
import java.util.Deque;

public class MyQueue {
    Deque<Integer> firstStack = new ArrayDeque<>();
    Deque<Integer> secondStack = new ArrayDeque<>();

    public void add(Integer value){
        firstStack.push(value);
    }

    public Integer remove(){
        switchStack();
        return secondStack.pop();
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

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size(){
        return firstStack.size() + secondStack.size();
    }

}
