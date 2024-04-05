package lista1.questao04;


import java.util.Scanner;

public class ContaCorrenteUtil {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res;
        double v;

        ContaCorrente c1 = new ContaCorrente();

        System.out.println("O saldo atual é " + c1.getSaldo());

        do {
            System.out.println("Digite a operação desejada: ");
            System.out.println("1 - registrar deposito ");
            System.out.println("2 - registrar saque ");
            System.out.println(" 0 - sair ");
            res = sc.nextInt();

            switch(res) {
                case 1:
                    System.out.println("Digite o valor do deposito: ");
                    v = sc.nextDouble();
                    c1.registrarDeposito(v);
                    System.out.println("O saldo atual é " + c1.getSaldo());
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    v = sc.nextDouble();
                    c1.registrarSaque(v);
                    System.out.println("O saldo atual é " + c1.getSaldo());
                    break;
            }

        } while(res != 0);

    }
}