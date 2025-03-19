public class Circulo {

    private double raio;


    public Circulo(double raio) {
        this.raio = raio;
    }


    public double getRaio() {
        return raio;
    }


    public void setRaio(double raio) {
        if (raio > 0) {
            this.raio = raio;
        } else {
            System.out.println("Erro: O raio deve ser um valor positivo.");
        }
    }


    public double calcularArea() {
        return Math.PI * (raio * raio);
    }
}