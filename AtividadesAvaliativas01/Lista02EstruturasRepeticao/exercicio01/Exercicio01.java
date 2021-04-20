package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int matricula;
		double notaUm, notaDois, notaTres, media;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a matricula: ");
		matricula = entrada.nextInt();
		
		while (matricula >= 0) {
			
			System.out.print("Informe a primeira nota: ");
			notaUm = entrada.nextDouble();
			
			System.out.print("Informe a segunda nota: ");
			notaDois = entrada.nextDouble();
			
			System.out.print("Informe a terceira nota: ");
			notaTres = entrada.nextDouble();
			
			media = (notaUm + notaDois + notaTres) / 3;
			
			if (media >= 70) {
				System.out.println("Aprovado");
			} else if (media >= 60 && media <= 70) {
				System.out.println("Exame");
			} else {
				System.out.println("Reprovado");
			}
		
			System.out.print("Informe a matricula: ");
			matricula = entrada.nextInt();
		}
		
		System.out.print("Matricula negativa informada!!!\nSaindo...");
		entrada.close();
	}
}
