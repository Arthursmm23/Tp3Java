public class TestaConta {
    public static void main(String[] args) {

        Conta conta = new Conta("Kobe Bryant", 24248, "333", "24/08/2024");


        System.out.println("Informações iniciais da conta:");
        conta.exibirInformacoes();


        System.out.println("\nRealizando um depósito de R$ 1500.00...");
        conta.deposita(1500.0);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());


        System.out.println("\nRealizando um saque de R$ 300.00...");
        conta.saca(333.0);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());


        System.out.println("\nTentando realizar um saque de R$ 2000.00...");
        conta.saca(2000.0);
        System.out.println("Saldo após tentativa de saque: R$ " + conta.getSaldo());


        System.out.println("\nCalculando o rendimento mensal...");
        double rendimento = conta.calculaRendimento();
        System.out.println("Rendimento mensal (10% do saldo): R$ " + rendimento);


        System.out.println("\nInformações finais da conta:");
        conta.exibirInformacoes();
    }
}