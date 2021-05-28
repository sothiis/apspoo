import java.util.ArrayList;

public class GerenciaConta {
    private ArrayList<Conta> listaDeContas;

    public GerenciaConta() {
        listaDeContas = new ArrayList<>();
    }

    public void novaContaCorrente(String nome, String cpf, int numero, double saldo) {
        listaDeContas.add(new ContaCorrente(nome, cpf, numero, saldo));

    }

    public void novaContaEspecial(String nome, String cpf, int numero, double saldo, double limite) {
        listaDeContas.add(new ContaEspecial(nome, cpf, numero, limite));

    }

    public void novaContaPoupanca(String nome, String cpf, int numero, double saldo) {
        listaDeContas.add(new ContaPoupanca(nome, cpf, numero, saldo));
    }

    public boolean remove(String cpf) {
        for (Conta conta : listaDeContas) {
            if (conta.getCpf().equalsIgnoreCase(cpf)) {
                listaDeContas.remove(conta);
                return true;
            }
        }
        return false;
    }

    public String listarContas() {
        String saida = "";
        for (Conta conta : listaDeContas) {
            saida += conta.getDados() + "\n";
        }
        return saida;
    }

    public String buscarNome(String nome) {
        for (Conta conta : listaDeContas) {
            if (conta.getNome().equals(nome)) {
                return conta.getDados();
            }
        }
        return "Não encontrado";
    }

    public String buscarCpf(String nome) {
        for (Conta conta : listaDeContas) {
            if (conta.getCpf().equals(nome)) {
                return conta.getDados();
            }
        }
        return "Não encontrado";
    }
}
