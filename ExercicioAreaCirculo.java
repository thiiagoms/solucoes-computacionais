import java.util.Scanner;
import java.lang.Math;

public class ExercicioAreaCirculo {

	public  static double raio;
	public  static double area;
	public  static Scanner entrada;
	
	public static void main(String[] args){

		entrada = new Scanner(System.in);
		
        System.out.println("Valor do raio: ");
		raio = entrada.nextDouble();
		
		area = CalcularArea(raio);
		
		System.out.println("Valor da area: " + String.format("%.2f", area));
	}
	
	public static double CalcularArea(double raio)
	{
		double area = (2 * Math.PI * Math.pow(raio, 2)) / 2;
		return area;
	}

}
