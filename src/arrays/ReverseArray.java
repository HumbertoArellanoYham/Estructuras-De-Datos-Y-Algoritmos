package arrays;

/* Reverse de un array {1, 2, 3, 4, 5}
    Output: {5, 4, 3, 2, 1}
*/

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray reverse = new ReverseArray();
        int[] integerElements = {1, 2, 3, 4, 5};

        reverse.showElementsOnArray(reverveAnyArray(integerElements));
    }
    public static int[] reverveAnyArray(int[] array){
        for(int i = 0; i < array.length / 2; i++){
            int auxiliar = array.length - 1 - i;
            int temp = array[i];
            array[i] = array[auxiliar];
            array[auxiliar] = temp;
        }

        return array;
    }

    public void showElementsOnArray(int[] array){
        for(int element: array){
            System.out.print(element);
        }
    }
}
