import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int num_diarias, valorT;
        int tipo_apto;

        System.out.println("Digite a quantidade de dias: ");
        num_diarias = input.nextInt();
        System.out.println("Escolha o tipo de apartamento: 1-Apto Simples | 2- Apto Duplo ");
        tipo_apto = input.nextInt();
        
        if(tipo_apto==1) {
        	if(num_diarias<10) {
        		valorT= num_diarias * 100;
        		System.out.println("Total a ser pago é " + valorT);
        	}else if(num_diarias>9 & num_diarias<16) {
        		valorT= num_diarias * 90;
        		System.out.println("Total a ser pago é" + valorT);
        	}else {
        		valorT= num_diarias * 80;
        		System.out.println("Total a ser pago é " + valorT);
        	}
        }else if(tipo_apto==2) {
        	if(num_diarias<10) {
        		valorT= num_diarias * 140;
        		System.out.println("Total a ser pago é "+ valorT);
        	}else if(num_diarias>10 & num_diarias<16) {
        		valorT= num_diarias * 120;
        		System.out.println("Total a ser pago é "+ valorT);
        	}else {
        		valorT= num_diarias * 100;
        		System.out.println("Total a ser pago é "+ valorT);
        	}
        }else {
        	System.out.println("Erro de digitação!");
        }
        

	}

}
