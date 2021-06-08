import java.util.Scanner;

public class AppContas {
    /*
     * Deve ser utilizada pela classe App contas para adicionar, remover e listar
     * contas, além de fazer os saques e depósitos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciaConta contas = new GerenciaConta();

        int menu, numero;
        double saldo, limite, taxa;
        String nome, cpf, conta;

        do {
            System.out.println("-----------------------------------------------");
            System.out.println("|  G E R E N C I A M E N T O  D E  B A N C O  |");
            System.out.println("-----------------------------------------------");
            System.out.println("           |  B E M V I N D O   |             ");
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
                    System.out.println("INFORME O NOME:");
                    nome = sc.nextLine();
                    System.out.println("INFORME O CPF:");
                    cpf = sc.nextLine();
                    System.out.println("INFORME O NÚMERO DA CONTA:");
                    numero = Integer.parseInt(sc.nextLine());
                    System.out.println("INFORME SEU SALDO:");
                    saldo = Double.parseDouble(sc.nextLine());
                    contas.novaContaCorrente(nome, cpf, numero, saldo);
                    break;

                case 2:
                    System.out.println("INFORME O NOME:");
                    nome = sc.nextLine();
                    System.out.println("INFORME O CPF:");
                    cpf = sc.nextLine();
                    System.out.println("INFORME O NÚMERO DA CONTA:");
                    numero = Integer.parseInt(sc.nextLine());
                    System.out.println("INFORME SEU SALDO:");
                    saldo = Double.parseDouble(sc.nextLine());
                    System.out.println("INFORME O LIMITE DA CONTA");
                    limite = Double.parseDouble(sc.nextLine());
                    contas.novaContaEspecial(nome, cpf, numero, saldo, limite);
                    break;

                case 3:
                    System.out.println("INFORME O NOME:");
                    nome = sc.nextLine();
                    System.out.println("INFORME O CPF:");
                    cpf = sc.nextLine();
                    System.out.println("INFORME O NÚMERO DA CONTA:");
                    numero = Integer.parseInt(sc.nextLine());
                    System.out.println("INFORME SEU SALDO:");
                    saldo = Double.parseDouble(sc.nextLine());
                    contas.novaContaPoupanca(nome, cpf, numero, saldo);
                    break;

                case 4:
                    System.out.println("INFORME O CPF PARA TER A CONTA REMOVIDA");
                    cpf = sc.nextLine();
                    System.out.println(contas.remove(cpf));
                    break;

                case 5:
                    System.out.println(contas.listarContas());
                    break;

                case 6:
                    System.out.println("INFORME O NOME A SER PESQUISADO:");
                    nome = sc.nextLine();
                    System.out.println(contas.buscarNome(nome));
                    break;
                // BUSCAR POR NOME

                case 7:
                    System.out.println("INFORME O CPF A SER PESQUISADO:");
                    cpf = sc.nextLine();
                    System.out.println(contas.buscarCpf(cpf));
                    break;
                // BUSCAR POR CPF
                case 8:
                    // FAZER SAQUE
                    System.out.println("QUAL TIPO DE CONTA DESEJA FAZER O SAQUE?");
                    System.out.println("1 - CONTA CORRENTE");
                    // permite fazer saques somente se houver saldo suficiente
                    System.out.println("2 - CONTA ESPECIAL");
                    // possui um limite que permite fazer saques se o saldo mais o limite da conta
                    // cobrir o valor pretendido de saque
                    System.out.println("3 - CONTA POUPANÇA");
                    // realiza saque se houver saldo, mas há uma taxa por operação.
                    break;

                case 9:
                    // FAZER DEPOSITO
                    break;

                case 10:
                    System.out.println();
                    break;

                case 11:
                    System.err.println("OPÇÃO INVÁLIDA!");
                    break;

            }

        } while (menu != 10);
        sc.close();

    }
}
