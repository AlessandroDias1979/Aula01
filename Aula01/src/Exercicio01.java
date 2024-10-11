import java.util.Scanner;

public class Exercicio01 {
	
	public static void main(String[] args) {
		
		// Entrado do teclado
		Scanner teclado = new Scanner(System.in);
		
		// Variaveis
		double altura;
		double base;
		double area;
		
		// Entrada dos Valores 
		System.out.println("PROGRAMA PARA CALCULAR A AREA DE UM RETANGULO");
		System.out.println("Qual o valor da altura do retangulo: ");
		
		altura = teclado.nextDouble();
	
		System.out.println("Qual o valor da base do retangulo: ");
		
		base = teclado.nextDouble();
		
		// Nova variavel par acalculo
		area = base * altura;
		
		// Saída do resultado
		System.out.println("O valor da area de um retangulo é: " + (area));
		
		teclado.close();
				
		
		
		
		
		
		
	}

}
