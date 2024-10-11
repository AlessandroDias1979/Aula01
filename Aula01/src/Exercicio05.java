import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner teclado = new Scanner(System.in);
		
		double nota01;
		double nota02;
		double nota03;
		double media;
		
		System.out.println("PROGRAMA PARA DEFINIR A MÉDIA DO ALUNO");
		System.out.println("Escreva a primeira nota: ");
		nota01 = teclado.nextDouble();
		System.out.println("Escreva a Segunda nota: ");
		nota02 = teclado.nextDouble();
		System.out.println("Escreva a terceira nota: ");
		nota03 = teclado.nextDouble();
		
		media = (nota01 + nota02 + nota03)/3;
		
		System.out.printf("A média do aluno é: %.2f" , media);
		
		teclado.close();
		
	}
}
