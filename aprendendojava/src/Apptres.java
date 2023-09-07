import java.util.Scanner;




public class Apptres {public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    double numero;
    numero = scan.nextDouble();


    if(numero<0){
        System.out.println("é negativo");
    }else{
        System.out.println("é positivo");
    }

    scan.close();


}
    
}
