package exerciciosLista09;
import java.util.Scanner;
public class Ex10 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        final String SENHA_CORRETA = "1234";
	        String senha;

	        do {
	            System.out.print("Digite a senha: ");
	            senha = scanner.nextLine();

	            if (!senha.equals(SENHA_CORRETA)) {
	                System.out.println("Senha incorreta. Tente novamente.");
	            }

	        } while (!senha.equals(SENHA_CORRETA));

	        System.out.println("Acesso permitido.");
	        scanner.close();
	    }
}
