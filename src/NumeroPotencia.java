/*
* Complejidad algoritmica: O(log n)
* Por que al momento de hacer iteraciones
* cada una de va dividiendo el valor de entrada / 2
* por lo que no realiza todo de forma lineal.
* */
public class NumeroPotencia {
    public float potenciaDeNumeros(float numero){
        float result = 0;

        while(numero > 1){
            result++;
            numero /= 2;
        }

        return result;
    }
}
