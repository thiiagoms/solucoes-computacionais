package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double altura, pesoIdeal;

        System.out.print("Informe sua altura: ");
        altura = entrada.nextDouble();

        pesoIdeal = (77.7 * altura) - 58;

        System.out.format("Peso ideal: %.2f KG\n", pesoIdeal);

        entrada.close();
    }
}
