package lista1.questao14;

public abstract class Quadrilatero implements FormaGeometrica {

    protected double lado1;
    protected double lado2;
    protected double lado3;
    protected double lado4;

    public Quadrilatero(double lado1, double lado2, double lado3, double lado4) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    public double calcPerimetro() {
        double perimetro = lado1 + lado2 + lado3 + lado4;
        return perimetro;
    }
}