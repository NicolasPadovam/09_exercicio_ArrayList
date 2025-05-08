package Ex1;

public class Circulo extends FormaGeometrica {

    public Circulo(int coordenadaX, int coordenadaY, double raio) {
        super(coordenadaX, coordenadaY, raio);
    }

    @Override
    public double calcularArea() {
        return PI * Math.pow(getRaio(),2);
    }


}
