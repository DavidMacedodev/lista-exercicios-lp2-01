package lista1.questao14;

public class Quadrado extends Quadrilatero {


    public Quadrado(double lado) {
        super(lado,lado,lado,lado);
    }

    public double calcArea() {
        double area = lado1 * lado1;
        return area;
    }
}