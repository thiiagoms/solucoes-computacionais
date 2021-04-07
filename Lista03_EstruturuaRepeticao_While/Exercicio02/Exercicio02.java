package Exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        float numero = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("[*] Digite um numero: ");
        numero = entrada.nextFloat();

        while (numero > 0) {
            System.out.println("o valor lido: " + numero);
            System.out.println("o quadrado do número lido: " + (numero * 2));
            System.out.println("o cubo do número lido: " + (numero * 3));
            System.out.format("a raiz quadrada do número lido: %.2f", Math.sqrt(numero));
            System.out.println("\nse é par ou ímpar: " + (numero % 2 == 0 ? "Par" : "Impar"));

            System.out.print("[*] Digite um numero: ");
            numero = entrada.nextFloat();
        }
        entrada.close();
    }

}
