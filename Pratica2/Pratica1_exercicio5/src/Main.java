import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio;
        double comprimento;
        double area;
        double volume;

        System.out.println("Digite o raio: ");
        raio = input.nextInt();

        comprimento = 2 * Math.PI * raio;
        area = Math.PI * Math.pow(raio, 2);
        volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);

        System.out.printf("O comprimento da esfera é " + comprimento+"\n");
        System.out.printf("A área da esfera é  " + area +"\n");
        System.out.printf("O volume  da esfera é  " + volume +"\n");
    }
}