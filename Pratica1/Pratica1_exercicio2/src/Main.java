import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        double F;

        System.out.println("Digite a temperatura em Celsius: ");
        celsius = input.nextInt();

        F = (celsius * 1.8) + 32;

        System.out.printf("A temperatura em Fahrenheit é " + F           +"\n");
    }
}