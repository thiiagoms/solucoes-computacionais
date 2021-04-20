package exercicio06;

import java.util.Scanner;

public class Exericicio06 {

	public static void main(String[] args) {
		
		double n1, n2;	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro numero: ");
		n1 = entrada.nextDouble();
		
		System.out.print("Informe o segundo numero: ");
		n2 = entrada.nextDouble();
		
		if (n1 > n2) {
			System.out.print("Maior: " + n1 + "\nMenor: " + n2);
		} else if (n1 < n2) { 
			System.out.print("Maior: " + n2 + "\nMenor: " + n1);
		} else {
			System.out.print("Sao iguais!!");
		}
		
		entrada.close();
	}
}
