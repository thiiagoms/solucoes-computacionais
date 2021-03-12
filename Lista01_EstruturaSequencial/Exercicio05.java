import java.util.Scanner;

public class Exercicio05 {
    
    
    public static void main(String[] args)
    {
        double celsius, fahr = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        celsius = entrada.nextDouble();

        fahr = (celsius * 18) + 32;

        System.out.print("Temperatura em Fahrenheit: " + fahr + "\n");

        entrada.close();
    }
}
