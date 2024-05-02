import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		double[] vetor = new double[10];
		
		Scanner input = new Scanner(System.in);
	    
	    for(int i = 0; i<vetor.length; i++){
	        System.out.println("Digite um número: ");
	        vetor[i] = input.nextDouble();
	    }
	    
	    System.out.println("As posições dos números negativos digitados são: ");
	    for (int i = 0; i < 10; i++){
            if (vetor[i] < 0) {
                System.out.println("v["+i+"] = "+vetor[i] + " ");
                
            }
	    }
	    
	    
	}
}