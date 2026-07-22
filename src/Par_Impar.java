import java.util.Scanner;

public class Par_Impar {
    public static void main(String[] args) {

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Digite um número");
        int valor = scan2.nextInt();
        if (valor % 2 == 0) {
            System.out.println("O valor:" + valor + " " + "é par");
        } else {
            System.out.println("O valor:" + valor + " " + "é impar");
        }
    }
}
