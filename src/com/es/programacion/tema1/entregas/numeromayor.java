import java.util.Scanner;

public class numeromayor {
    public static void main(String[] args) {



       Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);


        int a;
        int b;
        int c;
        System.out.println("Dime 3 numeros");
        a= scan.nextInt();
        b=scan2.nextInt();
        c= scan3.nextInt();
        if(a>b && a>c){
            System.out.println("El mayor es "+a);}

            if(b>a && b>c){
                System.out.println("El mayor es "+b);
            }
                if(c>b && c>a){
                    System.out.println("El mayor es "+c);
                }



        }
    }

