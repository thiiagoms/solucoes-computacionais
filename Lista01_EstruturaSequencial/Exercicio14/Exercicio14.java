import java.util.Scanner;

public class Exercicio14 {
    

    public static void main(String[] args)
    {
        String valorA, valorB, aux = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor de A: ");
        valorA = entrada.next();

        System.out.print("Valor de B: ");
        valorB = entrada.next();

        System.out.println("Valor original de A: " + valorA);
        System.out.println("Valor original de B: " + valorB);
        
        aux = valorA;
        valorA = valorB;
        valorB = aux;

        System.out.println("\n====== INVERTENDO VALORES ======");
        System.out.println("Valor invertido de A: " + valorA);
        System.out.println("Valor invertido de B: " + valorB);

        entrada.close();
    }
}
