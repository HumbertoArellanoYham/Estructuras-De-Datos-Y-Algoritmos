package LinkedList.example5;

public class NumberModule {
    public static void main(String[] args) {
       System.out.println(gettingModule(12));
    }
    public static int gettingModule(int number){
        number = number % 10;

        return number;
    }
}
