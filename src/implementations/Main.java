package implementations;

public class Main {
    public static void main(String[] args) {
        Runner runner = new Runner();

        Node head = new Node(4);
        head.next = new Node(3);
        head.next.next = new Node(8);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(8);
        head.next.next.next.next.next = new Node(0);

        Node result = runner.returnValueOfTheIndex(head, 2);

        System.out.println(result.value);
    }

}
