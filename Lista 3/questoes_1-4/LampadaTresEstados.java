public class LampadaTresEstados extends Lampada{

    private boolean flagMeiaLuz;

    public boolean isFlagMeiaLuz() {
        return flagMeiaLuz;
    }

    private void setFlagMeiaLuz(boolean flagMeiaLuz) {
        this.flagMeiaLuz = flagMeiaLuz;
    }

    public void acendeMeiaLuz()
    {
        setEstado(true);
        setFlagMeiaLuz(true);
    }

    public void acende()
    {
        setEstado(true);
        setFlagMeiaLuz(false);

    }

    public void apaga()
    {
        setEstado(false);
        setFlagMeiaLuz(false);
    }

    public void isLigado()
    {
        if(!getEstado())
            System.out.println("A lampada está apagada");
            else if(flagMeiaLuz)
                System.out.println("A lampada está meia luz");
                else
                    System.out.println("A lampada está acesa");
    }
    
}
