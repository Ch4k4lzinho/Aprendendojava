import java.util.Scanner;
import java.util.Locale;


public class Appone {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);
    int nfuncionario; 
    double ht , sh;

    System.out.println("digite o numero do funcionario");
    nfuncionario = scan.nextInt();
    System.out.println("digite a hora trabalhada do funcionario");
    ht = scan.nextDouble();
    System.out.println("digite o salario por hora do funcionario");
    sh = scan.nextDouble(); 

    double salario = ht * sh;

    System.out.println("numero do funcionario " + nfuncionario );
    System.out.printf("salario = %.2f%n", salario);








    scan.close();
}


    
    




}
