package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		double valor;
		Scanner entrada = new Scanner(System.in);
		
		for (int count = 1; count <= 5; count++) {
			System.out.print("Informe o valor: ");
			valor = entrada.nextDouble();
			System.out.println(" - Dobro de " + valor + " : " + (valor * 2));
		}
		
		entrada.close();
	}
}
