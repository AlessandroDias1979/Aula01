import java.util.Scanner;

public class Exercico04 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		int meses;
		int dias;
		
		System.out.println("Digite su idade: ");
		
		idade = teclado.nextInt();
		
		meses = idade * 12;
		dias = idade * 365;
		
		System.out.println("Você tem " + idade + " anos, " + meses + " meses e " + dias + " dias.");
		
		teclado.close();
		
	}

}
