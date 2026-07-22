import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {

        Scanner scan5 = new Scanner(System.in);
        double saldo = 5000.80;
        System.out.print("Escolha uma opção\n 1:Depositar\n 2:ver saldo\n 3:sair");
        int escolha = scan5.nextInt();

        while (escolha != 3){
            System.out.print("CAIXA ELETRONICO");
            if(escolha == 1){
                System.out.print("valor a ser depositado:");
                saldo += scan5.nextDouble();
                System.out.println("saldo atual:"+saldo);
            }else if(escolha == 2 ){
                System.out.print("valor do saldo atual:"+saldo);


            }
            System.out.print("Escolha uma opção\n 1:Depositar\n 2:ver saldo\n 3:sair");
            escolha = scan5.nextInt();
        }
    }
}


