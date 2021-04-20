package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		double notaUm, notaDois, media;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a primeira nota: ");
		notaUm = entrada.nextDouble();
		
		System.out.print("Informe a segunda nota: ");
		notaDois = entrada.nextDouble();
		
		media = (notaUm + notaDois) / 2;
		
		if (media >= 7) {
			System.out.print("Aprovado");
		} else {
			System.out.print("Reprovado");
		}
		
		entrada.close();
	}
}
