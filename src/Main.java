import LinkedList.exercice1.Node;
import LinkedList.exercice1.SingleLinkedList;
import String.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList linked_list = new SingleLinkedList();

        linked_list.appendToTaTail(4);
        linked_list.appendToTaTail(5);
        linked_list.appendToTaTail(8);

        linked_list.printLinkedList();

        linked_list.deleteNode(5);
        linked_list.printLinkedList();


/*
        List<String> lista = Arrays.asList("Juan", "Marcos", "Luis", "Maria", "Juan", "Paty", "Maria");
        NombreRepetido nombreRepetido = new NombreRepetido();

        for (Integer clave: nombreRepetido.listaConNombreNoRepetidos(lista).keySet()) {
            String valor = nombreRepetido.listaConNombreNoRepetidos(lista).get(clave);

            System.out.println("Clave " + clave + "Valor " + valor);
        }
*/

/*
        Palindromo palindromo = new Palindromo();
        boolean word = palindromo.wordPalindromo("madam");

        System.out.println("Es una palabra palindromo: " + word);
*/

        /*
        // Arreglo desordenado = {18, 25, 10, 19};
        // positionNumber = 3
        int[] array = {18, 25, 10, 19};

        StringBuilder reverseArrayCorrect = new StringBuilder("{");
        for (int number: Algoritmo.reverseArray(array)){
            reverseArrayCorrect.append(" ").append(number);
        }

        reverseArrayCorrect.append(" }");

        System.out.println(reverseArrayCorrect);

        * Complejidad Algoritmica.
        * Para este tipo de algoritmo la complejidad algoritmica es Big O(N),
        * por que es lineal, si el numero de entradas del array crece este tambien lo hara.
        * */

        /*
        BusquedaDePares busquedaDePares = new BusquedaDePares();
        int[] arrayDeEnteros = {18, 25, 10, 15};

        busquedaDePares.AlgoritmoDePares(arrayDeEnteros);
        */

        /*
        MultiplicacionConSuma multiplicacionConSuma = new MultiplicacionConSuma();
        int product = multiplicacionConSuma.mulplicationDeDosNumeros(5, 3);

        System.out.println(product);
        */

        /*
        int[] array = {5, 15, 12, 24};
        CopyToArrayNew copyToArrayNew = new CopyToArrayNew();

        for (int value : copyToArrayNew.arrayCopy(array)){
            System.out.println(value);
        }

        int[] newArrayCopy = copyToArrayNew.arrayCopy(array);

        System.out.println(Arrays.equals(array, newArrayCopy));
        */

//        int[] arrayA = {10, 15, 4, 2};
//        int[] arrayB = {12, 18, 1, 9};
//        PrintParesOfTheTwoArrays printParesOfTheTwoArrays = new PrintParesOfTheTwoArrays();
//        printParesOfTheTwoArrays.paresDeDosArray(arrayA, arrayB);


        /*
        int[] arrayDesordenado = {4, 8, 2, 1};
        BubbleSort bubbleSort = new BubbleSort();
        int[] orderedArray = bubbleSort.sortOfTheArray(arrayDesordenado);

        for(int valor: orderedArray){
            System.out.println(valor);
        }
        */

/*
        Factorial factorial = new Factorial();
        int result = factorial.factorialConRecursividad(5);
        System.out.println(result);
*/

/*
        NumeroPotencia numeroPotencia = new NumeroPotencia();
        System.out.println(numeroPotencia.potenciaDeNumeros(10));
*/

/*
        TargetNumber stringProblemTwoSum = new TargetNumber();
        int[] result = stringProblemTwoSum.twoSum(new int[] {9, 2, 5, 6}, 7);
        for(Integer valores: result){
            System.out.println(valores);
        }
*/
    }

    public static class Algoritmo {

        public Algoritmo(){}
        public static int[] reverseArray(int[] array){
            for (int i = 0; i < array.length /2; i++){
                int positionNumber = array.length - 1 - i;
                int valueTemp = array[i];
                array[i] = array[positionNumber];
                array[positionNumber] = valueTemp;
            }

            return array;
        }
    }
}