package Ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<FormaGeometrica> lista = new ArrayList<>();

        lista.add(new Cilindro(1,1,1,1));
        lista.add(new Circulo(2,2,2));
        lista.add(new Cilindro(3,3,3,3));


        for (FormaGeometrica f: lista){
            // pega o nome da classe
            System.out.println("-"+f.getClass().getSimpleName());
            System.out.print(f);
            System.out.println("Area: "+f.calcularArea());
            if (f instanceof Volume){
                System.out.println("Volume: "+((Volume) f).calcularVolume());
            }
            System.out.println("------------");
        }


    }
}
