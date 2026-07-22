public class ListandoMeses {
    public static void main(String[] args) {

    int[] mesNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    String[] mesMes = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    System.out.println("--- DE TRÁS PARA FRENTE ---");
    for (int j = mesNum.length - 1; j >= 0; j--) {
        System.out.println(mesNum[j] + " - " + mesMes[j]);
    }

    System.out.println("\n--- DO COMEÇO AO FIM ---");
    for (int i = 0; i < mesNum.length ; i++) {
        System.out.println(mesNum[i] + " - " + mesMes[i]);
    }
    }

}
