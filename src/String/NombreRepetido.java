package String;

/*Lista de nombre = "Juan", "Marcos", "Luis" "Maria", "Juan"
* Eliminar nombre duplicado en la lista.
*
* Primer nombre:
* Juan
*
* Iteracion siguiente:
* Marcos
*
* Operacion
* Juan = Marcos : false -> Siguiente..
* */

import java.util.*;

public class NombreRepetido {
    public Map<Integer, String> listaConNombreNoRepetidos(List<String> lista){
        Map<Integer, String> mapaDeNombre = new HashMap<>();

        for (int i = 0; i < lista.size(); i++) {

            if(!mapaDeNombre.containsValue(lista.get(i))){
                mapaDeNombre.put(i, lista.get(i));
            }

        }

        return mapaDeNombre;
    }
}
