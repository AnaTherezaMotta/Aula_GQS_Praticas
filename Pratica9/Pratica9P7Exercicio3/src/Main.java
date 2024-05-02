import java.util.Scanner;
public class Main
{
	public static void lerVetor(double[] vetor) {
		int i;
		Scanner input = new Scanner(System.in);
	    
	    for(i = 0; i<vetor.length; i++){
	        System.out.println("Digite um número: ");
	        vetor[i] = input.nextDouble(); 
	    }
	}
	
	public static double verificarMaior(double[] vetor) {
		double maior = Double.MIN_VALUE;
		for(int i = 0; i<vetor.length;i++) {
			if (vetor[i] > maior) {
	            maior = vetor[i];
	        }
		}
		
        return maior;
	}
	public static double verificarMenor(double[] vetor) {
		double menor = Double.MAX_VALUE;
		for(int i = 0; i<vetor.length;i++) {
			if (vetor[i] < menor) {
	            menor = vetor[i];
	        }
		}
		
		return menor;
	}
	public static void imprimir(double[] vetor) {
		
		 System.out.println("Vetor digitado: ");
		    for (int i = 0; i < vetor.length; i++){
		         System.out.println("v["+i+"] = "+vetor[i] + " ");
	            
		    }
	}
	public static void main(String[] args) {
		
		double[] vetor = new double[10];
		lerVetor(vetor);
		double menor = verificarMenor(vetor);
		double maior = verificarMaior(vetor);
		imprimir(vetor);
   
	    System.out.println("O menor número digitado é: " + menor);
	    System.out.println("O maior número digitado é: "+maior);
	}
}
