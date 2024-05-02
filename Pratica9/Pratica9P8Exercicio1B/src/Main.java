import java.util.Scanner;

public class Main {
	
	public static void lerMatriz(int[][] matriz) {
		Scanner input = new Scanner(System.in);
		int i, j;
		for (i = 0; i < matriz.length; i++) {

			for (j = 0; j < matriz[i].length; j++) {

			System.out.println("Informe um número: ");
			matriz[i][j] = input.nextInt();

			}
		}
	}
	
	public static void imprimir(int[][] matriz) {
		int i, j;
		System.out.println("Matriz:");
		for (i = 0; i < matriz.length; i++) {

			for (j = 0; j < matriz[i].length; j++) {
				if(i % 2 ==0 && j % 2 !=0) {
					System.out.printf("m[%d][%d] = %2d ", i, j, matriz[i][j]);

					System.out.println();
				}
				
			}
		}
	}

	public static void main(String[] args) {
		
		
		int[][] matriz = new int[5][5];
		lerMatriz(matriz);
		imprimir(matriz);
		

	}

}
