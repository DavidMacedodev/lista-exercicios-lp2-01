package lista1.questao04;

public class ContaCorrente {

    protected double saldo;


    public double getSaldo() {
        return saldo;
    }



    public boolean registrarDeposito(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        } else
            return false;

    }

    public boolean registrarSaque(double valor) {
        if (valor <= 0)
            return false;
        else {
            double tarifa = valor * 0.5 / 100;
            if (saldo < valor + tarifa)
                return false;
            else {

                saldo -= (valor + tarifa);
                return true;
            }
        }

    }
}
