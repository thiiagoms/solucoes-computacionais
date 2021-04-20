package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double numero;

        System.out.print("Digite um numero positivo: ");
        numero = entrada.nextDouble();

        if (numero >= 0) {
            System.out.println("Numero ao quadrado: " + Math.pow(numero, 2));
            System.out.println("Numero ao cubo: " + Math.pow(numero, 3));
            System.out.format("Raiz quadrada: %.2f\n", Math.sqrt(numero));
            System.out.format("Raiz cubica: %.2f\n", Math.cbrt(numero));
        } else {
            System.out.print("Voce informou um numero negativo: " + numero + "\nInforme um numero positivo!\n");
        }

        entrada.close();
    }
}
