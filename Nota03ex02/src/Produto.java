public class Produto {
    protected String nome;
    protected int estoque;
    protected double preco;

    public void setNome(String nome){this.nome = nome;}
    public String getNome() {return nome;}

    public void setEstoque(int estoque) {this.estoque = estoque;}
    public int getEstoque() {return estoque;}

    public void setPreco(double preco) {this.preco = preco;}
    public double getPreco() {return preco;}

    public void exibir(){
        System.out.println("Nome: " + nome);
        System.out.println("Estoque: " + estoque);
        System.out.println("Preço: " + preco);
    }
    public void venda(int quantidade){
        estoque -= quantidade;
        double valor = quantidade * preco;
        System.out.println("Total R$" + valor);

    }
}
