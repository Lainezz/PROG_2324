import java.util.Scanner;

public class KM {
    public static void main(String[] args){

        double km;

        Scanner scan = new Scanner(System.in);
        System.out.println("Dime los kilometros para hacer el cálculo");

         km= scan.nextInt();

         double millas = km * 1.6;

        System.out.println("Son " + millas + "millas");
    }
}
