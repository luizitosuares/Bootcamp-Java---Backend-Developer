package calculador;


public class Principal {

	public static void main(String[] args) {
		  // Calculadora
        System.out.println("Exercício calculadora");
        Calculador.soma(3, 6);
        Calculador.subtracao(9, 1.8);
        Calculador.multiplicacao(7, 8);
        Calculador.divisao(5, 2.5);
        
        
        
     // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        
	
	
        // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
	
	
	}
}