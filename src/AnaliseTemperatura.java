public class AnaliseTemperatura {
    public static void main(String[] args) {

        double[] RegistroTemp = {20.0, 33.4, 21.4, 40.0, 25.5, 33.0, 12.0};
        double soma = 0.0;
        int somaTemp = 0;
        for (int i = 0; i < RegistroTemp.length; i++) {
            soma += RegistroTemp[i];
            if (RegistroTemp[i] > 25) {
                somaTemp += 1;
            }

        }
        double media = soma / RegistroTemp.length;
        System.out.println("Soma total: " + soma);
        System.out.println("Média da semana: " + media + "°C");
        System.out.println("Quantidade de dias quentes (> 25°C): " + somaTemp);
    }
}
