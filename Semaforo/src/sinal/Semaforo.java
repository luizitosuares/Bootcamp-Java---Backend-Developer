package sinal;

import java.util.Scanner;


public class Semaforo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o número correspondente à cor do semáforo (1 para vermelho, 2 para amarelo, 3 para verde): ");
        int cor = scanner.nextInt();
        
        if (cor == 1) {
            System.out.println("Pare o veículo!");
        } else if (cor == 2) {
            System.out.println("Atenção! Reduza a velocidade.");
        } else if (cor == 3) {
            System.out.println("Pode seguir em frente.");
        } else {
            System.out.println("Opção inválida. Tente novamente.");
        }
        
        scanner.close();
    }
}
