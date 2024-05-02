import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int i;
		int[] vetor = new int[10];
		int soma =0;
		Scanner input = new Scanner(System.in);
	    
	    for(i = 0; i<vetor.length; i++){
	        System.out.println("Digite um número: ");
	        vetor[i] = input.nextInt();
	    }
	    
	    System.out.println("Vetor digitado: ");
	    for (i = 0; i < vetor.length; i++){
            System.out.printf("v[%d] = %2d\n", i, vetor[i]);
            if (vetor[i] % 2 == 0) {
                soma += vetor[i];
            }
	    }
	    
	    System.out.println("A Soma dos números pares é: " + soma);
	}
}
