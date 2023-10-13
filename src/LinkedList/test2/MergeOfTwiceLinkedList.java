package LinkedList.test2;

public class MergeOfTwiceLinkedList {
    public Node mergeLinkedListSolution(Node list1, Node list2){
        Node dummy = new Node(Integer.MIN_VALUE);

        Node current = dummy;
        while(list1 != null && list2 != null){
            if(list1.value <= list2.value){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if(list1 == null){
            appendToNewLinkedList(current, list2);
        } else {
            appendToNewLinkedList(current, list1);
        }

        return dummy.next;
    }

    public void appendToNewLinkedList(Node current, Node linkedListToMerge){
        while(linkedListToMerge != null){
            current.next = linkedListToMerge;
            linkedListToMerge = linkedListToMerge.next;

            current = current.next;
        }
    }
}
