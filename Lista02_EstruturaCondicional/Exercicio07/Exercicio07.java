import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        
        double salario = 0;
        String mensagem = "";
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe o salario do funcionario: ");
        salario = entrada.nextDouble();

        if (salario < 1000) {
            salario = salario * 1.3;
            mensagem = "Novo salario com reajuste: " + salario + "\n";
        } else {
            mensagem = "Sem direito ao reajuste!\n";
        }

        System.out.printf(mensagem);
        entrada.close();
    }
}
