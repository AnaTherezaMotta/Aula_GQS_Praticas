import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int quantidadeAlunosNotaAcima90 = 0;
        int quantidadeAlunosReprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;
        int quantidadeAlunos = 0;

        System.out.println("Informe a nota final e o total de faltas de cada aluno (ou nota negativa para sair):");
        
        double nota = 0;
        while (nota >= 0) {
            System.out.print("Nota final: ");
            nota = input.nextDouble();

            if (nota >= 0) {
                System.out.print("Total de faltas: ");
                int faltas = input.nextInt();

                quantidadeAlunos++;
                
                if (nota >= 90) {
                    quantidadeAlunosNotaAcima90++;
                }

                if (nota < 70 || faltas >= 20) {
                    quantidadeAlunosReprovados++;
                }

                if (nota > maiorNota) {
                    maiorNota = nota;
                }
                if (nota < menorNota) {
                    menorNota = nota;
                }

                somaNotas += nota;
            }
        }

        double mediaNotas = quantidadeAlunos > 0 ? somaNotas / quantidadeAlunos : 0;
        
        System.out.println("\nResultados:");
        System.out.println("a. Quantidade de alunos com nota final maior ou igual a 90: " + quantidadeAlunosNotaAcima90);
        System.out.println("b. Quantidade de alunos reprovados: " + quantidadeAlunosReprovados);
        System.out.println("c. Maior nota: " + (maiorNota != Double.MIN_VALUE ? maiorNota : "N/A"));
        System.out.println("   Menor nota: " + (menorNota != Double.MAX_VALUE ? menorNota : "N/A"));
        System.out.println("d. Média de notas da turma: " + mediaNotas);
    }
}