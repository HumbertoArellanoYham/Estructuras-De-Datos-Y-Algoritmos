/* Algoritmo de pares.
* Dado un array de enteros [18, 25, 10, 15]
* Mostrar en pantalla todos los pares disponibles.
* salida:
*            18,25 - 18,10 - 18,15
*               25,10 - 25,15
*                   10,15
* */
public class BusquedaDePares {
    public void AlgoritmoDePares(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                System.out.println(array[i] + " " + array[j]);
            }
        }
    }
}
