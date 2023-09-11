package atv2;

import java.util.Locale;
import java.util.Scanner;

public class atvdois {public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scan = new Scanner(System.in);
    System.out.println("digite o valor do salario");
    double salario = scan.nextDouble();
    double salarioH, salarioB, ir, inss, calcInss, fgts, calcFgts, totalD, calcIr, salarioL;
    
    


    if (salario < 900.01) {
        salarioH = salario / 220; 
        salarioB = salarioH * 220;
        calcIr = 0;
        ir = (calcIr * salario) / 100 ;
        inss = 0;
        calcInss = (0 * salario) / 100 ;
        fgts = 0;
        calcFgts = (0 * salario) / 100 ;
        totalD = calcIr + calcInss;
        salarioL = salario - totalD;
        System.out.printf("salario bruto: %.2f * 220 = R$ %.2f%n ", salarioH, salarioB);
        System.out.println("(-)IR" + calcIr + "%" + ":R$" + ir );
        System.out.println("(-)INSS" + inss + "%" + ":R$" + calcInss );
        System.out.println("FGTS(-)" + fgts + "%" + ":R$" + calcFgts );
        System.out.println("total de descontos: R$" + totalD);
        System.out.println("salario Liquido: R$" + salarioL);
    }else if(salario < 1500.01) {
        salarioH = salario / 220; 
        salarioB = salarioH * 220;
        calcIr = 5;
        ir = (calcIr * salario) / 100 ;
        inss = 10;
        calcInss = (inss * salario) / 100 ;
        fgts = 11;
        calcFgts = (fgts * salario) / 100 ;
        totalD = ir + calcInss;
        salarioL = salario - totalD;
        System.out.printf("salario bruto: %.2f * 220 = R$ %.2f%n ", salarioH, salarioB);
        System.out.println("(-)IR" + calcIr + "%" + ":R$" + ir );
        System.out.println("(-)INSS" + inss + "%" + ":R$" + calcInss );
        System.out.println("FGTS(-)" + fgts + "%" + ":R$" + calcFgts );
        System.out.println("total de descontos: R$" + totalD);
        System.out.println("salario Liquido: R$" + salarioL);

    }else if(salario < 2500.01) {
        salarioH = salario / 220; 
        salarioB = salarioH * 220;
        calcIr = 10;
        ir = (calcIr * salario) / 100 ;
        inss = 10;
        calcInss = (inss * salario) / 100 ;
        fgts = 11;
        calcFgts = (fgts * salario) / 100 ;
        totalD = ir + calcInss;
        salarioL = salario - totalD;
        System.out.printf("salario bruto: %.2f * 220 = R$ %.2f%n ", salarioH, salarioB);
        System.out.println("(-)IR" + calcIr + "%" + ":R$" + ir );
        System.out.println("(-)INSS" + inss + "%" + ":R$" + calcInss );
        System.out.println("FGTS(-)" + fgts + "%" + ":R$" + calcFgts );
        System.out.println("total de descontos: R$" + totalD);
        System.out.println("salario Liquido: R$" + salarioL);
    }else if(2500.01<salario) {
        salarioH = salario / 220; 
        salarioB = salarioH * 220;
        calcIr = 20;
        ir = (calcIr * salario) / 100 ;
        inss = 10;
        calcInss = (inss * salario) / 100 ;
        fgts = 11;
        calcFgts = (fgts * salario) / 100 ;
        totalD = ir + calcInss;
        salarioL = salario - totalD;
        System.out.printf("salario bruto: %.2f * 220 = R$ %.2f%n ", salarioH, salarioB);
        System.out.println("(-)IR" + calcIr + "%" + ":R$" + ir );
        System.out.println("(-)INSS" + inss + "%" + ":R$" + calcInss );
        System.out.println("FGTS(-)" + fgts + "%" + ":R$" + calcFgts );
        System.out.println("total de descontos: R$" + totalD);
        System.out.println("salario Liquido: R$" + salarioL);
    }

    


    





    scan.close();
    
}
    
}
