
import java.util.Scanner;

public class Appquatro {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int numero;
    System.out.println("digite um numero e veja se ele é impar ou par");
    numero = scan.nextInt();

    if(numero % 2 == 0){
        System.out.println("é par");

    }else{System.out.println("é impar");}
    


    scan.close();

}
    
}
