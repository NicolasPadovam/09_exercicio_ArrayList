package Ex1;

public class Cilindro extends FormaGeometrica implements Volume {

    private double altura;

    public Cilindro(int coordenadaX, int coordenadaY, double raio, double altura) {
        //"importa" o construtor da classe mãe
        super(coordenadaX, coordenadaY, raio);
        this.altura = altura;
    }

    @Override
    public String toString() {
        //"importa" o toString da classe mae (super)
        String aux = super.toString();
        aux += "Altura: "+altura + "\n";
        return aux;
    }

    @Override
    public double calcularArea() {
        return 2 * PI * getRaio() * (getRaio() + getAltura());
    }


    public double calcularVolume(){
        return -2;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
