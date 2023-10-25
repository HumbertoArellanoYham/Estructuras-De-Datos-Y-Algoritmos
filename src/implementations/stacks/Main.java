package implementations.stacks;

public class Main {
    public static void main(String[] args) {
        ExcerciseStack stackMinorElement = new ExcerciseStack();

        stackMinorElement.push(4);
        stackMinorElement.push(1);
        stackMinorElement.push(8);

        System.out.println(stackMinorElement.min());
    }
}
