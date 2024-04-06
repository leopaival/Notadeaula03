public class Conta {
    protected String nome;
    protected double saldo = 0;

    public void setNome(String nome) {this.nome = nome;}
    public void setSaldo(double saldo) {this.saldo = saldo;}
    public String getNome(){return nome;}
    public double getSaldo(){return saldo;}

    public void depositar(double deposito){
        saldo += deposito;
        setSaldo(saldo);
        System.out.println("Depósito feito de R$" + deposito + ". Saldo na conta R$" + saldo);
    }
    public void sacar(double saque){
        saldo -= saque;
        setSaldo(saldo);
        System.out.println("Saque feito de R$" + saque + ". Saldo na conta R$" + saldo);
    }
    public void dados(){
        System.out.println(getNome());
        System.out.println("Seu Saldo é de: R$" + getSaldo());
    }
}
