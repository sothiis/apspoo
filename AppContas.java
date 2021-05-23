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
        String contaCorrente, contaEspecial, contaPoupança;

        GerenciaConta contas = new GerenciaConta();

        do {
            System.out.println("1-Adicionar nova conta corrente");
            System.out.println("2-Adicionar nova conta especial");
            System.out.println("3-Adicionar nova conta poupança");
            System.out.println("4-Remover conta");
            System.out.println("5-Listar contas");
            System.out.println("6-Fazer saque");
            System.out.println("7-Fazer depósito");
            System.out.println("8-Terminar programa");
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
                    System.out.println("Qual o seu tipo de conta que seja fazer depósito?");
                    System.out.println("1- Conta Corrente");
                    System.out.println("2- Conta Especial");
                    System.out.println("3- Conta Poupança");

                    break;
                    // FAZER SAQUE

                case 7:
                    // FAZER DEPOSITO
                    System.out.println();
                    break;
                case 8:
                    System.out.println();
                    break;
                 // TERMINAR PROGRAMA

                case 9:
                    System.err.println("Opção inválida");
                    break;

            }

        } while (menu != 9);
        sc.close();

    }
}
