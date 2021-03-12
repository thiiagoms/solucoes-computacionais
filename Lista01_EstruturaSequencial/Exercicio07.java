import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args)
    {
        double salarioMinimo, salarioFuncionario, qtdSalarios = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Valor do salario minimo: ");
        salarioMinimo = entrada.nextDouble();

        System.out.print("Valor do salario funcionario: ");
        salarioFuncionario = entrada.nextDouble();

        qtdSalarios = salarioFuncionario / salarioMinimo;

        System.out.println("Quantidade de salarios minimos: " + qtdSalarios);

        entrada.close();
    }
}
