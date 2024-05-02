import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, j;
		Scanner input = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		
		for (i = 0; i < matriz.length; i++)

			for (j = 0; j < matriz[i].length; j++) {

			System.out.println("Informe um número: ");
			matriz[i][j] = input.nextInt();

		}
		
		int somaDiagonalP = 0;
        int somaDiagonalS = 0;
        for (i = 0; i < matriz.length; i++) {
        	somaDiagonalP += matriz[i][i];
        	somaDiagonalS += matriz[i][matriz.length - 1 - i];
        }
        
        for (i = 0; i < matriz.length; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][matriz.length - 1 - i];
            matriz[i][matriz.length - 1 - i] = temp;
        }

		System.out.println("Matriz:");
		for (i = 0; i < matriz.length; i++) {

			for (j = 0; j < matriz[i].length; j++)

				System.out.printf("%2d ", matriz[i][j]);

				System.out.println();

		}

	}

}
