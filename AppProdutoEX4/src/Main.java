//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Produto arroz = new Produto("Arroz", 5.99, 100);


        System.out.println("Informações iniciais do produto:");
        arroz.exibirInformacoes();


        System.out.println("\nAtualizando o preço do produto...");
        arroz.alterarPreco(6.49);


        System.out.println("\nAtualizando a quantidade em estoque...");
        arroz.alterarQuantidade(80);


        System.out.println("\nInformações atualizadas do produto:");
        arroz.exibirInformacoes();
    }
}