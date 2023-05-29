public class Ponto2dUtil {

    public static float distancia(Ponto2D ponto1, Ponto2D ponto2){ 
        return (float) Math.sqrt(Math.pow(ponto2.getX() - ponto1.getX(), 2) + 
                         Math.pow(ponto2.getY() - ponto1.getY(),2)); 
    }

    public static float distancia(Ponto2D ponto){ 

        return (float) Math.sqrt(Math.pow(ponto.getX(), 2) + Math.pow(ponto.getY(),2)); 
    }

    public static int quadrante(Ponto2D ponto) {    

        if(ponto.getX() > 0 && ponto.getY() > 0)
            return 1;
        else if(ponto.getX() < 0 && ponto.getY() > 0)
            return 2;
        else if(ponto.getX() < 0 && ponto.getY() < 0)
            return 3;
        else if(ponto.getX() > 0 && ponto.getY() < 0)
            return 4;

        return 0;
    }
}
