
//o raio é uma medida fundamental para as figuras geometricas
//no circulo , o raoi é usado para calcular a área
//na esfera , o raio é usada para calcular o volume

public class Main {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(5.0);
        System.out.println("Círculo criado com raio: " + circulo.getRaio());


        circulo.setRaio(-3.0);


        Esfera esfera = new Esfera(7.0);
        System.out.println("Esfera criada com raio: " + esfera.getRaio());


        esfera.setRaio(10.0);
        System.out.println("Novo raio da esfera: " + esfera.getRaio());
    }
}