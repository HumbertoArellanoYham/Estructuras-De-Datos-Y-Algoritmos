package OtherAlgorithms;

/*Multiplication de dos numeros
* Lo que se debe tener en cuenta,
* es que no se debe utilizar el operador de multiplicar.*/
public class MultiplicacionConSuma {
    public int mulplicationDeDosNumeros(int a, int b){
        int resultMultiplication = 0;

        for(int i = 0; i < b; i++){
            resultMultiplication += a;
        }

        return  resultMultiplication;
    }
}
