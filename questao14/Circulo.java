package lista1.questao14;
public class Circulo implements FormaGeometrica {

    protected double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcArea() {
        double area = Math.PI * raio * raio;
        return area;
    }
    public double calcPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
}