package ex3par_impar;

import java.util.Scanner;

public class ParEImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero;
		int contador = 0;
		int qntd_par = 0, qntd_impar = 0;

		System.out.println("Quantas vezes você quer digitar o número ?");
		numero = scan.nextInt();

		do {

			System.out.println("Digite um numero");
			contador = scan.nextInt();
			if (contador % 2 == 0)
				qntd_par++;

			else
				qntd_impar++;
			contador += 1;
		} while (contador <= numero);
		System.out.println("GG");

		System.out.println("O número de valores pares são :" + qntd_par);
		System.out.println(" O número de valores impares são : " + qntd_impar);
	}

}
