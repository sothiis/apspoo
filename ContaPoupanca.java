public class ContaPoupanca extends Conta {
    // A ​ContaPoupança​realiza saque se houver saldo, mas há uma taxa por operação.
    // A taxa édefinida para toda a classe e não para cada objeto individualmente
    // (atributo estático)

    private double taxa;

    public ContaPoupanca(String nome, String cpf, int numero, double saldo) {
        super(nome, cpf, numero, saldo);
        // this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public double setTaxa() {
        return taxa;
    }

    @Override
    public String getDados() {
        return "CONTA POUPANÇA  " + "NOME: " + getNome() + " - " + "CPF: " + getCpf() + " NÚMERO DA CONTA: "
                + getNumero() + " SALDO: " + getSaldo();
    }
}
