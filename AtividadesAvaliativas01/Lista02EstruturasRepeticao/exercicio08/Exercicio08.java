package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade, countIdade = 0, countPeso = 0;
		double peso;
		
		for (int i = 1; i <= 7; i++) {
			System.out.print("Informe a idade: ");
			idade = entrada.nextInt();
			
			System.out.print("Informe o seu peso: ");
			peso = entrada.nextDouble();
			
			if (peso > 90) {
				countPeso++;
			}
			
			countIdade += idade;
		}
		
		System.out.println("Quantidade de pessoas com mais de 90 Kg: " + countPeso);
		System.out.println("Media das idades das sete pessoas: " + (countIdade / 7));
		
		entrada.close();
	}
}
