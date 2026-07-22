public class ContagemLetras {

    public static void main(String[] args) {

        String[] Nomes = {"Manuel", "Emilia", "Vanessa", "Juca"};

        for (int i = 0; i < Nomes.length; i++) {
            String NomesMaiusculo = Nomes[i].toUpperCase();
            int NumeroLetras = Nomes[i].length();
            System.out.println(NomesMaiusculo + "--Tem a seguinte quantidade de letras: " + NumeroLetras);
        }
    }
}
