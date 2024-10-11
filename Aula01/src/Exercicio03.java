import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		// Comando de entrada
		Scanner teclado = new Scanner(System.in);
		
		// Variaveis
		double valor, resto;
		
		// entrada da variavel
		System.out.println("Digite um valor: ");
		
		valor = teclado.nextDouble();
		
		System.out.println("O valor posterior a este é: " + (++valor));
		System.out.println("O valor anterior a este é: " + (--valor));
		System.out.println("O valor ao quadrado é: " + (valor * valor));
		System.out.println("O valor ao cubo é: " + (valor * valor * valor));
		
		// variavel resto
		resto = valor % 2;
		
		//Condição para valor par ou impar
		if (resto == 0) {
			
			System.out.println("O valor digitado é par.");}
			
			else {
				
				System.out.println("O valor digitado é impar.");}
				
			
		
		teclado.close();
		
		
	}

}
