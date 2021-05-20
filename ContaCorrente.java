public class ContaCorrente extends Conta {
   //A ​ContaCorrente​ permite fazer saques somente se houver saldo suficiente. 

   
   public ContaCorrente(int numero, double saldo, String nome, String cpf) {
      super (numero, saldo, nome, cpf);

  }

  @Override
  public String getDados() {
     return "Conta Poupança:" + getNome() + " - " + getNumero() + getSaldo() + getCpf();
  }


}
