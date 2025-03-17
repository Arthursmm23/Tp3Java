public class Produto {

    private String nome;
    private double preco;
    private int quantidadeEmEstoque;   


    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }


    public void alterarPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
            System.out.println("Preço do produto atualizado para R$ " + novoPreco);
        } else {
            System.out.println("Erro: O preço não pode ser negativo.");
        }
    }


    public void alterarQuantidade(int novaQuantidade) {
        if (novaQuantidade >= 0) {
            this.quantidadeEmEstoque = novaQuantidade;
            System.out.println("Quantidade em estoque atualizada para " + novaQuantidade);
        } else {
            System.out.println("Erro: A quantidade não pode ser negativa.");
        }
    }


    public void exibirInformacoes() {
        System.out.println("\nInformações do Produto:");
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}