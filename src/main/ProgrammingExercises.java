import java.util.ArrayList;

public class ProgrammingExercises {
    private Printer printer;

    public ProgrammingExercises(Printer printer){
        this.printer = printer;
    }

    private String repeatString(String ch,int times){
        String result = "";
        for (int i = 0;i < times;i++){
            result += ch;
        }
        return result;
    }

    public void easiestExercises(){
        printer.println("*");
    }

    public void DrawHorizontalLine(int n){
        String result = repeatString("*",n);
        printer.println(result);
    }

    public void DrawVerticalLine(int n) {
        for (int i = 0;i < n;i++){
            printer.println("*");
        }
    }

    public void DrawRightTriangle(int n) {
        String str = "";
        for (int i = 0;i < n;i++){
            str += "*";
            printer.println(str);
        }
    }

    private void PrintAsteriskAndBlank(int index,int n){
        String str = "";
        int asteriskNumber = 2 * index + 1;
        int blankNumber = n - index - 1;
        str += repeatString(" ",blankNumber);
        str += repeatString("*",asteriskNumber);
        printer.println(str);
    }


    public void DrawIsoscelesTriangle(int n) {
        for (int i = 0;i < n;i++){
            PrintAsteriskAndBlank(i,n);
        }
    }

    public void DrawDiamod(int n) {
        for (int i = 0;i < n;i++){
            PrintAsteriskAndBlank(i,n);
        }
        for (int i = n - 2;i >= 0;i--){
            PrintAsteriskAndBlank(i,n);
        }

    }

    public void DrawDiamodWithName(int n) {
        for (int i = 0;i < n - 1;i++){
            PrintAsteriskAndBlank(i,n);
        }
        printer.println("LGL");
        for (int i = n - 2;i >= 0;i--){
            PrintAsteriskAndBlank(i,n);
        }
    }

    public void FizzBuzz(int n) {
        for (int i = 1;i <= n;i++){
            if (i%3==0 && i%5==0){
                printer.println("FizzBuzz");
            }else if (i%3==0){
                printer.println("Fizz");
            }else if (i%5==0){
                printer.println("Buzz");
            }else {
                printer.println(""+i);
            }
        }
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
