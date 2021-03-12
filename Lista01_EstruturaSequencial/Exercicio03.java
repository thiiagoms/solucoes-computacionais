import java.util.Scanner;

public class Exercicio03 {

	
	public static void main(String[] args)
	{
		float cotacaoDolar, valorDolar, valorReais = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Cotacao atual do Dolar: ");
		cotacaoDolar = entrada.nextFloat();
		
		System.out.print("Valor em US$ que voce possui: ");
		valorDolar = entrada.nextFloat();
		
		valorReais = valorDolar * cotacaoDolar;
		
		System.out.println("Valor em R$: " + valorReais);

		entrada.close();
	}
}
