import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        String sexo = "";
        double imc, altura = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.print(
            "Calculo de IMC\n" + 
            "Informe m ou masculino para sexo masculino\n" + 
            "Informe f ou feminino  para sexo feminino\n\n"
        );

        System.out.print("Informe seu sexo: ");
        sexo = entrada.next().toLowerCase();
        
        System.out.print("Informe sua altura: ");
        altura = entrada.nextDouble();

        if (sexo.equals("m") || sexo.equals("masculino")) {

            imc = (72.7 * altura) - 58;
            
        } else if (sexo.equals("f") || sexo.equals("feminino")) {
            
            imc = (62.1 * altura) - 44.7;

        } else {

            System.out.print("Verifique o sexo novamente!\n");
            entrada.close();
            return;
        } 

        System.out.printf("Sexo: " + sexo + "\nIMC: %.2f ", imc);

        entrada.close();
    }
}
