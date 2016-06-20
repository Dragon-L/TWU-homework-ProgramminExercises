import java.util.ArrayList;

public class PrimeFactorsExercise {
    private Printer printer;

    public PrimeFactorsExercise(Printer printer){
        this.printer = printer;
    }

    public ArrayList<Integer> Prime(int n) {
        ArrayList<Integer> lastList = new ArrayList<Integer>();
        Integer min = 2;
        if (n == 1){
            return new ArrayList<Integer>();
        }
        if (min == n){
            lastList.add(min);
            return lastList;
        }
        while (!(n % min == 0)){
            min++;
        }
        lastList = Prime(n / min);
        lastList.add(0,min);

        return lastList;

    }

}
