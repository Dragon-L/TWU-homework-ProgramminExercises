public class FizzBuzzExercise {
    private Printer printer;

    public FizzBuzzExercise(Printer printer){
        this.printer = printer;
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
}
