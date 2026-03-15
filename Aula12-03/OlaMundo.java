
import java.util.Scanner;

public class BoasVindas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Seja bem-vindo, " + nome + "!");

        scanner.close();
    }
}
