import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i, j;
		Scanner input = new Scanner(System.in);
		
		int[][] matriz = new int[5][5];
		
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {

				System.out.println("Informe um número: ");
				matriz[i][j] = input.nextInt();

			}
		}

		 int[][] transposta = new int[5][5];
		 for( i = 0; i< matriz.length; i++) {
			 for( j = 0; j<matriz.length; j++) {
				 transposta[j][i] = matriz[i][j];
			 }
		 }
		 

		System.out.println("Matriz:");
		for (i = 0; i < matriz.length; i++) {

			for (j = 0; j < matriz[i].length; j++) {
				System.out.printf("%2d ", transposta[i][j]);
				
			}

			System.out.println();	

		}

	}

}
