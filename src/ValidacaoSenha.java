import java.util.Scanner;

public class ValidacaoSenha {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String Senha = "1234";

        System.out.println("--- TESTE DE SENHA ---");
        System.out.print("Digite sua Senha: ");

        if (input.nextLine().equals(Senha)) {
            System.out.println("senha correta\n");
        } else {
            System.out.println("senha incorreta\n");
        }
    }
}