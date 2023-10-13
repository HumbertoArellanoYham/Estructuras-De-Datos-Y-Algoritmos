package arrays;

/* Dada dos string verificar si una es una permutation de la otra
    Test 1
*  input: "cota", "taco"
*  output: true;

    Test 2
*  input: "fuego", "fair"
*  output: false;
*  */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Permutations {


    public HashMap<String, List<String>> isPermutation(String[] stringsPermutation){
        HashMap<String, List<String>> buildPermutation = new HashMap<>();

        for(String s: stringsPermutation){
            String hash = getPermutationHash(s);

            if(!buildPermutation.containsKey(hash)){
                buildPermutation.put(hash, new ArrayList<>());

            }

            buildPermutation.get(hash).add(s);
        }

        return buildPermutation;
    }

   private String getPermutationHash(String s){
        int[] lettersCount = new int[26];

        for(char c : s.toCharArray()){
            lettersCount[c - 'a']++;
        }

        return Arrays.toString(lettersCount);
   }
}
