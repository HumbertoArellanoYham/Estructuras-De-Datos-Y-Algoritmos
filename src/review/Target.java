package review;

/*Dado un arreglo de numeros enteros
* se deben sumar dos numeros que su resultado sea 7 como target
* Como resultado se debe debolver los índices del arreglo en donde
* se encuentran los valores que se van a sumar
*
* Ejemplo 1:
* [9, 2, 5, 8]
* [1, 2]
*
* Steps:
* Recorrer cada numero del arreglo
* operacion = target - arreglo[indice] = 7 - 9 = -2
*
* Se utilizara memoria adicional - HashMap
* Se guardara el indice y el valor
* [-2, 1]
*
* 7 - 2 = 5 [5, 1]
*
* como ya tenemos 5 como clave comprobaremos si lo tenemos en el hashmap
* si es asi retornamos ese clave e indice y el actual.
* */


import java.util.HashMap;

public class Target {
    public static void main(String[] args) {

    }

    public static int[] sumToIndex(int[] numbersArray, int target){
        if(numbersArray == null || numbersArray.length <= 1) return null;

        HashMap<Integer, Integer> mappingTheElements = new HashMap<>();

        for (int i = 0; i < numbersArray.length; i++) {
            if (mappingTheElements.containsKey(numbersArray[i])) return new int[]{mappingTheElements.get(numbersArray[i]), i};
            int foundTarget = target - numbersArray[i];
            mappingTheElements.put(foundTarget, i);
        }

        return null;
    }

}
