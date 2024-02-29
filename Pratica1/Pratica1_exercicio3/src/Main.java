import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario_min;
        double salario;
        double qtn_salario_min;

        System.out.println("Digite o valor do salario mínimo: ");
        salario_min = input.nextInt();
        System.out.println("Digite o valor do seu salario: ");
        salario = input.nextInt();
        qtn_salario_min = (salario / salario_min);
        System.out.printf("Você possui " + qtn_salario_min + " salários mínimos");

    }
}
