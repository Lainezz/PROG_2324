package com.es.programacion.tema2.entregas;//biblioteca
import java.util.Scanner;

//inicio clase
public class Main {

    //inicio función login
    public static int login() {

        //declaración de variables
        String usuario, cusuario, contrasena, ccontrasena;
        int opcion;
        int fallocontrasena = 0;
        int fallousuario = 0;

        //mensaje de bienvenida
        System.out.println();
        System.out.println("Bienvenido a la cafetería");

        //inicio estructura bucle do-while
        do {
            Scanner scan = new Scanner(System.in);
            usuario = "Pepe";
            contrasena = "1234";

            //inicio estructura bucle do-while
            do {

                //inicio estructura condicional if
                if (fallousuario == 1) {
                    System.out.println();
                    System.out.println("El usuario que has introducido es incorrecto.");
                    fallousuario=0;
                }
                //fin estructura condicional if

                //inicio estructura condicional if
                if (fallocontrasena == 1) {
                    System.out.println();
                    System.out.println("La contraseña que has introducido es incorrecta.");
                    fallocontrasena=0;
                }
                //fin estructura condicional if

                System.out.println("1.Iniciar sesión");
                System.out.println("2.Salir");
                opcion = scan.nextInt();

                //inicio estructura condicional if
                if (opcion == 2) {
                    return opcion;
                }
                //fin estructura condicional if

                System.out.println();
                System.out.println("Di el nombre de usuario:");
                cusuario = scan.next();

                //inicio estructura condicional if
                if (!usuario.equals(cusuario)) {
                    fallousuario++;
                }
                //fin estructura condicional if

            } while (!cusuario.equals(usuario));
            //fin estructura bucle do-while

            System.out.println();
            System.out.println("Di el nombre de contraseña");
            ccontrasena = scan.next();

            //inicio estructura condicional if
            if (!contrasena.equals(ccontrasena)) {
                fallocontrasena++;
            }
            //fin estructura condicional if

        } while (!contrasena.equals(ccontrasena));
        //fin estructura bucle do-while

        return opcion;
    }
    //fin función login

    //inicio función menu
    public static int[] menu(int contcafe,int contagua, int contostada) {

        Scanner scan = new Scanner(System.in);
        int seleccion;
        System.out.println();
        //Mensaje de bienvenida
        System.out.println("Bienvenido Pepe");

        //inicio estructura bucle do-while
        do {
            System.out.println("1. Café  1€");
            System.out.println("2. Agua  0,50€");
            System.out.println("3. Tostada  1,20€");
            System.out.println("0 Terminar/Salir");
            System.out.println(contcafe);
            System.out.println(contagua);
            System.out.println(contostada);
            seleccion = scan.nextInt();

            //estructura condicional switch
            switch (seleccion){

                //inicio caso 1
                case 1:

                    //inicio estructura condicional if
                    if(seleccion==1) {
                        contcafe++;
                    }
                    //fin estructura condicional if
                //fin caso 1

                //inicio caso 2
                case 2:

                    //inicio estructura condicional if
                    if(seleccion==2) {
                        contagua++;
                    }
                    //fin estructura condicional if
                //fin caso 2

                //inicio caso 3
                case 3:
                    //inicio estructura condicional if
                    if(seleccion==3) {
                        contostada++;
                    }
                    //fin estructura condicional if
                //fin caso 3

                //inicio caso 0
                case 0:
                    break;
                //fin caso 0

            }
            //fin estructura condicional switch

        }while(seleccion!=0);
        //fin estructura bucle do-while

        //retorno de variable
        return new int[]{contcafe,contagua,contostada};

    }
    //fin funcion menu

    //inicio función caja
    public static void caja(int resultados[]) {

        //inicio estructura condicional if
        if(resultados[0]>0) {
            System.out.println("Has seleccionado " + resultados[0] + " de la categoría café.");
        }
        //fin estructura condicional if
        //inicio estructura condicional if
        if(resultados[1]>0) {
            System.out.println("Has seleccionado " + resultados[1] + " de la categoría agua.");
        }
        //fin estructura condicional if
        //inicio estructura condicional if
        if(resultados[2]>0) {
            System.out.println("Has seleccionado " + resultados[2] + " de la categoría tostada.");
        }
        //fin estructura condicional if

        //declarar variable precio de tipo racional
        double precio;

        //Calcular precio y mostrar por pantalla
        precio = (double) (resultados[0] + (resultados[1]*0.5) + (resultados[2]*1.2));
        System.out.println("El precio total a pagar es de "+precio+"€.");
        //Mensaje de despedida
        System.out.println("Adiós");

    }
    //fin función caja

    //método main
    public static void main(String[] args) {

        //función 1 que recoge la variable opcion
        int opcion = login();

        //inicio estructura condicional if
        if (opcion == 2) {
            //mensaje de despedida
            System.out.println("Adiós");
            return;
        }
        //fin estructura condicional if

        //declaración e inicialización de variables
        int contcafe=0,contagua=0,contostada=0;

        //función 2 que recoge la variable resultados
        int[] resultados = menu(contcafe,contagua,contostada);

        //función 3
        caja(resultados);
    }
    //fin método main
}
//fin clase



//Preguntas:
//a. ¿Cuál es la parte más compleja a la hora de trabajar con bucles
//La parte más difícil sería controlar la condición, ya que puede generar muchos problemas,
//como por ejemplo que no salga del bucle o que no se repita las veces que uno quiera.

//b. ¿Por qué has decidido utilizar un bucle while en lugar de un do-while? (O al revés si así ha sido el caso)
//Utilizo el bucle do-while porque es más cómodo para menús, ya que no hace falta inicializar
//variables y los menús se tienen que repetir al menos una vez.

//c. ¿Cuál ha sido la parte más compleja de la práctica?
//La parte más complicada ha sido con el .equals, que no me acordaba que era el que había
//que usar con variables de tipo string.