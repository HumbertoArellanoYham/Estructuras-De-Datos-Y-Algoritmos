package stack.parentesis;

import examples.Stack;

// ({})

// ) }

public class ValidarParentesis {
    public boolean validar(String text){
        Stack stack = new Stack();

        for(char c : text.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(parejaCaracter(c));
            } else {
                if (stack.isEmpty() || stack.pop() != c)
                    return false;
            }
        }

        return true;
    }

    public char parejaCaracter(char c){
        if(c == '(') return ')';
        if(c == '{') return '}';
        if(c == '[') return ']';

        return 0;
    }
}
