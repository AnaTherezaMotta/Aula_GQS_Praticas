
import java.util.Scanner;
public class Main
{
	public static void lerVetor(int[] vetor) {
		int i;
		Scanner input = new Scanner(System.in);
		for(i = 0; i<vetor.length; i++){
	        System.out.println("Digite um número: ");
	        vetor[i] = input.nextInt();
	    }
	}
	public static void imprimir(int[] vetor) {
		int i;
		System.out.println("Vetor digitado: ");
	    for (i = 0; i < vetor.length; i++){
            System.out.printf("v[%d] = %2d\n", i, vetor[i]);
	    }
	}
	public static int SomaPares(int[] vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
            }
        }
        return soma;
    }
	
	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		lerVetor(vetor);
		imprimir(vetor);
		int somaP = SomaPares(vetor);
		
	    
	    System.out.println("A Soma dos números pares é: " + somaP);
	}
}

