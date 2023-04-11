package sistema;
import java.util.Scanner;


public class Livraria  {
	
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numLivros = 0;
    double totalCompra = 0.0;
    String[] livrosComprados = new String[100]; // array para armazenar os nomes dos livros

    while (true) {
        System.out.print("Digite o nome do livro: ");
        String nomeLivro = sc.nextLine();
        System.out.print("Digite o preço do livro: ");
        double precoLivro = sc.nextDouble();
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = sc.nextInt();

        numLivros += quantidade;
        totalCompra += precoLivro * quantidade;

        livrosComprados[numLivros - quantidade] = nomeLivro; // adiciona o nome do livro ao array

        System.out.println("Livro adicionado ao carrinho.");
        System.out.println("Digite 's' para continuar comprando ou 'n' para finalizar a compra.");
        sc.nextLine();
        String continuar = sc.next();
        if (continuar.equals("n")) {
            break;
        }
    }

    System.out.printf("Valor total da compra: %.2f\n", totalCompra);
    System.out.println("Número de livros comprados: " + numLivros);
    System.out.println("Livros comprados:");

    for (int i = 0; i < numLivros; i++) {
        System.out.println(livrosComprados[i]);
    }

    System.out.println("Obrigado por comprar na nossa livraria!");

}
}
