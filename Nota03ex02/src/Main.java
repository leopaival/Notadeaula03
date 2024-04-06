import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String loop, loopC, loopV;
        int acao;
        Televisao tv = new Televisao();
        Smartphone smart = new Smartphone();
        do {
            loop = "s";
            System.out.println("Para Cadastro de produto digite 1, para Venda digite 2: ");
            acao = num.nextInt();

            switch (acao) {
                case 1: //cadastro
                    do {
                        loopC = "s";
                        System.out.println("Tipo de produto: digite t para Televisão ou s para Smartphone");
                        String p = str.nextLine();

                        switch (p.toLowerCase()) {
                            case "t":

                                System.out.println("Nome do produto: ");
                                tv.setNome(str.nextLine());
                                System.out.println("Quantidade em estoque: ");
                                tv.setEstoque(num.nextInt());
                                System.out.println("Preço: ");
                                tv.setPreco(num.nextDouble());
                                tv.exibir();

                                System.out.println("Cadastrar outro produto? s/n");
                                loopC = str.nextLine();
                                break;

                            case "s":

                                System.out.println("Nome do produto: ");
                                smart.setNome(str.nextLine());
                                System.out.println("Quantidade em estoque: ");
                                smart.setEstoque(num.nextInt());
                                System.out.println("Preço: ");
                                smart.setPreco(num.nextDouble());
                                smart.exibir();
                                System.out.println("Cadastrar outro produto? s/n");
                                loopC = str.nextLine();
                                break;
                            default:
                                System.out.println("Tipo de produto: digite t para Televisão ou s para Smartphone");
                                p = str.nextLine();
                                break;
                        }
                    } while (loopC.equalsIgnoreCase("s"));
                    System.out.println("Realizar outra ação? s/n");
                    loop = str.nextLine();
                    break;
                case 2:
                    do {
                        loopV = "s";
                        //venda
                        System.out.println("Venda");
                        System.out.println("Tipo de produto: digite t para Televisão ou s para Smartphone");
                        String v = str.nextLine();
                        switch (v.toLowerCase()) {
                            case "t":
                                System.out.println("Quantidade vendida: ");
                                tv.venda(num.nextInt());
                                System.out.println("Vender outro produto? s/n");
                                loopV = str.nextLine();
                                break;
                            case "s":
                                System.out.println("Quantidade vendida: ");
                                smart.venda(num.nextInt());
                                System.out.println("Vender outro produto? s/n");
                                loopV = str.nextLine();
                                break;
                            default:
                                System.out.println("Tipo de produto: digite t para Televisão ou s para Smartphone");
                                v = str.nextLine();
                                break;
                        }
                    } while (loopV.equalsIgnoreCase("s"));
                    System.out.println("Realizar outra ação? s/n");
                    loop = str.nextLine();
                    break;
                default:
                    System.out.println("Para Cadastro de produto digite 1, para Venda digite 2: ");
                    acao = num.nextInt();
                    break;
            }
        } while (loop.equalsIgnoreCase("s"));
    }
}