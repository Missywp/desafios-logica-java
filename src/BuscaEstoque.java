import java.util.Scanner;
public class BuscaEstoque {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] Produtos = {"Teclado", "Mouse", "Monitor", "Fone", "Webcam"};
        double[] Preco = {150.0, 80.0, 900.0, 200.0, 350.0};

        System.out.print("Digite o nome do produto: ");

        String produtoProcurado = scan.nextLine();

        for (int i = 0; i < Produtos.length; i++) {
            if (produtoProcurado.equalsIgnoreCase(Produtos[i])) {
                System.out.println(Produtos[i] + " custa: R$ " + Preco[i]);
            }
        }
    }
}
