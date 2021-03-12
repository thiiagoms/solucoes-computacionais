import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args)
    {    
        int numero = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero: ");

        System.out.println("Antecessor de " + numero + " : " + (numero - 1));
        System.out.println("Sucessor de " + numero + " : " + (numero + 1));
        System.out.println("Dobro de " + numero + " : " + (Math.pow(numero, 2)));
        System.out.println("Metade de " + numero + " : " + (numero / 2));

        entrada.close();
    }
}
