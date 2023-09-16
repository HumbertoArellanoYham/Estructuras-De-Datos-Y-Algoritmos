package OtherAlgorithms;

public class BubbleSort {
    public int[] sortOfTheArray(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            for (int j = i + 1; j < array.length; j++){
                if(array[j] < array[i]){
                    int temporal = array[j];
                    array[j] = array[i];
                    array[i] = temporal;
                }
            }
        }

        return array;
    }
}
