package lista1.questao06;
import java.util.Date;
public class Voo {

    protected final static int Tam = 70;
    protected boolean[] assentos;
    protected int numero;
    protected Date data;

    public Voo(int numero, Date data) {
        this.assentos = new boolean[Tam];
        this.numero = numero;
        this.data = data;
    }
    public boolean[] getAssentos() {
        return assentos;
    }
    public int getNumero() {
        return numero;
    }
    public Date getData() {
        return data;
    }
    public int getProximoAssentoLivre() {
        for(int i =0; i< assentos.length; i++) {
            if(!assentos[i]) {
                return i+1;
            }
        }
        return  0;
    }

    public boolean isAssentoLivre(int n) {
        if(!assentos[n-1]) {
            return true;
        }
        return false;
    }

    public boolean ocuparAssento(int n) {
        if(!isAssentoLivre(n) || n > 70 || n < 0 ) {
          return false;
        } else {
            assentos[n-1] = true;
        }
        return true;
    }

    public int getTotalAssentosLivres() {
        int cont = 0;
        for(int i = 0; i < assentos.length; i++) {
            if(!assentos[i]) {
                cont++;
            }
        }
        return cont;
    }

    public double getTaxaOcupacao() {
      int taxaOcupacao = assentos.length - getTotalAssentosLivres();
      return taxaOcupacao * 100.0 / assentos.length;
    }



}
