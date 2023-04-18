public class LampadaDimmer extends LampadaTresEstados{
    private int valorDimmer;

    public int getValorDimmer() {
        return valorDimmer;
    }

    public void setValorDimmer(int valorDimmer) {
        this.valorDimmer = valorDimmer;
    }

    public void acende()
    {
        if( getValorDimmer() > 0 && getValorDimmer() < 100)
            super.acendeMeiaLuz();
        else if(getValorDimmer() == 0)
            setEstado(false);
            else if(getValorDimmer() == 100)
                setEstado(true);           
        
    }

    public void acendeMeiaLuz()
    {
        acende();
    }

}
