public class Maior_Menor {
    public static void main(String[] args) {

        double[] notas = {7.5, 4.0, 9.8, 6.5, 3.2, 8.5};
        double Maior = notas[0];
        double Menor = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > Maior) {
                Maior = notas[i];
            } else if (notas[i] < Menor) {
                Menor = notas[i];
            }
        }
        System.out.println("A maior nota é:" + Maior + "\ne a menor nota é:" + Menor);
    }
}
