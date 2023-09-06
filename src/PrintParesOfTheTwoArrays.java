public class PrintParesOfTheTwoArrays {
    public void paresDeDosArray(int[] arrayA, int[] arrayB){
        for(int valorA : arrayA){
            for(int valorB: arrayB){
                System.out.println(valorA + " " + valorB);
            }
        }
    }
}
