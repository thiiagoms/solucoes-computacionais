package exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args)
    {
        double celsius, fah;
        Scanner entrada = new Scanner(System.in);   

        System.out.print("Temperatura em celsius: ");
        celsius = entrada.nextDouble();

        fah = (celsius * 1.8) + 32;

        System.out.print("Temperatura em Fahrenheit: " + fah + " °F");

        entrada.close();
    }
}