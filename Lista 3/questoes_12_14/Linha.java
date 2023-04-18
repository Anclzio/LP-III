package questoes_12_14;
import Ponto2D;

public class Linha {
    private Ponto2D ponto1;
    private Ponto2D ponto2;
    
    public Linha(Ponto2D ponto1, Ponto2D ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }
    
    public double comprimento() {
        double dx = ponto2.getX() - ponto1.getX();
        double dy = ponto2.getY() - ponto1.getY();
        return Math.sqrt(dx*dx + dy*dy);
    }

    public Ponto2D getPonto1() {
        return ponto1;
    }
    
    public void setPonto1(Ponto2D ponto1) {
        this.ponto1 = ponto1;
    }
    
    public Ponto2D getPonto2() {
        return ponto2;
    }
    
    public void setPonto2(Ponto2D ponto2) {
        this.ponto2 = ponto2;
    }
}