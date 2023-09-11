package atv;


import java.util.Scanner;
import java.util.Locale;

public class atvum {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    Locale.setDefault(Locale.US);
    
    System.out.println("Digite o valor do salario");
    double salario = scan.nextDouble();
    double valorP;
    double novoS;

    if(salario<280.01){
        valorP = (20 * salario) / 100; 
        novoS = valorP + salario;
        System.out.println("o vlaor do salario antes era de " + salario);
        System.out.println("o valor do percentual do aumento é de " + "20%");
        System.out.println("o valor do aumento é de " + valorP);
        System.out.println("o valor do novo salario é de " + novoS);
    } 
    else if (salario<700.01){
        valorP = (15 * salario) / 100; 
         novoS = valorP + salario;
        System.out.println("o vlaor do salario antes era de " + salario);
        System.out.println("o valor do percentual do aumento é de " + "15%");
        System.out.println("o valor do aumento é de " + valorP);
        System.out.println("o valor do novo salario é de " + novoS);

    } 
    else if(salario<1500.01){
        valorP = (10 * salario) / 100; 
         novoS = valorP + salario;
        System.out.println("o vlaor do salario antes era de " + salario);
        System.out.println("o valor do percentual do aumento é de " + "10%");
        System.out.println("o valor do aumento é de " + valorP);
        System.out.println("o valor do novo salario é de " + novoS);
    }
    else if(1500.01<salario){
        valorP = (5 * salario) / 100; 
         novoS = valorP + salario;
        System.out.println("o vlaor do salario antes era de " + salario);
        System.out.println("o valor do percentual do aumento é de " + "5%");
        System.out.println("o valor do aumento é de " + valorP);
        System.out.println("o valor do novo salario é de " + novoS);
    }

    








    scan.close();

}
    
}
