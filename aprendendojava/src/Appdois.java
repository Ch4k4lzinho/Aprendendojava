
import java.util.Scanner;
import java.util.Locale;



public class Appdois {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int codigo, quantidade1, quantidade2;
    double valor1, valor2, valort;
    Locale.setDefault(Locale.US);
    

    //peca numero 1
    System.out.println("digite o codigo da peca numero 1");
    codigo = scan.nextInt();
    System.out.println("digite a quantidade de pecas numero 1");
    quantidade1 = scan.nextInt();
    System.out.println("digite o valor da peca numero 1");
    valor1 = scan.nextDouble();

    //peca numero 2
    System.out.println("digite o codigo da peca numero 2");
    codigo = scan.nextInt();
    System.out.println("digite a quantidade de pecas numero 2");
    quantidade2 = scan.nextInt();
    System.out.println("digite o valor da peca numero 2");
    valor2 = scan.nextDouble();

    valort = valor1 * quantidade1 + valor2 * quantidade2;

    System.out.printf("valor = %.2f%n", valort);






    
}
    
}
