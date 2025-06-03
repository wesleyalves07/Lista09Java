package exerciciosLista09;
import java.util.Scanner;
public class Ex03 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int numero;
	        int soma = 0;

	        System.out.println("Digite números positivos para somar. Digite um número negativo para encerrar.");

	        while (true) {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();

	            if (numero < 0) {
	                break;
	            }

	            soma += numero;
	        }

	        System.out.println("A soma total dos números positivos é: " + soma);
	        scanner.close();
	    }
}
