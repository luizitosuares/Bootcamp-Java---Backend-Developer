package ex4_for;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scan = new Scanner(System.in);
	
	
	System.out.println("Qual número você quer a tabuada ? ");
	int tabuada = scan.nextInt();
	
	for (int i = 1; i <= 10; i++) {
		System.out.println(tabuada + "X" + i +"=" + (tabuada*i));
	}
	}
	
}

