import javax.swing.JOptionPane;

public class Main
{
	public static void main(String[] args) {
		
		String entrada;
		int idade;
		int soma = 0;
		double media;
		int cont = 0;
			
	    for(int i=1; i>0; i++){
	    	entrada = JOptionPane.showInputDialog("Digite a sua idade: ");
	        idade = Integer.parseInt(entrada);
	        
	        if(idade<0){
	            break;
	        }else{
	            soma += idade;
	            cont++;
	        }
	        
	        
	        
	    }
	    media = (soma / cont);
	    JOptionPane.showMessageDialog(null, "A media é "+media);
		
		
	}
}
