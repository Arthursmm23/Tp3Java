//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Objeto da classe Produto
        Produto arroz = new Produto("Arroz", 5.99, 100);

        arroz.exibirInfo();

        arroz.setPreco(6.49);
        arroz.setQuantidadeEstoque(80);

        System.out.println("\nInformações atualizadas:");
        arroz.exibirInfo();
    }
}