package review;

import java.util.*;

/*
 * Un anagrama es una palabra creada a partir de la reordenación de las letras de otra palabra. Ej: saco - caso
 * Dado un array de strings, devuelve los anagramas agrupados.
 *
 * Ejemplo:
 *  Input: words = ["saco", "arresto", "programa", "rastreo", "caso"]
 *  Output: [["saco", "caso"], ["arresto", "rastreo"], ["programa"]].
 *
 * Step 1
 * Guardar el hash de de la palabra el el hashmap como clave.
 * Si la siguiente palabra en el array contiene el mismo hash se agregará se agregara a su lista de valores.
 *

 * Si no se encuentra la clave del hash entonces se agregará otra clave e incluira su conversion a hash y
 * y como valor una lista de string
 *
 * Ejemplo Hash de saco y su anagrama
 * 0101...0...1...0 -> list<String> = "caso"
 *
 * Step 3
 * Para convertir el hash necesitamos la tabla ascci y la la longitud del abecedario
 * para que, el dado caso encontramos un caracter igual de agregar o un '0' si no hay o un
 * '1' si lo encuentra.
 */
public class Anagram {
   public static void main(String[] args) {
      String[] wordsForFoundAnagram = {"saco", "arresto", "programa", "rastreo", "caso"};

      Iterator<List<String>> newIterator = anagram(wordsForFoundAnagram).iterator();

      while(newIterator.hasNext()){
         System.out.println(newIterator.next());
      }
   }

   public static List<List<String>> anagram(String[] array){
      if(array == null || array.length == 0) return Collections.emptyList();

      Map<String, List<String>> buildMapWithAnagrams = foundAnagram(array);

      return new ArrayList<>(buildMapWithAnagrams.values());
   }

   private static Map<String, List<String>> foundAnagram(String[] array){
      Map<String, List<String>> wordAnagramMap = new HashMap<>();

      for (String words: array) {
         String hash = getHashWord(words);

         if(!wordAnagramMap.containsKey(hash)){
            wordAnagramMap.put(hash, new ArrayList<>());
         }

         wordAnagramMap.get(hash).add(words);
      }

      return wordAnagramMap;
   }

   private static String getHashWord(String word){
       int[] charArray = new int[26];

       for(char c : word.toCharArray()){
          charArray[c - 'a']++;
       }

       return Arrays.toString(charArray);
   }
}

