public class ContaPoupanca extends Conta {

    private double taxa = 10;

    public ContaPoupanca(String nome, String cpf, int numero, double saldo) {
        super(nome, cpf, numero, saldo);
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa() {
        this.taxa = taxa;
    }

    @Override
    public String getDados() {
        return "CONTA POUPANÇA  " + "NOME: " + getNome() + " - " + "CPF: " + getCpf() + " NÚMERO DA CONTA: "
                + getNumero() + " SALDO: " + getSaldo();
    }

    @Override
    public boolean sacar(double valores) {
        if (getSaldo() >= (valores)) {
            setSaldo(getSaldo() - (valores + this.taxa));
            return true;
        }
        return false;

    }

    @Override
    public boolean depositar(double valores) {
        setSaldo(getSaldo() + valores);

        return true;
    }
}
