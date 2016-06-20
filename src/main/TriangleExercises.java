public class TriangleExercises {
    private Printer printer;

    public TriangleExercises(Printer printer) {
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


}
