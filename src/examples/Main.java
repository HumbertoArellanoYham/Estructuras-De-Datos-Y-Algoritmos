package examples;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.add(5);
        myQueue.add(8);
        myQueue.add(6);

        // See the first element.
        System.out.println(myQueue.peek());
        System.out.println(myQueue.size());

        // Delete first element.
    }
}
