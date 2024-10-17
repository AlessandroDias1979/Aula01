import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		//para inserir o ponto no calculo flutuante
		Locale.setDefault(Locale.US);
		
		// inicialização do teclado
		Scanner teclado = new Scanner(System.in);
		
		// definição de variavel
		double nota01, nota02, nota03, media;
		
		// entradas de variaveis
		System.out.println("PROGRAMA PARA DEFINIR A MÉDIA DO ALUNO");
		
		System.out.println("Escreva a primeira nota: ");
		nota01 = teclado.nextDouble();
		
		System.out.println("Escreva a Segunda nota: ");
		nota02 = teclado.nextDouble();
		
		System.out.println("Escreva a terceira nota: ");
		nota03 = teclado.nextDouble();
		
		//variavel media
		media = (nota01 + nota02 + nota03)/3;
		
		// saída da variavel média
		System.out.printf("A média do aluno é: %.2f" , media);
		
		teclado.close();
		
	}
}
