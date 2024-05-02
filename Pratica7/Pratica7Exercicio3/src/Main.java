import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		int i;
		double[] vetor = new double[10];
		double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
		Scanner input = new Scanner(System.in);
	    
	    for(i = 0; i<vetor.length; i++){
	        System.out.println("Digite um número: ");
	        vetor[i] = input.nextDouble();
	        if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
	    }
	    
	    System.out.println("Vetor digitado: ");
	    for (i = 0; i < vetor.length; i++){
	         System.out.println("v["+i+"] = "+vetor[i] + " ");
            
	    }
	    
	    System.out.println("O menor número digitado é: " + menor);
	    System.out.println("O maior número digitado é: "+maior);
	}
}
