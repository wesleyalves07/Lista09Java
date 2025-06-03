package exerciciosLista09;
import java.util.Scanner;
public class Ex04 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número para ver sua tabuada: ");
	        int numero = scanner.nextInt();

	        int i = 1;

	        do {
	            int resultado = numero * i;
	            System.out.println(numero + " x " + i + " = " + resultado);
	            i++;
	        } while (i <= 10);

	        scanner.close();
	    }
}
