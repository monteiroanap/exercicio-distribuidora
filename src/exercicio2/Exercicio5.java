package exercicio2;

public class Exercicio5 {
    //Exceções
    // exception = da pra gerenciar o erro -
    // error: nao é possivel gerenciar - não é possivel lidar com esse erro
        public static void main(String[] args) {
        int vetor[] = new int [3];

        try{
            for(int i =0; i <3; i++){
                System.out.println(vetor[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("erro: indice fora do limite");
            System.out.println(ex.getMessage());
        } catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally { //sempre sera executado independente se deu tudo certo ou nao.
            System.out.println("finalizando as conexões...");
        }
        System.out.println("fim do programa");
    }
}
