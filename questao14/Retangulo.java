package lista1.questao14;

public class Retangulo extends Quadrilatero {

    protected double base;
    protected double altura;


    public Retangulo(double base, double altura) {
        super(base,altura,base,altura);
    }

    public double calcArea() {
        double area = lado1 * lado2;
        return area;
    }
}