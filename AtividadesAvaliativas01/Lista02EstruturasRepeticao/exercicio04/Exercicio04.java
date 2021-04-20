package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		numero = entrada.nextInt();
		
		for (int count = 1; count <= numero; count++)
		{
			if (count % 2 != 0) {
				System.out.println("Impar: " + count);
			}
		}
		
		entrada.close();
	}
}
