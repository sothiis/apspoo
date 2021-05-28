public class ContaCorrente extends Conta {
   // A ​ContaCorrente​ permite fazer saques somente se houver saldo suficiente.

   public ContaCorrente(String nome, String cpf, int numero, double saldo) {
      super(nome, cpf, numero, saldo);

   }

   @Override
   public String getDados() {
      return "CONTA CORRENTE  " + "NOME: " + getNome() + " - " + "CPF: " + getCpf() + " NÚMERO DA CONTA: " + getNumero()
            + " SALDO: " + getSaldo();
   }

}
