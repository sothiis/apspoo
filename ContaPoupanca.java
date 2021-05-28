public class ContaPoupanca extends Conta{
    // A ​ContaPoupança​realiza saque se houver saldo, mas há uma taxa por operação.
    // A taxa édefinida para toda a classe e não para cada objeto individualmente
    // (atributo estático)

    private double taxa;
    
    public ContaPoupanca(String nome, String cpf, int numero, double saldo, double taxa) {
        super (nome, cpf, numero, saldo);
        this.taxa = taxa;
    }

    public double getTaxa(){
        return taxa;
    }

    public double setTaxa(){
        return taxa;
    }

    @Override
    public String getDados() {
        return "Conta Poupança:" + getNome() + " - " + getCpf() +  getNumero() + getSaldo() +  taxa;
    }
}

