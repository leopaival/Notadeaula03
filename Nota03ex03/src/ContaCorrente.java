public class ContaCorrente extends Conta{
    protected double cheque = 1000;
    public void chequeEsp(double valor){
        cheque -= valor;
        System.out.println("Saque feito de R$" + valor + ". Restam R$" + cheque + " disponíveis no Cheque Especial");
    }

    public void dadosCorrente(){
        super.dados();
        System.out.println("Cheque Especial: " + cheque);
    }
}
