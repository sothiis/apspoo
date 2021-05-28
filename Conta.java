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

  public Conta(String nome, String cpf, int numero, double saldo) {
    this.nome = nome;
    this.cpf = cpf;
    this.numero = numero;
    this.saldo = saldo;
  }

public boolean depositar (double valores){
    return true;
  }

  public boolean sacar (double valores){
    return true;
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

  public abstract String getDados();

}
