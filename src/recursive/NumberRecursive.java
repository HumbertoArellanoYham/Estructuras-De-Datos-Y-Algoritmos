package recursive;

public class NumberRecursive {
    public int recursiveMethod(int number){
        if(number < 0) {
            return -1;
        } else if (number == 0){
            return 1;
        } else
            return number * recursiveMethod(number - 1);
    }
}
