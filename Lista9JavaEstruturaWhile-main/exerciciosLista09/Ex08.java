package exerciciosLista09;
import java.util.Scanner;
public class Ex08 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        String palavra;

	        while (true) {
	            System.out.print("Digite uma palavra (ou 'sair' para encerrar): ");
	            palavra = scanner.nextLine().toLowerCase();

	            if (palavra.equals("sair")) {
	                break;
	            }

	            int contadorVogais = 0;

	            for (int i = 0; i < palavra.length(); i++) {
	                char c = palavra.charAt(i);
	                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                    contadorVogais++;
	                }
	            }

	            System.out.println("Número de vogais: " + contadorVogais);
	        }

	        System.out.println("Programa encerrado.");
	        scanner.close();
	    }
}
