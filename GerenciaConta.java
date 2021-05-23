import java.util.ArrayList;

public class GerenciaConta {
    private ArrayList<Conta> listaDeContas;

    public GerenciaConta() {
        listaDeContas = new ArrayList<>();
    }

    public void novaContaCorrente(String nome, String cpf) {
        listaDeContas.add(new ContaCorrente(numero, saldo, nome, cpf));

    }

    public void novaContaEspecial(String nome, String cpf) {
        listaDeContas.add(new ContaEspecial(numero, saldo, nome, cpf, limite));

    }

    public void novaContaPoupanca(String nome, String cpf) {
        listaDeContas.add(new ContaPoupanca(numero, saldo, nome, cpf, taxa));
    }

    public String listarContas() {
        String saida = "";
        for (Conta conta : listaDeContas) {
            saida += conta.getDados() + "\n";
        }
        return saida;
    }

    public String buscarNome (String nome){
        for (Conta conta : listaDeContas){
            if(conta.getNome().equals(nome)){
                return conta.getDados();
            }
        }
        return "Não encontrado";
    }

    public String buscarCpf (String nome){
        for (Conta conta : listaDeContas){
            if(conta.getCpf().equals(nome)){
                return conta.getDados();
            }
        }
        return "Não encontrado";
    }

    
}
