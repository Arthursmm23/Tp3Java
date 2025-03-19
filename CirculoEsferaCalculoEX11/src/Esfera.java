public class Esfera {

    private double raio;

    public Esfera(double raio) {
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


    public double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio);
    }
}