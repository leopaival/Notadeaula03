import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in); //numero
        Scanner sc2 = new Scanner(System.in); //string

        String repetir;
        System.out.println("Qual Opção você deseja acessar? ");
        System.out.print("Para Conta Corrente digite 1\n" +
                "Para Conta Poupança digite 2\n" +
                "Sua Opção: ");
        int opcaoConta = sc1.nextInt();

        switch (opcaoConta) {
            case 1:
                repetir = "s";
                ContaCorrente c1 = new ContaCorrente();
                System.out.println("Digite seu nome completo:");
                c1.setNome(sc2.nextLine());
                do {
                    System.out.println("Digite o número indicado para realizar uma ação:");
                    System.out.println("Depositar (1), Sacar (2), Cheque Especial (3), Dados da conta (4)");
                    int opcaoCorrente = sc1.nextInt();
                    switch (opcaoCorrente) {
                        case 1:
                            System.out.println("Qual valor deseja depositar? ");
                            c1.depositar(sc1.nextDouble());
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = sc2.nextLine();
                            break;
                        case 2:
                            System.out.println("Qual valor deseja sacar? ");
                            c1.sacar(sc1.nextDouble());
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = sc2.nextLine();
                            break;
                        case 3:
                            System.out.println("Quanto deseja sacar do Cheque Especial?");
                            c1.chequeEsp(sc1.nextDouble());
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = sc2.nextLine();
                            break;
                        case 4:
                            c1.dadosCorrente();
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = sc2.nextLine();
                            break;

                    }
                } while (repetir.equalsIgnoreCase("s"));
                break;

            case 2:
                repetir = "s";
                ContaPoupanca p1 = new ContaPoupanca();
                System.out.println("Digite seu nome completo:");
                p1.setNome(sc2.nextLine());
                do {
                    System.out.println("Digite o número indicado para realizar uma ação:");
                    System.out.println("Depositar (1), Sacar (2), Informes de Rendimento (3), Dados da conta (4)");
                    int opcaoPoupanca = sc1.nextInt();
                    switch (opcaoPoupanca) {
                        case 1:
                            System.out.println("Qual valor deseja depositar? ");
                            p1.depositar(sc1.nextDouble());
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = sc2.nextLine();
                            break;
                        case 2:
                            System.out.println("Qual valor deseja sacar? ");
                            p1.sacar(sc1.nextDouble());
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = sc2.nextLine();
                            break;
                        case 3:

                            p1.setSelic(11.25);
                            System.out.println("Taxa Selic " + p1.getSelic() + "%");
                            p1.calcRend();
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = sc2.nextLine();
                            break;
                        case 4:

                            p1.dadosPoupanca();
                            System.out.println("Deseja realizar outra ação? s/n");
                            repetir = sc2.nextLine();
                            break;
                    }

                } while (repetir.equalsIgnoreCase("s"));
                break;

        }
    }
}