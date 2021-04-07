package Exercicio01;

import java.util.Scanner;

class Exercicio01 {
    public static void main(String[] args) {

        float numero = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("[*] Informe um numero: ");
        numero = entrada.nextFloat();

        while (numero >= 0) {

            System.out.println("Dobro do numero " + numero + " : " + (numero * 2));

            System.out.print("[*] Informe um numero: ");
            numero = entrada.nextFloat();
        }

        entrada.close();
    }
}