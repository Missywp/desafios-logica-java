public class RadarTransito {
    public static void main(String[] args) {

        int[] radar = {75, 92, 80, 105, 60};
        int multados = 0;
        for (int i = 0; i < radar.length; i++) {
            if (radar[i] > 80) {
                multados++;
                int excesso = radar[i] - 80;
                System.out.println(radar[i] + " km/h - MULTADO! Excesso de " + excesso + " km/h");
            } else {
                System.out.println(radar[i] + " km/h - OK");
            }
        }
        System.out.println("Veiculos multados:\n" + multados);
    }
}
