package stack;

public class Stack {
    private Node top;

    public void push(int value){
        Node newTop = new Node(value);

        newTop.next = top;
        top = newTop;
    }

    public int pop(){
        int topValue = peek();
        top = top.next;

        return topValue;
    }

    public int peek(){
        if(isEmpty()){
            throw new MyStackExceptionRuntime("The stack is empty.");
        }

        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
