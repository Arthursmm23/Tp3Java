//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Produto feijao = new Produto("Feijão", 8.50, 150);

        feijao.exibirInformacoes();

        feijao.alterarPreco(9.00);

        feijao.alterarQuanti(120);

        feijao.exibirInformacoes();
    }
}