package lista1.questao17;
import lista1.questao16.*;
import java.util.Scanner;
public class ContaUtil {
    public static void main(String[] args) {
        double valor;
        boolean aprovado;
        Conta conta = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe Saldo Mínimo: ");
        valor = scanner.nextDouble(); // entrada de saldo mínimo de conta
        conta = new Conta(valor);
        System.out.print("\nInforme Depósito Inicial: ");
        valor = scanner.nextDouble(); // entrada de valor de depósito inicial da conta
        conta.depositar(valor); // operação de depósito
        aprovado = true;
        do {
            System.out.print("\nInforme Saque após Depósito Inicial: ");
            valor = scanner.nextDouble();
            try {

                conta.sacar(valor);
                aprovado = false;
            } catch (Exception e) {
                e.getMessage();
            }
        }    while (aprovado) ;

            // exibição de saldo corrente de conta após operações de depósito e saque
            System.out.println("\nSaldo Final: " + conta.getSaldo());
            scanner.close();

    }
}