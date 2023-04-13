package ex3_doWhile;
import java.util.Scanner;



public class Do_while {

	
	
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	
		int count = 0;
		int numero;
		int maior = 0;
		int soma = 0;
		
		do {
			
			System.out.println("Escreva um número: ");
			numero = scan.nextInt();
			count += +1;
			soma += numero;
				if(numero >maior);
					maior = numero;
		}while(count < 5);
		
		System.out.println("Está feito seu exercicio usando looping e contador");
		
	System.out.println("Sua média é : " + soma/5);
	
	}
	

}


