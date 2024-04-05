package lista1.questao09;

public class Funcionario {

    protected String nome;
    protected String sobrenome;
    protected int horas;
    protected double valorHora;

    public Funcionario(String nome, String sobrenome, double valorHora) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horas = 0;
        this.valorHora = valorHora;
    }


    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getHoras() {
        return horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void adicionarCargaHoraria(int h) {
        horas += h;
    }

    public double getSalarioLiquido() {

        double salarioMinimo =  1212.0;
        double salario = valorHora * horas;
        double aliquota = salario - salarioMinimo;
        if(salario >= 3641.04) {
            salarioMinimo = salarioMinimo - (salarioMinimo * 0.075);
            salario = salario - (aliquota * 0.14) - salarioMinimo;

        } else if(salario >= 2427.36) {
            salarioMinimo = salarioMinimo - (salarioMinimo * 0.075);
            salario = salario - (aliquota * 0.12) - salarioMinimo;
        }
        else if(salario >= 1212.01) {
            salarioMinimo = salarioMinimo - (salarioMinimo * 0.075);
            salario = salario - (aliquota * 0.09) - salarioMinimo;
        } else {
            salario = salario - (salario * 0.075);
        }
        return salario;
    }

}
