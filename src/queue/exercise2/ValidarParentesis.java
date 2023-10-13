package queue.exercise2;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidarParentesis {
    public static void main(String[] args) {
        ValidarParentesis oposition = new ValidarParentesis();

        System.out.println(oposition.validar("([]){}"));
        System.out.println(oposition.validar("({)[]"));
    }

    public boolean validar(String s){
        Deque<Character> deque = new ArrayDeque<>();

        for(char c: s.toCharArray()){
            if(c == '{' || c == '(' || c == '['){
                deque.push(getReverse(c));
            } else {
                if(deque.isEmpty() || deque.pop() != c){
                    return false;
                }
            }
        }

        return deque.isEmpty();
    }

    private char getReverse(char c){
        if(c == '{') return '}';
        if(c == '[') return ']';
        if(c == '(') return ')';

        return 0;
    }
}
