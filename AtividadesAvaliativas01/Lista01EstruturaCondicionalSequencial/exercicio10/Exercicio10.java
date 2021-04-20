package exercicio10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		double imc, peso, altura;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu peso: ");
		peso = entrada.nextDouble();
		
		System.out.print("Informe sua altura: ");
		altura = entrada.nextDouble();
		
		imc = peso / (altura * altura);
		
		if (imc < 20) {
			System.out.print("Abaixo do peso");
		} else if (imc >= 20 && imc < 25) {
			System.out.print("Peso normal");
		} else if (imc >= 25 && imc < 30) {
			System.out.print("Sobre Peso");
		} else if (imc >= 30 && imc < 40) {
			System.out.print("Obeso");
		} else {
			System.out.print("Obeso Morbido");
		}
		
		entrada.close();
	}
}
