import java.util.Scanner;

public class AppContas {
    /*
     * Deve ser utilizada pela classe App contas para adicionar, remover e listar
     * contas, além de fazer os saques e depósitos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        double saldo, limite, taxa;
        String nome, cpf, conta;

        GerenciaConta contas = new GerenciaConta();

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("|  G E R E N C I A M E N T O  D E  B A N C O  |");
            System.out.println("-----------------------------------------------");
            System.out.println("           |  B E M V I N D O   |             " );
            System.out.println("           | O QUE DESEJA FAZER?| ");
            System.out.println("-----------------------------------------------");
            System.out.println("|      1 - ADICIONAR NOVA CONTA CORRENTE      |");
            System.out.println("|      2 - ADICIONAR NOVA CONTA ESPECIAL      |");
            System.out.println("|      3 - ADICIONAR NOVA CONTA POUPANÇA      |");
            System.out.println("|      4 - REMOVER CONTA                      |");
            System.out.println("|      5 - LISTAR CONTAS                      |");
            System.out.println("|      6 - BUSCAR POR NOME                    |");
            System.out.println("|      7 - BUSCAR POR CPF                     |");
            System.out.println("|      8 - FAZER SAQUE                        |");
            System.out.println("|      9 - FAZER DEPÓSITO                     |");
            System.out.println("|     10 - TERMINAR PROGRAMA                  |");
            System.out.println("-----------------------------------------------");
            menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("Informe o nome:");
                    nome = sc.nextLine();
                    System.out.println("Informe o CPF:");
                    cpf = sc.nextLine();
                    contas.novaContaCorrente(nome, cpf);
                    break;

                case 2:
                    System.out.println("Informe o nome:");
                    nome = sc.nextLine();
                    System.out.println("Informe o CPF:");
                    cpf = sc.nextLine();
                    contas.novaContaEspecial(nome, cpf);
                    break;
               
                case 3:
                    System.out.println("Infome o nome:");
                    nome = sc.nextLine();
                    System.out.println("Infome o CPF:");
                    cpf = sc.nextLine();
                    contas.novaContaPoupanca(nome, cpf);
                    break;

                case 4:
                    System.out.println("Informe o CPF para ter a conta removida");
                    cpf = sc.nextLine();
                    break;

                case 5:
                    System.out.println(contas.listarContas());
                    break;

                case 6:
                    System.out.println("Infome seu nome:");
                    nome = sc.nextLine();
                    System.out.println(contas.buscarNome(nome));
                    //BUSCAR POR NOME 

                case 7:
                    System.out.println("Informe o seu cpf");
                    cpf = sc.nextLine();
                    System.out.println(contas.buscarCpf(cpf));
                    
                    //BUSCAR POR CPF
                  
                case 8:
                    // FAZER SAQUE
                    System.out.println("Qual o seu tipo de conta que seja fazer depósito?");
                    System.out.println("1- Conta Corrente");
                    System.out.println("2- Conta Especial");
                    System.out.println("3- Conta Poupança");
                    break;
                case 9:
                      // FAZER DEPOSITO
                      System.out.println();
                      break;
                
                case 10:
                     System.out.println();
                    break;
                // TERMINAR PROGRAMA

                case 11:
                System.err.println("Opção inválida");
                break;

            }

        } while (menu != 10);
        sc.close();

    }
}
