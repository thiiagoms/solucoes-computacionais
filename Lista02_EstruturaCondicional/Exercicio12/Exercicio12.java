import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args) {

        int opcao, numeroUm, numeroDois = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Menu de opcoes: \n" + 
            "1 - Somar\n" +
            "2 - Subtrair\n" + 
            "3 - Multiplicar\n" +
            "4 - Dividir\n" + 
            "5 - Sair\n\n" 
        );

        System.out.print("Informe uma opcao: ");
        opcao = entrada.nextInt();

        System.out.print("Informe o primeiro numero: ");
        numeroUm = entrada.nextInt();

        System.out.print("Informe o segundo numero: ");
        numeroDois = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Resultado da soma: " + (numeroUm + numeroDois));
                break;
            case 2:
                System.out.println("Resultado da subtracao: " + (numeroUm - numeroDois));
                break;
            case 3:
                System.out.println("Resultado da multiplicacao: " + (numeroUm * numeroDois));
                break;
            case 4:
                System.out.println("Resultado da divisao: " + (numeroUm / numeroDois));
                break;
            case 5:
                System.out.println("\nSaindo...");
                entrada.close();
                return;
            default:
                System.out.print("Opcao desconhecida! tente novamente!");
                break;
        }
    }
}
