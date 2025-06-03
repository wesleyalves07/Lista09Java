package exerciciosLista09;
import java.util.Scanner;
public class Ex02 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro para a contagem regressiva: ");
	        int numero = scanner.nextInt();

	        while (numero >= 0) {
	            System.out.println(numero);
	            numero--;
	        }

	        scanner.close();
	    }
}
