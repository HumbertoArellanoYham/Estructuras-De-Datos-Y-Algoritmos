package String;

/*
 * Un anagrama es una palabra creada a partir de la reordenación de las letras de otra palabra. Ej: saco - caso
 * Dado un array de strings, devuelve los anagramas agrupados. Cualquier orden es válido.
 *
 * Ejemplo:
 *  Input: words = ["saco", "arresto", "programa", "rastreo", "caso"].
 *  Output: [["saco", "caso"], ["arresto", "rastreo"], ["programa"]].
 */

import java.util.*;

public class Anagram {

    public List<List<String>> groupAnagrams(String[] strings){
        if(strings.length == 0 || strings == null) return Collections.emptyList();

        Map<String, List<String>> anagramMap = buildAnagramMap(strings);

        return new ArrayList<>(anagramMap.values());
    }

    private Map<String, List<String>> buildAnagramMap(String[] string){
        Map<String, List<String>> buildAnagram = new HashMap<>();

        for(String s: string){
            String hash = getAnagramHash(s);

            if(!buildAnagram.containsKey(hash)){
                buildAnagram.put(hash, new ArrayList<>());
            }

            buildAnagram.get(hash).add(s);
        }

        return buildAnagram;
    }

    private String getAnagramHash(String s){
        int[] lettersCount = new int[26];

        for(int c: s.toCharArray()){
            lettersCount[c - 'a']++;
        }

        return Arrays.toString(lettersCount);
    }
}
