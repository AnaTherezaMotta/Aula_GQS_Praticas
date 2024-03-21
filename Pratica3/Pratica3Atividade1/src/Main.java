import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int idade;
	        int sexo;

	        System.out.println("Digite a sua idade: ");
	        idade = input.nextInt();
	        System.out.println("Digite o seu sexo: 1- Masculino | 2- Feminino");
	        sexo = input.nextInt();

	        if(sexo==1) {
	        	if(idade<16) {
	    	        System.out.println("A mensalidade é de R$60,00");
	        	}else if(idade>15 & idade<19) {
	        		System.out.println("A mensalidade é de R$75,00");
	        	}else if(idade>18 & idade<30) {
	        		System.out.println("A mensalidade é de R$90,00");
	        	}else if(idade>30 & idade<41) {
	        		System.out.println("A mensalidade é de R$85,00");
	        	}else {
	        		System.out.println("A mensalidade é de R$80,00");
	        	}
	 
	        }else if(sexo==2) {
	        	if(idade<19) {
	        		System.out.println("A mensalidade é de R$60,00");
	        	}else if(idade>18 & idade<26){
	        		System.out.println("A mensalidade é de R$90,00");
	        	}else if(idade>25 & idade<41){
	        		System.out.println("A mensalidade é de R$85,00");
	        	}else {
	        		System.out.println("A mensalidade é de R$80,00");
	        	}
	        }else {
	        	System.out.println("Erro de digitação!");
	        }
	        
	        
		
	}

}
