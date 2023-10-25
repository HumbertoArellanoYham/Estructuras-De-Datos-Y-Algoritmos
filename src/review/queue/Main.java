package review.queue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue();

        myQueue.add(5);
        myQueue.add(6);
        myQueue.add(7);
        myQueue.add(8);

        System.out.println(myQueue.remove());
    }
}
