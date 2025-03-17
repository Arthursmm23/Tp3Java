 //Classe: É um modelo que define a estrutura e o comportamento de um tipo de objeto. Contém atributos e métodos que descrevem o que o objeto pode fazer e o que ele pode armazenar
 //Objeto: É um instância de uma classe. Ou seja, o objeto é uma propiedade específica baseada na classe, com seus própios valores.
 //Atributos: São variáveis que pertecem a uma classe ou objeto. Eles representam as características do objeto.
 //Métodos são funções definidas dentro de uma classe que descrevem o comportamento do objeto.Eles podem manipular os campos da classe ou realizar outras operações.
public class Main {
    public static void main(String[] args) {
        //Objeto da classe Carro
         Carro meuCarro = new Carro();

         //atribuindo valores ao objeto
        meuCarro.marca = "Honda";
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2022;

        //métodos do objeto
        meuCarro.exibirInformacoes();
        meuCarro.acelerar(20);
    }
}