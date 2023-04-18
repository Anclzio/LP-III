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

    public void mover(double deltaX, double deltaY) {
        x += deltaX;
        y += deltaY;
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

    
}
