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

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeEstoque(int novaQuantidadeEstoque) {
        if (novaQuantidadeEstoque >= 0) {
            this.quantidadeEstoque = novaQuantidadeEstoque;
        } else {
            System.out.println("A quantidade tem que ser positiva");
        }
    }

    public void setPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("O preço não pode ser negativo");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\nInformações do produto: ");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
    }
}
