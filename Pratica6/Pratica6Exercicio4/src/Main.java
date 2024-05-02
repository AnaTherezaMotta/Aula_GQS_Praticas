
import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args) {
		String entrada;
		int menor = Integer.MAX_VALUE;
        int maior = Integer.MIN_VALUE;
		int numero;
		int cont=0;
		
		
		for(int i=1; i>0; i++){
			entrada = JOptionPane.showInputDialog("Digite um numero inteiro: ");
		    numero = Integer.parseInt(entrada);
		    
		    if (numero < 0) {
                break; 
            }
		    
		    if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
            
           
            
		}
		
		JOptionPane.showMessageDialog(null, "O menor número é: "+menor);
		JOptionPane.showMessageDialog(null, "O maior número é: "+maior);
	
	}
}
