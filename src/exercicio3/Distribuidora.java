package exercicio3;

public class Distribuidora {
    public static void main(String[] args) {
        Pereciveis[] pereciveis = new Pereciveis[5];
        pereciveis[0] = new Pereciveis("leite", 10.0, 3);
        pereciveis[1] = new Pereciveis("arroz", 30.0, 30);
        pereciveis[2] = new Pereciveis("feijao", 9.00, 10);
        pereciveis[3] = new Pereciveis("fruta", 2.00, 1);
        pereciveis[4] = new Pereciveis("tomate", 2.50, 2);

        for (int i = 0; i < pereciveis.length; i++) {
            System.out.println((pereciveis[i]));
            System.out.println(pereciveis[i].calcular(5));
        }

        NaoPereciveis[] naopereciveis = new NaoPereciveis[5];
        naopereciveis[0] = new NaoPereciveis("macarrao", 5.00, "comida");
        naopereciveis[1] = new NaoPereciveis("bolacha", 2.00, "guloseimas");
        naopereciveis[2] = new NaoPereciveis("sabao", 15.00, "higiene");
        naopereciveis[3] = new NaoPereciveis("creme", 20.00, "higiene");
        naopereciveis[4] = new NaoPereciveis("pipoca", 5.00, "guloseimas");


        System.out.println(naopereciveis[0]);
        System.out.println(naopereciveis[1]);
        System.out.println(naopereciveis[2]);
        System.out.println(naopereciveis[3]);
        System.out.println(naopereciveis[4]);

    }
}

