import java.util.ArrayList;

public class GerenciaConta {
    private ArrayList<Conta> listaDeContas;

    public GerenciaConta(){
        listaDeContas = new ArrayList<>();
    }

    public void novaContaCorrente(int numero, double saldo, String nome, String cpf){
        listaDeContas.add(new ContaCorrente(numero, saldo, nome, cpf));

    }

    public void novaContaEspecial(int numero, double saldo, String nome, String cpf, double limite){
        listaDeContas.add(new ContaEspecial(numero, saldo, nome, cpf, limite));

    }

    public void novaContaPoupanca(int numero, double saldo, String nome, String cpf, int taxa){
        listaDeContas.add(new ContaPoupanca(numero, saldo, nome, cpf, taxa));
    }

    public String listarContas(){
        String saida = "";
        for (Conta conta : listaDeContas) {
            saida += conta.getDados() + "\n";
        }
        return saida;
    }
    }

}
