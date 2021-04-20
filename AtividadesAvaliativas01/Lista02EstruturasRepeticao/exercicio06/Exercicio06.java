package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		String sexo;
		double peso;
		int pesoHomens = 0, pesoMulheres = 0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("=== Contador : " + i);
			
			System.out.print("Informe o seu sexo: ");
			sexo = entrada.next();			
			System.out.print("Informe o seu peso: ");
			peso = entrada.nextDouble();
			
			if ((sexo.equals("masculino") || sexo.equals("homem"))
				&& (peso >= 60 && peso <= 80)) {
				 pesoHomens++;
			}
			
			if ((sexo.equals("feminino") || sexo.equals("feminino"))
				 && (peso >= 50 && peso <= 70)) {
				pesoMulheres++;
			}
			
		}
		
		System.out.println("Quantidade de homens entre 60 e 80 Kg: " + pesoHomens);
		System.out.println("Quantidade de mulheres entre 50 e 70 Kg: " + pesoMulheres);
		
		entrada.close();
	}
}

