package programaaula;

import programaaula.produto;
import java.util.Locale;
import java.util.Scanner;

public class programa {public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);


    produto produto = new produto();
    System.out.println("codigo do produto");
    System.out.println("nome do produto");
    produto.nome = scan.nextLine();
    System.out.println("preço do produto");
    produto.preço = scan.nextDouble();
    System.out.println("quantidade em estoque");
    produto.quantidade = scan.nextInt();

    System.out.println(produto.nome + ", " + produto.preço + ", " + produto.quantidade  );
    System.out.println(produto);





    scan.close();

}
    
}
