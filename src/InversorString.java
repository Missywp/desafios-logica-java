import java.util.Scanner;

public class InversorString {
    public static void main(String[] args) {

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Digite uma palavra:");
        String palavra = scan3.nextLine();
        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);

        }
        System.out.println(invertida);

    }
}