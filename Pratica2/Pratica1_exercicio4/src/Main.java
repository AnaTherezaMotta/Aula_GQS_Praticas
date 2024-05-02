import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cateto1;
        double cateto2;
        double hipotenusa;

        System.out.println("Digite o cateto: ");
        cateto1 = input.nextInt();
        System.out.println("Digite o cateto: ");
        cateto2 = input.nextInt();

        hipotenusa = Math.pow(cateto1, 2)+ Math.pow(cateto2, 2);

        System.out.printf("A hipotenusa é " + hipotenusa +"\n");
    }
}