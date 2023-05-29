public class Main{
    public static void main(String[] args) {

        Ponto2D ponto = new Ponto2D(-2, 8);
        Ponto2D ponto2 = new Ponto2D(12, 1);

        System.out.println(Ponto2dUtil.distancia(ponto));

        System.out.println(Ponto2dUtil.distancia(ponto, ponto2));

        System.out.println(Ponto2dUtil.quadrante(ponto2));
    }
}