public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(3.0);
        System.out.println("Círculo criado com raio: " + circulo.getRaio());


        double areaCirculo = circulo.calcularArea();
        System.out.println("Área do círculo: " + areaCirculo);


        Esfera esfera = new Esfera(5.0);
        System.out.println("Esfera criada com raio: " + esfera.getRaio());


        double volumeEsfera = esfera.calcularVolume();
        System.out.println("Volume da esfera: " + volumeEsfera);
    }
}
