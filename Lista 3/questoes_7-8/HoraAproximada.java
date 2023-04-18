public class HoraAproximada {
    private int horas;
    private int minutos;


    public HoraAproximada()
    {
        this.horas = 0;
        this.minutos = 0;
    }

    public HoraAproximada(int horas, int minutos) {
        if(isHoraAproximadaValida(horas, minutos)){
            this.horas = horas;
            this.minutos = minutos; 
        }else{
            this.horas = 0;
            this.minutos = 0;
        }
        
    }

    public void incrementaMinutos(int minutos){//pode receber numeros negativos pra um decremento
        int aux;
        if(getMinutos() + minutos >= 60){
            aux = (int)Math.floor((getMinutos() + minutos)/60); 
            incrementaHoras(aux);
            setMinutos((getMinutos() + minutos) - (aux * 60)); 
        }
        else if(getMinutos() + minutos < 0){
            aux = (int)Math.floor((getMinutos() + minutos)/60);
            incrementaHoras(aux);
            setMinutos((getMinutos() + minutos) - (aux * 60));
        }
        else
            setMinutos(getMinutos() + minutos);

    }

    public void incrementaHoras(int horas){
        if((horas + getHoras()) >= 24)
            setHoras(horas + getHoras() - 24);
        else if(horas + getHoras() < 0)
            setHoras(horas + getHoras() + 24);
            else
             setHoras(horas + getHoras());
    }
    
    public boolean isHoraAproximadaValida(int horas, int minutos){
        if(horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59)
            return true;
        return false;

    }

    public void ToString(){
        System.out.println(getHoras()+":"+getMinutos());
    }
    

    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
}
