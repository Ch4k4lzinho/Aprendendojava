import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        //cacular a diferenca a multiplica de A e B pela de C e D
            int a, b ,c ,d, mult1, mult2, x;
            System.out.println("Digite o valor de A");
            a = scan.nextInt(); 
            System.out.println("Digite o valor de B");
            b = scan.nextInt();
            System.out.println("Digite o valor de C");
            c = scan.nextInt();
             System.out.println("Digite o valor de D");
            d = scan.nextInt();

            mult1 = a * b; 
            mult2 = c * d;
            
            x = mult1 - mult2;



            System.out.println("a diferenca entre eles são " + x );




        scan.close();
        
    }
}
