import java.util.Scanner;
import javax.swing.JOptionPane;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int conta;
        String entrada;
        int inverso, soma;
        do {
        	entrada = JOptionPane.showInputDialog("Informe o número da sua conta corrente (no máximo 3 dígitos): ");
            
            if(entrada.length() == 3 ){
                conta = Integer.parseInt(entrada);
                inverso = (conta % 10) * 100 + ((conta / 10) % 10) * 10 + (conta / 100);
                soma = conta + inverso;
                int multiplicacoes = (soma / 1000) * 0 + (soma / 100 % 10) * 1 + (soma / 10 % 10) * 2 + (soma % 10) * 3;
                int digitoVerificador = multiplicacoes % 10;
                JOptionPane.showMessageDialog(null, "O dígito verificador da conta " + conta + " é: " + digitoVerificador);
            }else{
                System.out.println("Erro: Você deve digitar exatamente 3 dígitos. Tente novamente!");
            }
            entrada = JOptionPane.showInputDialog("Deseja continuar? (S)im ou (N)ão");
            
        } while (entrada.equalsIgnoreCase("s") || entrada.equalsIgnoreCase("sim"));


    }
}
