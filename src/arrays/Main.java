package arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main principal = new Main();
        System.out.println(principal.getPermutation("taco", "cote"));

    }

    public boolean getPermutation(String text1, String text2){
        String hashText1 = getPermutationHash(text1);
        String hashText2 = getPermutationHash(text2);

        return hashText1.equals(hashText2);
    }

    private String getPermutationHash(String s){
        int[] lettersCount = new int[26];

        for(char c : s.toCharArray()){
            lettersCount[c - 'a']++;
        }

        return Arrays.toString(lettersCount);
   }
}
