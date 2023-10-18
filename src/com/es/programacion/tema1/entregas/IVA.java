import java.util.Scanner;

public class IVA {
    public  static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Dime el precio del artículo");

        int articulo;
        articulo = scan.nextInt();

        double IVA = ((articulo * 21)/100);

        System.out.println("El precio del iva es" +IVA);

        double preciofin = articulo + IVA;

        System.out.println("El precio final es" + preciofin);















    }
}
