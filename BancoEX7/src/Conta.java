public class Conta {

    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private String dataAbertura;

    public Conta(String titular, int numero, String agencia, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.dataAbertura = dataAbertura;
        this.saldo = 0.0;
    }

    public void sacar(double valor) {
       if (valor > 0 && valor <= saldo) {
           saldo -=valor;
           System.out.println("Saque de R$ " + valor +  " Realizado com sucesso.");
       } else {
           System.out.println("Erro: Saldo insuficiente ou valor inválido.");
       }
    }

    public void  depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Erro: Valor de depósito inválido");
        }
    }

    public double calculaRend() {
        double rendimento = saldo * 0.1;
        return rendimento;
    }

    public void exibirIformacoes() {
        System.out.println("\nInformações da Conta");
        System.out.println("Titular: " + titular);
        System.out.println("Número: " + numero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Datra de Abertura: " + dataAbertura);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

}
