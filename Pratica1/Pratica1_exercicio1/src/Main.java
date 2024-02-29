// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float diagonal_maior;
        float diagonal_menor;
        float area;

        System.out.println("Digite a diagonal maior: ");
        diagonal_maior = input.nextInt();
        System.out.println("Digite a diagonal menor: ");
        diagonal_menor = input.nextInt();
        area = (diagonal_maior * diagonal_menor) / 2;

        System.out.printf("A área é igual a  " + area + "\n");
    }

}