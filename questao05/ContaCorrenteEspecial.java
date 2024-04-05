package lista1.questao05;
import lista1.questao04.ContaCorrente;
public class ContaCorrenteEspecial extends ContaCorrente {
    public boolean registrarSaque(double valor) {
        if ( valor <= 0)  {

            return false;
        } else {
            double tarifa = valor * 0.1 / 100;
            if (saldo >= valor + tarifa) {

                saldo -= valor + tarifa;
                return true;
            } else {
                return false;
            }
        }

    }
}
