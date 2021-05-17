import java.util.Scanner;

public class AppContas {
    /*
     * Deve ser utilizada pela classe App contas para adicionar, remover e listar
     * contas, além de fazer os saques e depósitos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu;
        String nome, cpf, conta;

        do {
            System.out.println("1-Adicionar nova conta");
            System.out.println("2-Remover conta");
            System.out.println("3-Listar contas");
            System.out.println("4-Fazer saque");
            System.out.println("5-Fazer depósito");
            System.out.println("6-Terminar programa");
            menu = Integer.parseInt(sc.nextLine());

            switch (menu) {
                case 1:
                    System.out.println("Informe o nome:");
                    nome = sc.nextLine();
                    System.out.println("Informe o CPF:");
                    cpf = sc.nextLine();
                    System.out.println("Informe o tipo de conta desejada:");
                    conta = sc.nextLine();
                    break;

                case 2:
                    System.out.println("Informe o CPF para ter a conta removida");
                    cpf = sc.nextLine();
                    break;

                case 3:
                    System.out.println("");
                    break;

                case 4:
                    System.out.println("");
                    break;

                case 5:
                    System.out.println("");
                    break;

                case 6:
                    System.err.println("Opção inválida");
                    break;

            }

        } while (menu != 6);
        sc.close();

    }
}
