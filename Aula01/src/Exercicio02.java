import java.util.Scanner;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor;
				
		System.out.println("Digite um valor: ");
		valor = teclado.nextInt();
		
		System.out.println("O antecessor deste numero é: " + (--valor));
		
		teclado.close();
		
	}

}
