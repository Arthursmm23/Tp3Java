public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    //Construtor e atributos
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome; //o nome do produto é primordial para identificá-lo no sistema. Sem um nome não tem como diferenciar os produtos
        this.preco = preco;// determina o valor do produto e ajuda no calculo de receitas e lucro
        this.quantidadeEstoque = quantidadeEstoque;//permite controlar o inventario do mercado
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Método
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }


}
