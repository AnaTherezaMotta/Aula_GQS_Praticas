import java.util.Scanner;

public class Main {
	
	public static void lerMatriz(int[][] matriz) {
		int i, j;
		Scanner input = new Scanner(System.in);
		for (i = 0; i < matriz.length; i++) {
			for (j = 0; j < matriz[i].length; j++) {

				System.out.println("Informe um número: ");
				matriz[i][j] = input.nextInt();

			}
		}

	}
	
	public static int[][] transpostaMatriz(int[][] matriz) {
		int i, j;
		int[][] transposta = new int[5][5];
		for( i = 0; i< matriz.length; i++) {
			 for( j = 0; j<matriz.length; j++) {
				 transposta[j][i] = matriz[i][j];
			 }
		 }
		return transposta;
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		int i, j;
		System.out.println("Matriz:");
		for (i = 0; i < matriz.length; i++) {

			for (j = 0; j < matriz[i].length; j++) {
				System.out.printf("%2d ", matriz[i][j]);
				
			}

			System.out.println();	

		}
	}

	public static void main(String[] args) {
		
		
		int[][] matriz = new int[5][5];
		lerMatriz(matriz);
		 
		int[][] transposta = transpostaMatriz(matriz);
		
		 imprimirMatriz(transposta);

	}

}
