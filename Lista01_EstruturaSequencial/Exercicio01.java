import java.util.Scanner;

public class Exercicio01 {

	/*
	 * 	Leia três números inteiros e imprima a 
	 * 	média aritmética entre esses números. 
	 */
	public static void main(String[] args)
	{
		int numeroUm, numeroDois, numeroTres, media = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor do primeiro numero: ");
		numeroUm = entrada.nextInt();
		
		System.out.println("Informe o valor do segundo numero: ");
		numeroDois = entrada.nextInt();

		System.out.println("Informe o valor do terceiro numero: ");
		numeroTres = entrada.nextInt();

		media = (numeroUm + numeroDois + numeroTres) / 3;
		
		System.out.print("Media: " + media);
	}
}
