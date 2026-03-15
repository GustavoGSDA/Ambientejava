import java.util.Scanner;
public class BoasVindas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do cliente
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        // Exibe a mensagem de boas-vindas
        System.out.println("Bem-vindo, " + nome + "!");

        scanner.close();
    }
}
