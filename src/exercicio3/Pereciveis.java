package exercicio3;


public class Pereciveis extends Produto{
    private int diasParaVencer;

    public Pereciveis(int diasParavencer) {
    }
    public int getDiasParaVencer(){
        return diasParaVencer;
    }
    public void setDiasParaVencer(int diasParaVencer){
        this.diasParaVencer = diasParaVencer;
    }
    @Override
    public String toString(){
        return "ana";
    }
    @Override
    public double calcular(int quantidadeDeProdutos) {
        if (this.diasParaVencer == 1) {
            return super.calcular(quantidadeDeProdutos) / 4;
        } else if (this.diasParaVencer == 2) {
            return super.calcular(quantidadeDeProdutos) / 3;
        } else {
            return super.calcular(quantidadeDeProdutos) / 2;
        }
    }
}


