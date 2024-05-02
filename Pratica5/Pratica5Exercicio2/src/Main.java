import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args) {
		//TODO refazer
		Scanner input = new Scanner(System.in);
		int nota, idade;
		double salario;
		String sexo;
		String entrada;
		
		do {
			
			do {
				entrada = JOptionPane.showInputDialog("Digite a sua Nota: ");
	    		nota = Integer.parseInt(entrada);
	    		
			}while(nota < 0 || nota>10);
			
			do {
				entrada = JOptionPane.showInputDialog("Digite o seu salário: ");
	    		salario = Integer.parseInt(entrada);
			}while(salario<=0);
			
			do {
				sexo = JOptionPane.showInputDialog("Digite o sexo (m ou f): ");
	        } while (!sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f"));
			
			do {
				entrada = JOptionPane.showInputDialog("Digite a sua idade: ");
	    		idade = Integer.parseInt(entrada);
	    		
			}while(idade <0 || idade>150);
			
			JOptionPane.showMessageDialog(null, "Dados informados corretamente!");
			int resp = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			if (resp == JOptionPane.YES_OPTION)
			entrada = "sim";
			else if (resp == JOptionPane.NO_OPTION)
			entrada = "não";
			
		}while(entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));
		
		System.exit(0);
		
	}
}