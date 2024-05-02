import java.util.Scanner;

public class Main {
	
	public static void lerMatriz(int[][] matriz) {
		int i, j;
		Scanner input = new Scanner(System.in);
		for (i = 0; i < matriz.length; i++)

			for (j = 0; j < matriz[i].length; j++) {

			System.out.println("Informe um número: ");
			matriz[i][j] = input.nextInt();

		}
	}
	
	public static int diagonalPrincipal(int[][] matriz) {
		int i, j;
		int somaDiagonalP = 0;
        
        for (i = 0; i < matriz.length; i++) {
        	somaDiagonalP += matriz[i][i];
        }
        return somaDiagonalP;
		
	}
	
	public static int diagonalSecundaria(int[][] matriz){
		int somaDiagonalS = 0;
		int i, j;
		for (i = 0; i < matriz.length; i++) {
        	somaDiagonalS += matriz[i][matriz.length - 1 - i];
        }
		return somaDiagonalS;
	}
	
	public static void trocarDiagonais(int[][] matriz) {
		int i, j;
		for (i = 0; i < matriz.length; i++) {
            int temp = matriz[i][i];
            matriz[i][i] = matriz[i][matriz.length - 1 - i];
            matriz[i][matriz.length - 1 - i] = temp;
        }
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		int i, j;

		System.out.println("Matriz:");
		for (i = 0; i < matriz.length; i++) {

			for (j = 0; j < matriz[i].length; j++)

				System.out.printf("%2d ", matriz[i][j]);

				System.out.println();

		}
	}
	
	public static void main(String[] args) {
		int[][] matriz = new int[5][5];
		lerMatriz(matriz);
		int somaDiagonalP = diagonalPrincipal(matriz);
		int somaDiagonalS = diagonalSecundaria(matriz);
		
		trocarDiagonais(matriz);
		
		imprimirMatriz(matriz);
		

	}

}
