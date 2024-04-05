package lista1.questao08;

import lista1.questao06.Voo;

import java.util.Date;

public class VooFlexivel extends Voo{

    protected int tamanho;
    public VooFlexivel(int numero, Date data, int tamanho) {
        super(numero, data);
        this.assentos = new boolean[tamanho];
    }


    public int getTotalAssentos() {
        return assentos.length;
    }

}
