package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		double coefA, coefB, coefC, raizX1, raizX2, delta;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o coeficiente de A: ");
		coefA = entrada.nextDouble();
		
		System.out.print("Informe o coeficiente de B: ");
		coefB = entrada.nextDouble();
		
		System.out.print("Informe o coeficiente de C: ");
		coefC = entrada.nextDouble();
		
		delta = Math.pow(coefB, 2) - 4 * (coefA * coefC);
		
		raizX1 = (- coefB + Math.sqrt(delta)) / (2 * coefA);
		raizX2 = (- coefB - Math.sqrt(delta)) / (2 * coefA);
				
		System.out.println("Valor de delta: " + delta);
		System.out.println("Valor de X1: " + raizX1);
		System.out.println("valor de x2: " + raizX2);
		
		entrada.close();
	}
}
