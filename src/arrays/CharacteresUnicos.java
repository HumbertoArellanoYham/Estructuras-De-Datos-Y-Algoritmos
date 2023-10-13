package arrays;

import java.util.HashSet;

public class CharacteresUnicos {
    public static void main(String[] args) {
        CharacteresUnicos uniqueTest = new CharacteresUnicos();

        String test1 = "libro";
        String test2 = "galea";

        System.out.println(uniqueTest.approach2(test1));
        System.out.println(uniqueTest.approach2(test2));

        /*
        System.out.println(uniqueTest.validation(test1));
        System.out.println(uniqueTest.validation(test2));
        */

    }

    // Complejidad O(n^2) sin temporalidad adicional
    public boolean approach2(String text){
        char[] textToChar = text.toCharArray();
        char[] uniqueCharArray = new char[textToChar.length];

        int contador = 0;
        char caracter;
        for(int c = 0; c < textToChar.length; c++){
            caracter = textToChar[c];
            for(int next = 0; next < textToChar.length; next++){
                if (caracter == textToChar[next]) {
                    uniqueCharArray[c] = caracter;
                    contador++;
                }
            }

            if(contador > 1){
                return false;
            } else {
                contador = 0;
            }
        }

        return true;
    }

    // Complejidad O(n) + adicional Temporalidad espacial O(n) = O(n^2)
    public boolean validation(String text) {
        HashSet<Character> unicoChar = new HashSet<>();

        char[] caracteres = text.toCharArray();

        for(int c = 0; c < text.toCharArray().length; c++){
            if(!unicoChar.add(caracteres[c])){
                return false;
            }
        }

        return true;
    }

}
