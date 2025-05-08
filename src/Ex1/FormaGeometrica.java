package Ex1;

public class FormaGeometrica {

    private int coordenadaX;
    private int coordenadaY;
    private double raio;


    public FormaGeometrica(int coordenadaX, int coordenadaY, double raio) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.raio = raio;
    }

    @Override
    public String toString() {
        String aux = " ";
        aux += "Coordenada X: " + coordenadaX + "\n";
        aux += "Coordenada Y: " + coordenadaY + "\n";
        aux += "Raio: " + raio + "\n";
        return aux;
    }


    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
