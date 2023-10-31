
    import java.util.Scanner;

    public class cafeteria1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int c;//aqui declaro las variables necesarias
            String user = "pirri";
            String password = "nont";
            String inte = "";
            String inte2 = "";
            double carrito =0;
            double tostada=1.20;
            double cafe=1;
            double agua=0.5;
            int numerodetostadas=0;
            int numerodecafes=0;
            int numerodeaguas=0;


            do {//aqui se encuentra la zona de login donde iniciamos la contraseña y usamos un od while para hacer un bucle hasta iniciar correctamente
                System.out.println("Bienvenido a la zona de bienvenida y login");
                System.out.println("por favor introduzca su usuario ");
                inte = scan.next();
                System.out.println("por favor introduzca su contraseña ");
                inte2 = scan.next();


            }while (!inte.equals(user) || !inte2.equals(password) );
            System.out.println("sesión iniciada");
            System.out.println("Bienvenido a la cafeteria  "+inte);
            do {//esta parte es el menu de la cafeteria en la que se usa otro do while para hacer un bucle
                System.out.println("1 Café con leche 1€");
                System.out.println("2 Agua mineral 0.5€");
                System.out.println("3 Tostada con aceite 1.20€");
                System.out.println("0 Terminar/salir");
                c = scan.nextInt();

                if (c == 1) {// con los if hacemos los condicionales que nos sumaran los diferentes productos que compraremos
                    numerodecafes=numerodecafes+1;
                    carrito = carrito + cafe;
                    System.out.println("ha escogido un café con leche");
                }
                if (c == 2) {
                    numerodeaguas=numerodeaguas+1;
                    carrito = carrito + agua;
                    System.out.println("ha escogido un agua mineral");

                }
                if (c == 3) {
                    numerodetostadas=numerodetostadas+1;
                    carrito=carrito+tostada;
                    System.out.println("ha escogido una tostada con aceite");

                }
                if (c == 0) {
                    if (carrito==0){
                        System.out.println("Hasta la próxima");
                    }else
                        System.out.println("Son "+carrito+" euros");
                    if (numerodetostadas==1){
                        System.out.println(numerodetostadas+" tostada con aceite");
                    }else if(numerodetostadas==0){
                    }else {
                        System.out.println(numerodetostadas+" tostadas con aceite");
                    }
                    if (numerodecafes==1){//para despues sumar todos los productos con la tecla 0 y nos saldra un texto con la cantidad total de euros a pagar
                        System.out.println(numerodecafes+" cafe con leche");
                    }else if(numerodecafes==0){
                    }else {
                        System.out.println(numerodecafes+" cafes con leche");
                    }
                    if (numerodeaguas==1){
                        System.out.println(numerodeaguas+" agua mineral");
                    }else if(numerodeaguas==0){
                    }else {
                        System.out.println(numerodeaguas+" aguas minerales");
                    }


                }


            } while (c !=0);//y aqui termina el codigo con un mensaje de despedida
            System.out.println("Adios muchas gracias por comprar en nuestro establecimiento");


        }
    }


