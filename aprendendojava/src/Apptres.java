import java.util.Scanner;




public class Apptres {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double numero;
    System.out.println("digite um numero e veja se ele é positivo ou negativo");
    numero = scan.nextDouble();


    if(numero<0){
        System.out.println("é negativo");
    }else{
        System.out.println("é positivo");
    }

    scan.close();


}
    
}
