package exerciciosLista09;
import java.util.Scanner;
public class Ex06 {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double nota;
	        double soma = 0;
	        int contador = 0;

	        System.out.println("Digite notas entre 0 e 10. Digite um valor fora desse intervalo para encerrar.");

	        do {
	            System.out.print("Digite uma nota: ");
	            nota = scanner.nextDouble();

	            if (nota >= 0 && nota <= 10) {
	                soma += nota;
	                contador++;
	            }

	        } while (nota >= 0 && nota <= 10);

	        if (contador > 0) {
	            double media = soma / contador;
	            System.out.printf("Média das notas: %.2f%n", media);
	        } else {
	            System.out.println("Nenhuma nota válida foi inserida.");
	        }

	        scanner.close();
	    }
}
