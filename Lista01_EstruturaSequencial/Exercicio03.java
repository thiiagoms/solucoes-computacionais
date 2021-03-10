import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Exercicio03 {
	
	/*
	 * Faça um programa que receba a cotação do dólar em reais,
	 * e um valor que o usuário possui em dólares.
	 * Imprima este valor em reais.
	 */
	public static void main(String[] args)
	{
		float cotacaoDolar, valorDolar, valorReais = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Cotacao atual do Dolar: ");
		cotacaoDolar = entrada.nextFloat();
		
		System.out.print("Valor em US$ que voce possui: ");
		valorDolar = entrada.nextFloat();
		
		valorReais = valorDolar * cotacaoDolar;
		
		System.out.print("Valor em R$: " + valorReais);
	}
}
