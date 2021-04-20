package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		double nota = 0, maiorNota = 0, menorNota = 99999999999999999f;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.print("Informe a nota do " + i + " aluno: ");
			nota = entrada.nextDouble();
			
			if (nota >= maiorNota) {
				maiorNota = nota;
			}
			
			if (nota <= menorNota) {
				menorNota = nota;
			}
		}
		
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Menor nota: " + menorNota);
		
		entrada.close();
	}
}
