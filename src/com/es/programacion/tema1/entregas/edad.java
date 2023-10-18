import java.util.Scanner;

public class edad {
    public static void main(String[] args) {


        int edad;
        System.out.println("Dime tu edad");
        Scanner scan = new Scanner(System.in);
        edad = scan.nextInt();
        if (edad>=18){
            System.out.println("Eres mayor de edad");
        }
        if (edad<18){
            System.out.println("Eres menor de edad");
        }





    }
}
