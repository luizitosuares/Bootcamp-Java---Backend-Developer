package sobrecarga;

public class Area {

	
	 public static void calculaArea(double lado){
		
		double area = lado * lado;
		
		System.out.println("A área do quadrado é: " + area);
		
	}
	
	
	 public static void calculaArea(double lado, double altura) {
		 
		 
		 double area = lado * altura;
		 
		 System.out.println("A área do retangulo é: " + area);
		 
	 }
}

	
