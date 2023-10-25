package queue.exercise4;

public class Main {
    public static void main(String[] args) {
        MinimumElement minor = new MinimumElement();
        minor.push(5);
        minor.push(2);
        minor.push(4);
        minor.push(6);

        System.out.println(minor.min());
        System.out.println(minor.pop());
    }
}
