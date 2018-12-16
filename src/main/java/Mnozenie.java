public class Mnozenie {

    public static void main(String args[]){

        int width = 5;
        int height = 10;

        for (int i = 1; i <= height ; i++) {
            System.out.print("\n");
            for (int j = 1; j <= width ; j++) {
                System.out.print(i + " x " + j + " = " + i*j + "\t");
            }

        }
    }
}
