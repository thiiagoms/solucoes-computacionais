import java.util.Scanner;

public class Exercicio09 {
    
    public static void main(String[] args)
    {    
        double numero = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero positivo: ");
        numero = entrada.nextDouble();

        System.out.println("Numero ao quadrado: " + Math.pow(numero, 2));
        System.out.println("Numero ao cubo: " + Math.pow(numero, 3));
        System.out.println("Raiz quadrada: " + Math.sqrt(numero));
        System.out.println("Raiz cubica: " + Math.cbrt(numero));

        entrada.close();
    }
}
