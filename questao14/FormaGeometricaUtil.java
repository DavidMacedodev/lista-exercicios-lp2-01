package lista1.questao14;

import java.util.Scanner;

public class FormaGeometricaUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtd, op;
        double lado, base, altura, raio;

        System.out.println("Digite a quantidade de formas geométricas:");
        qtd = sc.nextInt();
        FormaGeometrica[] formas = new FormaGeometrica[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Digite a forma geométrica desejada: ");
            System.out.println("1 - Quadrado");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Círculo");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o lado do quadrado: ");
                    lado = sc.nextDouble();
                    formas[i] = new Quadrado(lado);
                    System.out.println("A área do quadrado é: " + formas[i].calcArea());
                    System.out.println("O perímetro do quadrado é: " + formas[i].calcPerimetro());
                    break;
                case 2:
                    System.out.println("Digite a base do retângulo: ");
                    base = sc.nextDouble();
                    System.out.println("Digite a altura do retângulo: ");
                    altura = sc.nextDouble();
                    formas[i] = new Retangulo(base, altura);
                    System.out.println("A área do retângulo é: " + formas[i].calcArea());
                    System.out.println("O perímetro do retângulo é: " + formas[i].calcPerimetro());
                    break;
                case 3:
                    System.out.println("Digite o raio do círculo: ");
                    raio = sc.nextDouble();
                    formas[i] = new Circulo(raio);
                    System.out.println("A área do círculo é: " + formas[i].calcArea());
                    System.out.println("O perímetro do círculo é: " + formas[i].calcPerimetro());
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
        sc.close();
    }
}