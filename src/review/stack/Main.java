package review.stack;

import review.Node;

public class Main {
    public static void main(String[] args) {
        Stack stack1 = new Stack();

        stack1.push(9);
        stack1.push(11);
        stack1.push(10);
        stack1.push(5);
        stack1.push(4);

        System.out.println(stack1.pop()); //
        System.out.println(stack1.peek());
        System.out.println(stack1.isEmpty()); // false;
        System.out.print(System.lineSeparator());
        stack1.printAllToEliminate();
    }
}
