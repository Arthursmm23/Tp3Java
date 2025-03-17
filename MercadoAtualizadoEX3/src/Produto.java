public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void alterarPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
            System.out.println("Preço do produto atualizado para R$ " + novoPreco);
        } else {
            System.out.println("Erro: O preço não pode ser negativo.");
        }
    }

    public void alterarQuanti(int novaQuant) {
        if (novaQuant >=0){
            this.quantidadeEstoque = novaQuant;
            System.out.println("Quantidade em estoque atualizada para " + novaQuant);
        } else {
            System.out.println("Erro: quantidade não pode ser negativa");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\nInformações do Produto:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEstoque);
    }
}
