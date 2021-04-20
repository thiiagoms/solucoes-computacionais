package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int numeroFilhos, mediaFilhos = 0, countFamilia = 0;
		double salario, mediaSalarial = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o salario: ");
		salario = entrada.nextDouble();
		
		while (salario >= 0)
		{
			System.out.print("Informe o numero de filhos: ");
			numeroFilhos = entrada.nextInt();
			
			mediaFilhos += numeroFilhos;
			
			mediaSalarial += salario;
			
			countFamilia++;
			
			System.out.print("Informe o salario: ");
			salario = entrada.nextDouble();
		}
		
		System.out.print("Media salarial da populacao: " + (mediaSalarial / countFamilia));
		System.out.print("Media do numero de filhos: " + (mediaFilhos / countFamilia));
		
		
		entrada.close();
	}
}
