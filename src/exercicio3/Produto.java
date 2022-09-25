package exercicio3;

public class Produto {

    protected String nome;
    protected double preco;

    public Produto(){
    }
    public Produto(String nome, double preco) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double calcular(int quantidadeDeProdutos){
        return preco * quantidadeDeProdutos;
    }
    @Override
    public String toString(){
        return "ana";
    }

}
