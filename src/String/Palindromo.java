package String;

// Por ejemplo: madam -> madam

public class Palindromo {
    public boolean wordPalindromo(String word){
        if(word == null || word.isBlank()) return false;

        char[] palabraCarateres = word.trim().toCharArray();

        StringBuilder reverseBuilder = new StringBuilder();
        for(int i= palabraCarateres.length - 1; i >= 0; i--){
            reverseBuilder.append(palabraCarateres[i]);
        }

        return reverseBuilder.toString().equals(word);
    }
}
