import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class hORA {
    public static void main(String[] args){

        int hora;
        int minutos;
        int segundos;

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);

        System.out.println("Introduce hora , minutos y segundos");

        hora = scan.nextInt();
        minutos = scan2.nextInt();
        segundos = scan3.nextInt();
       if(segundos>= 60 && minutos>= 60){
           int minutost = ((minutos + 1)-60);
           int segundost = segundos - 60;
           int horast = hora + 1;


           System.out.println("Tienes "+horast+" hora "+minutost+" minutos "+segundost+" segundos");
       }













    }
}
