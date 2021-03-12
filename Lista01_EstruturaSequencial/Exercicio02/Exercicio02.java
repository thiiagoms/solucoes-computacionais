import java.util.Scanner;

public class Exercicio02 {


	public static void main(String[] args)
	{
		int anoNascimento, anoAtual = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ano de nascimento: ");
		anoNascimento = entrada.nextInt();
		
		System.out.println("Ano atual: ");
		anoAtual = entrada.nextInt();

		System.out.println("Idade no ano " + anoAtual + " e: " + (anoAtual - anoNascimento));
		
		System.out.println("Idade em 2050: " + (2050 - anoNascimento));

		entrada.close();
	}
}
