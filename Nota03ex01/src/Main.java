import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in); //para string
        Scanner sc2 = new Scanner(System.in); //para int

        Funcionario f = new Funcionario();
        Gerente g = new Gerente();
        Diretor d = new Diretor();
        String r;
        do {
            System.out.println("O que você deseja cadastrar? \n" +
                    "Se quiser cadastrar um Gerente digite 1 \n" +
                    "Se quiser cadastrar um Diretor digite 2 \n" +
                    "Sua opção: ");
            int x = sc2.nextInt();
            switch (x){
                case 1:
                    System.out.println("Bem vindo a area do Gerente");
                    System.out.println("Digite seu nome: ");
                    g.setNome(sc1.nextLine());
                    System.out.println("Qual o seu salário para calcular o seu bonus?");
                    g.setSalario(sc2.nextDouble());
                    System.out.println("Qual departamento você faz parte: ");
                    g.setDepartamento(sc1.nextLine());
                    System.out.println("Seu nome é "+g.getNome());
                    System.out.println("Seu salario é de R$" +g.getSalario());
                    System.out.println("Seu departamento é o de: "+g.getDepartamento());
                    System.out.println("Seu bonus é de R$"+g.calcularBonus());
                    break;
                case 2:
                    System.out.println("Bem vindo a area do Diretor");
                    System.out.println("Digite seu nome: ");
                    d.setNome(sc1.nextLine());
                    System.out.println("Digite seu salário: ");
                    d.setSalario(sc2.nextDouble());
                    System.out.println("Digite sua posição (quantidade de ações) como acionista da empresa");
                    d.setAcoes(sc2.nextInt());
                    System.out.println("Seu nome é "+d.getNome());
                    System.out.println("Seu salario é de R$" +d.getSalario());
                    System.out.println("Sua quantidade de ações é de: "+d.getAcoes());
                default:
                    System.out.println("Opção inválida");


            }
            System.out.println("Deseja cadastrar mais alguma opção? S / N ");
            System.out.println("O que você deseja cadastrar? \n" +
                    "Se quiser cadastrar um Gerente digite 1 \n" +
                    "Se quiser cadastrar um Diretor digite 2 \n" +
                    "Sua opção: ");
            r = sc1.nextLine();
        }while(r.equalsIgnoreCase("S"));
    }
}