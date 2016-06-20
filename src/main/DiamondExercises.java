public class DiamondExercises {
    private Printer printer;

    public DiamondExercises(Printer printer){
        this.printer = printer;
    }

    private String repeatString(String ch,int times){
        String result = "";
        for (int i = 0;i < times;i++){
            result += ch;
        }
        return result;
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

}
