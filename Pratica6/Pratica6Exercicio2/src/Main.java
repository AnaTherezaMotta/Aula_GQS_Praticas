import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args) {
	    int n;
	    int fatorial = 1;
	    String entrada;
	    
	    
	    entrada = JOptionPane.showInputDialog("Digite um numero natural: ");
		n = Integer.parseInt(entrada);
		
		if(n >= 0){
    		    if(n == 0 || n == 1){
    		    	JOptionPane.showMessageDialog(null, "O fatorial é igual a 1");
    		    }else{
    		        for (int i = 1; i <= n; i++) {
                        fatorial *= i;
                    }
    		        JOptionPane.showMessageDialog(null, "O fatorial é "+fatorial);
    		    }
		    
		}else{
			JOptionPane.showMessageDialog(null, "O número é inválido!");
		}
	}
}
