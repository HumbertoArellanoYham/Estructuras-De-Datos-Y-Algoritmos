package implementations.stacks;

public class ExcerciseStack {
    Stack listElements = new Stack();
    Stack elementsMinor = new Stack();
    public void push(int value){
        listElements.push(value);

        if(elementsMinor.isEmpty() || value <= elementsMinor.peek()){
            elementsMinor.push(value);
        }

    }

    public int pop(){
        if(listElements.isEmpty()){
            throw new MyExceptionRuntimeNull("The stack is empty");
        }

        int valueDeleted = listElements.pop();
        if(!elementsMinor.isEmpty() && valueDeleted == elementsMinor.peek()){
            elementsMinor.pop();
        }

        return valueDeleted;
    }

    public int min(){
        return elementsMinor.peek();
    }
}
