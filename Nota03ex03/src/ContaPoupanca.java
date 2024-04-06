public class ContaPoupanca extends Conta {
    protected double selic, rendimento;

    public double getSelic() {
        return selic;
    }

    public void setSelic(double selic) {
        this.selic = selic;
    }

    public void calcRend() {
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        System.out.println("Sua conta está com rendimento de R$" + rendimento + " ao mês");
    }

    public void dadosPoupanca() {
        super.dados();
        System.out.println("Rendimento: R$" + rendimento + " ao mês");
    }
}
