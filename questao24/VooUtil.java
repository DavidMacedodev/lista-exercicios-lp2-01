package lista1.questao24;
import lista1.questao23.Voo;

import java.util.Scanner;
import java.util.Date;
public class VooUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Voo v;
         boolean isFalhaEntrada = true;
        int tam = 30;
        v = new Voo(1,new Date(), tam);
        int res, assento;
        do {
            System.out.println("1 - ver o proximo assento livre");
            System.out.println("2 - verificar algum assento livres especifico");
            System.out.println("3 - ocupar algum assento livre");
            System.out.println("4 - ver o total de assentos livres");
            System.out.println("5 - ver a taxa de ocupacao");
            System.out.println("0 - sair");
        res = sc.nextInt();

        switch(res) {
            case 1:
            System.out.println(" O proximo assento livre é " + v.getProximoAssentoLivre());
            break;
            case 2:
                System.out.println(" digite o assento que deseja verificar");
                assento = sc.nextInt();
                try {
                    System.out.println(" O assento esta: " + v.isAssentoLivre(assento));
                    isFalhaEntrada = false;
                }catch(Exception e) {
                    e.getMessage();
                }
           
              
                break;
            case 3:
                System.out.println(" digite o assento que deseja ocupar");
                assento = sc.nextInt();
                try {
                System.out.println(" O assento foi: " + v.ocuparAssento(assento));
                } catch(Exception e) {
                    e.getMessage();
                }
                break;
            case 4:
                System.out.println("O total de assentos livres é " + v.getTotalAssentosLivres());
                break;
            case 5:
                System.out.println(" A taxa de ocupacao é " + v.getTaxaOcupacao());
        }

        } while (res != 0);
    }

}
