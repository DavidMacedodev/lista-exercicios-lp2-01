package lista1.questao15;

import java.util.InputMismatchException;
import java.util.Scanner;
public class DivisaoUtil {
    public static void main(String[] args) {
        int x, r;
        int y;
        boolean isFalhaEntrada;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Operação de Divisão\n");
        isFalhaEntrada = true;
        do {
            try {
                System.out.print("Informe Dividendo...: ");
                x = scanner.nextInt();
                isFalhaEntrada = false;
            } catch(InputMismatchException e) {
                System.out.println("ENTRADA INVÁLIDA!");
                scanner.next();
            }
        }  while(isFalhaEntrada);

        isFalhaEntrada = true;
        do {
            try{
                System.out.print("Informe Divisor.....: ");
                y = scanner.nextInt();

                isFalhaEntrada = false;
            } catch (InputMismatchException e) {
                System.out.println("ENTRADA INVÁLIDA!");
                scanner.next();
            }

        } while(isFalhaEntrada);

        try  {
            r = x / y;
            System.out.println("\nResultado da Divisão: " + r);
        } catch(InputMismatchException e) {
            System.out.println("ERRO: Divisão por zero!");
        }

        scanner.close();

    }
}