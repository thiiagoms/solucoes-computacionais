package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double notaUm, notaDois, notaTres, media;
		
		System.out.print("Nota um: ");
		notaUm = entrada.nextDouble();
		
		System.out.print("Nota dois: ");
		notaDois = entrada.nextDouble();
		
		System.out.print("Nota tres: ");
		notaTres = entrada.nextDouble();
		
		media = (notaUm + notaDois + notaTres) / 3;
		
		if (media >= 0 && media< 3) {
			System.out.print("REPROVADO");
		} else if (media >= 3 && media < 7) {
			System.out.print("EXAME");
		} else {
			System.out.print("APROVADO");
		}
	
		entrada.close();
	}
}
