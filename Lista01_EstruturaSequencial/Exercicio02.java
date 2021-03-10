import java.util.Scanner;

public class Exercicio02 {

	/*
	 *	Faça um programa que receba o ano de nascimento de uma pessoa, o
	 *   ano atual e imprima:
	 *   a. A idade da pessoa no ano atual
	 *   b. A idade que a pessoa terá em 2050
	 */
	public static void main(String[] args)
	{
		int anoNascimento, anoAtual = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ano de nascimento: ");
		anoNascimento = entrada.nextInt();
		
		System.out.println("Ano atual: ");
		anoAtual = entrada.nextInt();

		// Desconsiderando mes de nascimento
		System.out.println("Idade no ano " + anoAtual + " e: " + (anoAtual - anoNascimento));
		
		System.out.println("Idade em 2050: " + (2050 - anoNascimento));
	}
}
