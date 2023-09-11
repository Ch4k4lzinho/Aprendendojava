package atvd3;
import java.util.Locale;
import java.util.Scanner;

public class atvtres {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    System.out.println("digite o valor dos lados do triangulo");
    double lado1 = scan.nextDouble();
    double lado2 = scan.nextDouble();
    double lado3 = scan.nextDouble();

    if(lado1 == lado2 && lado2 == lado3){
        System.out.println("esse triangolo é equilatero");
    }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
        System.out.println("esse triangulo é isosceles");
    }else if(lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
        System.out.println("esse triangulo é escaleno");
    }


















    scan.close();
}
    
}
