package exerciciosLista09;
import java.util.Scanner;
public class Ex09 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número inteiro não negativo para calcular o fatorial: ");
	        int numero = scanner.nextInt();

	        if (numero < 0) {
	            System.out.println("Fatorial não é definido para números negativos.");
	        } else {
	            long fatorial = 1;
	            int i = 1;

	            do {
	                fatorial *= i;
	                i++;
	            } while (i <= numero);

	            System.out.println("Fatorial de " + numero + " é: " + fatorial);
	        }

	        scanner.close();
	    }
}
