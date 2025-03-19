//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto arroz = new Produto("Arroz", 6.99, 100);

        System.out.println("INformações do produto criado com o construtor");
        arroz.exibirInformacoes();

        System.out.println("\nAtualizando o preço e a quantidade em estoque...");
        arroz.setPreco(6.49);
        arroz.setQuantidadeEstoque(80);

        System.out.println("\nInformações atualizadas do produto:");
        arroz.exibirInformacoes();

    }
}