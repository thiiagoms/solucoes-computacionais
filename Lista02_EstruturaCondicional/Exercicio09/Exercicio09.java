import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        
        int idade = 0;
        String situacaoEleitoral = "";
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        idade = entrada.nextInt();
        
        if (idade < 16) {
            situacaoEleitoral = "Nao eleitor";
        } else if (idade >= 16 && idade < 18 || idade > 65) {
            situacaoEleitoral = "Eleitor facultativo";
        } else if (idade >= 18 && idade <= 65) {
            situacaoEleitoral = "Eleitor obrigatorio";
        }

        System.out.println(situacaoEleitoral);
        entrada.close();
    }
}
