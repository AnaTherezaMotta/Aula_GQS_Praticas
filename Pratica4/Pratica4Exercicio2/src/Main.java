import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double somaSalarios = 0;
        int somaNumeroFilhos = 0;
        int quantidadeHabitantes = 0;

        System.out.println("Informe o salário e o número de filhos de cada habitante (ou salário negativo para sair):");
        
        double salario = 0;
        while (salario >= 0) {
            System.out.print("Salário: R$ ");
            salario = input.nextDouble();

            if (salario >= 0) {
                System.out.print("Número de filhos: ");
                int numeroFilhos = input.nextInt();

                quantidadeHabitantes++;

                somaSalarios += salario;
                somaNumeroFilhos += numeroFilhos;
            }
        }

        double mediaSalarios = quantidadeHabitantes > 0 ? somaSalarios / quantidadeHabitantes : 0;

        double mediaNumeroFilhos = quantidadeHabitantes > 0 ? (double) somaNumeroFilhos / quantidadeHabitantes : 0;

        System.out.println("\nResultados:");
        System.out.println("a. Média salarial da população: R$ " + mediaSalarios);
        System.out.println("b. Média do número de filhos: " + mediaNumeroFilhos);
    }
}