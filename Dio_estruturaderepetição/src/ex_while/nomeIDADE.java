package ex_while;

import java.util.Scanner;


public class nomeIDADE {
	 
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String nome;
	int idade;
	
	
	
	
	while(true) {
		
		System.out.println("Qual é o seu nome: ");
			nome = scan.next();	
			if (nome.equals("0")) break;
		
			System.out.println("Qual a sua idade: ");
		idade = scan.nextInt();
	
	}
    }
}
		
	
		
		
		
		//do {
		
	//	System.out.println("Qual é o seu nome: ");
	//	nome = scan.nextLine();
	//	System.out.println("Qual a sua idade: ");
	//	idade = scan.nextInt();
	//}while(nome.equals("0"));
		
				

		
		
		
		
		
