import java.util.Scanner;

public class ContadorVogais {
    public static void main(String[] args) {

        Scanner scan4 = new Scanner(System.in);
        System.out.print("Fale algo");
        String frase = scan4.nextLine().toLowerCase();
        int contador = 0;
        for (int i = frase.length() - 1; i >= 0; i--) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }
        }
        System.out.println("Fale algo: " + contador);
    }
}
