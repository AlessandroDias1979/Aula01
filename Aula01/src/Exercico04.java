import java.util.Scanner;

public class Exercico04 {
	
	public static void main(String[] args) {
		
		//inicialização do teclado
		Scanner teclado = new Scanner(System.in);
		
		//definição das variaveis
		int idade, dias, meses;
		
		// entrada da variavel
		System.out.println("Digite su idade: ");
		
		idade = teclado.nextInt();
		
		// definição de novas variaveis dias e meses
		meses = idade * 12;
		dias = idade * 365;
		
		//saída do programa 
		System.out.println("Você tem " + idade + " anos, " + meses + " meses e " + dias + " dias.");
		
		teclado.close();
		
	}

}
