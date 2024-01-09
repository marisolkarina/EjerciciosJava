package ClasesAbstractas;

public class Cuadrado extends Figura{
    private float lado;

    public Cuadrado (String color, float lado) {
        super(color);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public float perimetro() {
        return 4*lado;
    }

    @Override
    public void printColor () {
        System.out.println("El color del cuadrado es "+color);
    }


}