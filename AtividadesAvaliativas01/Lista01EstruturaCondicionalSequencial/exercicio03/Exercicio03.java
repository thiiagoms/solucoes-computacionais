package exercicio03;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        
        double cotacaoDolarReal, valorDolar, valorReal;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe a cotacao do rolar em real: ");
        cotacaoDolarReal = entrada.nextDouble();

        System.out.print("Valor que voce possui em dolares: ");
        valorDolar = entrada.nextDouble();

        valorReal = (cotacaoDolarReal * valorDolar);

        System.out.println("Valor em real: R$ " + valorReal);

        entrada.close();
    }
}
