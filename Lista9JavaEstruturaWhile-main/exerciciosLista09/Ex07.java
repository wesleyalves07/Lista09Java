package exerciciosLista09;
import java.util.Random;
import java.util.Scanner;
public class Ex07 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int numeroSecreto = random.nextInt(10) + 1; // Gera número de 1 a 10
	        int tentativa;

	        System.out.println("Tente adivinhar o número secreto entre 1 e 10.");

	        do {
	            System.out.print("Digite sua tentativa: ");
	            tentativa = scanner.nextInt();

	            if (tentativa != numeroSecreto) {
	                System.out.println("Errado! Tente novamente.");
	            }

	        } while (tentativa != numeroSecreto);

	        System.out.println("Parabéns! Você acertou o número: " + numeroSecreto);
	        scanner.close();
	    }
}
