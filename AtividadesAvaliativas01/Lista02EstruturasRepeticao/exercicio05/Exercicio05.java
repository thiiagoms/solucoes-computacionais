package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double temperatura, somTemp = 0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Temperatura no " + i + " dia: ");
			temperatura = entrada.nextDouble();
			somTemp += temperatura;
		}
		
		System.out.print("Media das temperatura: " + (somTemp / 10));
		entrada.close();
	}
}
