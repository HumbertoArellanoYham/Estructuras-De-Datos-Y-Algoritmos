package examples;

public class MyQueue {
    private Stack firstStack;
    private Stack secondStack;

    public void add(Integer value){
        firstStack = new Stack();
        firstStack.push(value);
    }

    public int remove(){
        switchStack();
        secondStack = new Stack();
        return secondStack.pop();
    }

    private void switchStack() {
        secondStack = new Stack();

        if(secondStack.isEmpty()){
            while (!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }
        }
    }

    public int peek(){
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
