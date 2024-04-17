package lista1.questao16;
public class Conta {
    private double saldo;
    private double saldoMinimo;
    public Conta(double saldoMinimo) {
        this.saldo = 0; // inicialização de saldo atual (corrente) com 0 (zero)
        this.saldoMinimo = saldoMinimo;
    }
    // retorno de valor atual do saldo mínimo
    public double getSaldoMinimo() {
        return saldoMinimo;
    }
    // atualização de valor atual do saldo mínimo
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    // retorno de valor atual do saldo corrente
    public double getSaldo() {
        return saldo;
    }
    // operação de registro de depósito em conta, com atualização de saldo corrente
    public void depositar(double deposito) {
        saldo += deposito;
    }
    // operação de registro de saque em conta, com atualização de saldo corrente
    public void sacar(double saque)  throws Exception{
        double saldoAtualizado = saldo - saque;
        if (saldoAtualizado < saldoMinimo) {
            throw new Exception("Saldo inferior ao saldo mínimo");
        } else {
            saldo = saldoAtualizado;
        }

    }
}