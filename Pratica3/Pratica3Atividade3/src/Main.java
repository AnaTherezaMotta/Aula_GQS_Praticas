import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a=0, b=0, c=0;
		double delta=0, x, x1, x2;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor do coeficiente a: ");
		a = input.nextInt();
		System.out.println("Digite o valor coeficiente b: ");
		b = input.nextInt();
		System.out.println("Digite o valor coeficiente  c: ");
		c = input.nextInt();
		delta = (int)Math.pow(b, 2) - (4 * a * c);
		
		if(a==0 && b==0 && c==0) {
			System.out.println("Igualdade confirmada: 0 = 0");
		}else if(a==0 && b==0 && c!=0) {
			System.out.println("Coeficientes informados incorretamente");
		}else if(a==0 && b!=0){
			x = c / b;
			System.out.println("Esta é uma equação de primeiro grau: x= "+ (double)(Math.sqrt(x)));
			
		}else if (a!=0) {
			System.out.println("Esta é uma equação de segundo grau");
			if(delta<0) {
				System.out.println("Esta equação não possui raízes reais");
			}else if(delta==0) {
				x= -b / (2 * a);
				System.out.println("Esta equação possui duas raízes reais iguais"+ (double)(Math.sqrt(x)));
			}else {
				System.out.println("Está equação possui duas raízes diferentes");
				if(delta<0) {
					System.out.println("não existe raiz real");
				}else if(delta==0) {
					System.out.println("existe somente uma raiz real");
				}else {
					x1 = (-b + Math.sqrt(delta))/(2*a);
					x2 = (-b + Math.sqrt(delta))/(2*a);
					System.out.println("existem duas reízes reais: " + x1 +" e " +x2);
				}
			}
			
			
		}
		
		

	}

}
