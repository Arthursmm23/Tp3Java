public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }


    public void setPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("Erro: preço tem que ser positiva");
        }
    }


    public void setQuantidadeEstoque(int novaQuantidadeEstoque) {
        if(novaQuantidadeEstoque >= 0) {
            this.quantidadeEstoque = novaQuantidadeEstoque;
        } else {
            System.out.println("Erro: tem que ser posotivo");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\nInformações do produto:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }
}

        //Construtor é um método especial chmado automaticamente quando um objeto da classe é criado
//Ele recebe parâmetros(nome,preco,quantidadeEstoque) e usa esses valores para inicializar os atributos da classe
//o construtuor atribui os valores passados como argumentos aos atributos correspondentes(this.nome= nome, etc.)
//O construtor além de ser mais rápido e eficaz, ele permite inicializar todos os atributos de numa vez, evitando a necessidade de chamar vários set
