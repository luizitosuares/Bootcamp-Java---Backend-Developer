package ex2_comparacao;

import java.util.Scanner;


public class Nota {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
	
		int nota;
		
		System.out.println("Digite uma nota entre zero e dez: ");
		nota = scan.nextInt();
		
	
		while(nota < 0 | nota > 10 ) {
			
			System.out.println("Nota invalida");
			System.out.println("Digite novamente uma nota entre zero e dez: ");
			nota = scan.nextInt();
		}
	
	
	}
}
