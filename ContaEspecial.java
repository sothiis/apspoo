public class ContaEspecial extends Conta {
    // A ​ContaEspecial​ possui um limite que permite fazer saques se o saldo mais o
    // limite da contacobrir o valor pretendido de saque.
    private double limite;

    public ContaEspecial(int numero, double saldo, String nome, String cpf, double limite) {
        super(numero, saldo, nome, cpf);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public double setLimite() {
        return limite;
    }

    @Override
    public String getDados() {
        return "Conta Poupança:" + getNome() + " - " + getNumero() + getSaldo() + getCpf() + limite;
    }
}
