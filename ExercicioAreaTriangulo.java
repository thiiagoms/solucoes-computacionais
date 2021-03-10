import java.util.Scanner;

public class ExercicioAreaTriangulo {

	public static void main(String[] args)
	{
		int base, altura, area = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Valor da base: ");
		base = entrada.nextInt();
		
		System.out.println("Valor da altura: ");
		altura = entrada.nextInt();
		
		area = (base * altura) / 2;
		
		System.out.println("Valor da Area: " + area + " m2");
	}
}
