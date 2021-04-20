package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		int valorX, valorY,valorZ;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o valor do primeiro comprimento: ");
		valorX = entrada.nextInt();
		
		System.out.print("Informe o valor do segundo comprimento: ");
		valorY = entrada.nextInt();
		
		System.out.print("Informe o valor do terceiro comprimento: ");
		valorZ = entrada.nextInt();
		
		if (valorX + valorY > valorZ &&
		    valorX + valorZ > valorY &&
		    valorY + valorZ > valorX
		    ) {
		       System.out.print("Formam triangulo");
		    } else {
		       System.out.print("Nao formam um triangulo");
		    }
		
		entrada.close();
	}
}
