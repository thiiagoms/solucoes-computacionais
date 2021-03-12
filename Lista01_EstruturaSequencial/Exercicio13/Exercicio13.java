import java.util.Scanner;

public class Exercicio13 {
    

    public static void main(String[] args)
    {
        double altura, imc = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua altura: ");
        altura = entrada.nextDouble();

        imc = (62.1 * altura) - 44.7;

        System.out.print("IMC: " + imc);

        entrada.close();
    }
}
