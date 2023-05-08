public class Ponto2D {
    private double x, y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto2D(double x) {
        this.x = x;
        this.y = 0;
    }

    public Ponto2D() {
        this.x = 0;
        this.y = 0;
    }

    public double distancia(Ponto2D ponto2d){ 
        return Math.sqrt(Math.pow(ponto2d.getX() - this.getX(), 2) + 
                         Math.pow(ponto2d.getY() - this.getY(),2)); 
    }

    public void imprimirPonto() {
        System.out.println("x: " + getX());
        System.out.println("y: " + getY());
    }

    public boolean isEixoY() {
        if(getY() == 0)
            return true;
        return false;
    }

    public boolean isEixoX() {
        if(getX() == 0)
            return true;
        return false;
    }

    public boolean isEixos() {
        if(getX() == 0 && getY() == 0)
            return true;
        return false;
    }
    
    public int quadrante() {    

        if(getX() > 0 && getY() > 0)
            return 1;
        else if(getX() < 0 && getY() > 0)
            return 2;
        else if(getX() < 0 && getY() < 0)
            return 3;
        else if(getX() > 0 && getY() < 0)
            return 4;

        return 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    
}
