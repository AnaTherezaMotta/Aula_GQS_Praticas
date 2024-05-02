
import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args) {
		int num1, num2;
		int soma = 0;
		String entrada;
		
		
		entrada = JOptionPane.showInputDialog("Digite o primeiro número: ");
		num1 = Integer.parseInt(entrada);
		
		entrada = JOptionPane.showInputDialog("Digite o segundo número: ");
		num2 = Integer.parseInt(entrada);
		
		for (int i = num1; i <= num2; i++) {
		    if(i % 2 != 0){
		        soma += i;
		    }
		    
		}
		
		JOptionPane.showMessageDialog(null, "A soma dos números impares entre "+num1+" e "+num2+" é "+ soma);
		
	}
}