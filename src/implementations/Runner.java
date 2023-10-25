package implementations;

public class Runner {
    public Node returnValueOfTheIndex(Node list, Integer index){
        Node first = list;
        Node second = list;

        for(int i = 0; i < index; i++){
            if(first == null){
                return null;
            }

            first = first.next;
        }

        while(first.next != null){
            first = first.next;
            second = second.next;
        }

        return second;
    }
}
