 //ex7 e 8
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta("Arthur Moreira" , 12345, "001", "01/01/2025");

        System.out.println("Informações da conta");
        conta.exibirIformacoes();

        System.out.println("\nRealizando operações...");
        conta.depositar(1000.0);
        conta.sacar(200.0);

        System.out.println("\nInformações atualizadas da conta:");
        conta.exibirIformacoes();

        System.out.println("\nRendimento mensal: R$ " + conta.calculaRend());
    }
}