public class Main {
    public static void main(String[] args) {

        Produto leite = new Produto("Leite", 4.50, 200);


        System.out.println("Informações iniciais do produto:");
        leite.exibirInformacoes();


        System.out.println("\nAtualizando o nome do produto...");
        leite.setNome("Leite Integral");

        System.out.println("Atualizando o preço do produto...");
        leite.setPreco(5.00);

        System.out.println("Atualizando a quantidade em estoque...");
        leite.setQuantidadeEstoque(150);


        System.out.println("\nInformações atualizadas do produto:");
        leite.exibirInformacoes();


        System.out.println("\nAcessando valores com getters:");
        System.out.println("Nome: " + leite.getNome());
        System.out.println("Preço: R$ " + leite.getPreco());
        System.out.println("Quantidade em Estoque: " + leite.getQuantidadeEstoque());
    }
}