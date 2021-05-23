public abstract class Conta {
  //ATRIBUTOS CONTA 
  private int numero;
  private double saldo;
  private Conta conta;
  public double depositar;
  public double sacar;
  private String cliente;

  //ATRIBUTOS CLIENTE
  private String cpf;
  private String nome;

  public Conta(int numero, double saldo, String nome, String cpf) {
    this.numero = numero;
    this.saldo = saldo;
    this.nome = nome;
    this.cpf = cpf; 
  }

  public boolean depositar (double valores){
    return true;
  }

  public boolean sacar (double valores){
    return true;
  }

  public int getNumero(){
    return numero;
  }

  public int setNumero(){
    return numero;
  }

  public double getSaldo(){
    return saldo;
  }

  public double setSaldo(){
    return saldo;
  }

  public String getNome() {
    return nome;
  }

  public String setNome(){
    return nome;
  }

  public String getCpf(){
    return cpf;
  }

  public String setCpf(){
    return cpf;
  }

  public abstract String getDados();

}
