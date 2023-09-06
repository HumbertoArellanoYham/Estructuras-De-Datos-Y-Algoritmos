/*
* Copiar todos los elementos de un arreglo hacia otro.
* Entrada: {5, 2, 4, 6}
 */
public class CopyToArrayNew {
    public int[] arrayCopy(int[] array){
        int[] copy = new int[0];

        for(int valor: array){
            copy = appendToNew(copy, valor);
        }

        return copy;
    }

    private int[] appendToNew(int[] array, int valor){
        int[] bigger = new int[array.length + 1];

        for(int i = 0; i < array.length; i++){
            bigger[i] = array[i];
        }

        bigger[bigger.length - 1] = valor;

        return bigger;
    }
}
