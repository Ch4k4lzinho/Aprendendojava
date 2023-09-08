package Projetodoraio;

import java.util.Locale;
import java.util.Scanner;
import Projetodoraio.calculadora; 

public class raio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        calculadora cal = new calculadora();


        System.out.println("digite o valor do raio");
        double raio = scan.nextDouble();

        double c = cal.circunferencia(raio);

        double v = cal.volume(raio);
      
        
        System.out.printf("Cirunferencia: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", cal.PI);




        scan.close();

    }

      
}
