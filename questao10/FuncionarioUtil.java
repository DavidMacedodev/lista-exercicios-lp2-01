package lista1.questao10;

import lista1.questao09.Funcionario;
import java.util.Scanner;

public class FuncionarioUtil {

    public static void main(String[] args) {
        String nome;
        String sobrenome;
        double horas;
        int op;
        double valorHora;
        Scanner sc = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[2];

        for(int i = 0; i < funcionarios.length; i++) {
            System.out.println("Digite o nome do funcionário:");
            nome = sc.nextLine();

            System.out.println("Digite o sobrenome do funcionário:");
            sobrenome = sc.nextLine();

            System.out.println("Digite o valor hora do funcionário:");
            valorHora = sc.nextDouble();
            funcionarios[i] = new Funcionario(nome, sobrenome, valorHora);
            sc.nextLine();
        }

        do {
            System.out.println("1 - Acréscimo de nova quantidade de horas trabalhadas de algum dos funcionários;");
            System.out.println("2 - Exibição de salário líquido até o momento de cada um dos funcionários;");
            System.out.println("0 - Encerramento da aplicação.");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do funcionário que deseja adicionar carga horária:");
                    nome = sc.nextLine();
                    boolean encontrado1 = false;
                    for (int i = 0; i < funcionarios.length; i++) {
                        if (funcionarios[i].getNome().equalsIgnoreCase(nome)) {
                            System.out.println("Digite a carga horária que deseja adicionar:");
                            horas = sc.nextDouble();
                            funcionarios[i].adicionarCargaHoraria(horas);
                            System.out.println("Horas adicionadas ao funcionário " + funcionarios[i].getNome());
                            encontrado1 = true;
                            break;
                        }
                    }
                    if (!encontrado1) {
                        System.out.println("Funcionário não encontrado");
                    }
                    break;
                case 2:
                    System.out.println("Exibindo salário líquido de cada funcionário:");
                    boolean encontrado2 = false;
                    for (Funcionario funcionario : funcionarios) {
                        System.out.println("Nome: " + funcionario.getNome());
                        System.out.println("Salário Líquido: " + funcionario.getSalarioLiquido());
                        encontrado2 = true;
                    }
                    if (!encontrado2) {
                        System.out.println("Nenhum funcionário encontrado");
                    }
                    break;
            }
        } while (op != 0);

    }
}
