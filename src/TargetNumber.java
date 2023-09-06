import java.util.HashMap;
import java.util.Map;

/*Target = 7
* Array = {9, 2, 5, 6}
*
* Mapa (key, value)
* Va a guardar (valor, indice)
*       9 , 0
*
* Operacion 7 - 9 = -2
*           7 - 2 = 5
*           7 - 5 = 2
*
* Primera iteracion
* Mapa { -2, 0
*         5, 1}
* */

public class TargetNumber {
    public int[] twoSum(int[] numeros, int target){
        if(numeros.length < 2 || numeros == null) return null;

        Map<Integer, Integer> complementMap = new HashMap<>();
        for(int i = 0; i < numeros.length; i++){
            if(complementMap.containsKey(numeros[i])){ return new int[] {i, complementMap.get(numeros[i])}; }
            int complement = target - numeros[i];
            complementMap.put(complement, i);
        }

        return null;
    }
}
