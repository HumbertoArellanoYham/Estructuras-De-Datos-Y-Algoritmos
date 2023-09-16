package OtherAlgorithms;

public class Factorial {
    public int factorial(int numero){
        int resultFinal = 1;

        for(int i = 1; i <= numero; i++){
            resultFinal *= i;
        }

        return resultFinal;
    }

    public int factorialConRecursividad(int numero){
        if(numero <= 1){
            return 1;
        }

        return numero * factorialConRecursividad(numero - 1);
    }
}
