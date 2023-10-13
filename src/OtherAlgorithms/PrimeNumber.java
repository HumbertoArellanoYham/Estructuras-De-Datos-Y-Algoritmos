package OtherAlgorithms;

// Verified of the prime number log O(1)

public class PrimeNumber {
    public boolean isPrime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                return false;
            }
        }

        return true;
    }
}
