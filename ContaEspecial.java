public class ContaEspecial extends Conta {
    // A ​ContaEspecial​ possui um limite que permite fazer saques se o saldo mais o
    // limite da conta cobrir o valor pretendido de saque.
    private double limite;

    public ContaEspecial(String nome, String cpf, int numero, double saldo) {
        super(nome, cpf, numero, saldo);
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
        return "CONTA ESPECIAL  " + "NOME: " + getNome() + " - " + "CPF: " + getCpf() + " NÚMERO DA CONTA: "
                + getNumero() + " SALDO: " + getSaldo() + "LIMITE: " + limite;
    }
}
