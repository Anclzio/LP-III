public class Circulo {
    double x, y, raio;
    final static double PI = 3.14159265;

    public Circulo(double x, double y, double raio) {
        this.x = x;
        this.y = y;
        this.raio = raio;
    }
    
    public Circulo(double raio) {
        this.x = 0;
        this.y = 0;
        this.raio = raio;
    }
    
    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.raio = 0;
    }

    private boolean validaCirculo() {
        return this.getRaio() > 0;  
    }

    public boolean isInnerPoint(Ponto2D ponto) {
        Ponto2D ponto2d = new Ponto2D(this.getX(), this.getY());

        return ponto2d.distancia(ponto) < raio;
    }

    public double area() {
      return PI * this.getRaio() * this.getRaio();
    }
    
    public double perimetro() {
        return this.getRaio() * 2 * PI;
    }

    public boolean isBiggerThan(Circulo circulo) {
        return this.area() > circulo.area();
    }


    public void imprimirCirculo() {
        System.out.println("x: " + getX());
        System.out.println("y: " + getY());
        System.out.println("raio: " + getRaio());

    }



    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    

    
}
