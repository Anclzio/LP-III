import Ponto2D;

public class Retangulo {
    private Ponto2D ponto1;
    private Ponto2D ponto2;
    
    public Retangulo(Ponto2D ponto1, Ponto2D ponto2) {
        this.ponto1 = ponto1;
        this.ponto2 = ponto2;
    }
    
    public double calcularArea() {
        double base = Math.abs(ponto2.getX() - ponto1.getX());
        double altura = Math.abs(ponto2.getY() - ponto1.getY());
        return base * altura;
    }
    
    public double calcularPerimetro() {
        double base = Math.abs(ponto2.getX() - ponto1.getX());
        double altura = Math.abs(ponto2.getY() - ponto1.getY());
        return 2 * (base + altura);
    }
    
    public boolean isPontoDentro(Ponto2D ponto) {
        double minX = Math.min(ponto1.getX(), ponto2.getX());
        double maxX = Math.max(ponto1.getX(), ponto2.getX());
        double minY = Math.min(ponto1.getY(), ponto2.getY());
        double maxY = Math.max(ponto1.getY(), ponto2.getY());
        
        return ponto.getX() >= minX && ponto.getX() <= maxX &&
               ponto.getY() >= minY && ponto.getY() <= maxY;
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

