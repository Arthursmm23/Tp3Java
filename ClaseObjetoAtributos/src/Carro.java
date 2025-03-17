public class Carro {
    //atributos
    String marca;
    String modelo;
    int ano;

    //Método
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " +modelo);
        System.out.println("Ano: " + ano);
    }

    //Método
    public void acelerar(int incrementoVelo) {
        System.out.println("Acelerando o carro em " + incrementoVelo + "km/h");
    }
}
