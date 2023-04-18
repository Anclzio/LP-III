public class HoraPrecisa extends HoraAproximada{
    private int centesimos;
    private int segundos;


    public HoraPrecisa(int horas, int minutos, int segundos, int centesimos){
        super(horas, minutos);
        this.centesimos = centesimos;
        this.segundos = segundos;
    }

    public HoraPrecisa(){
        super();
        this.segundos = 0;
        this.centesimos = 0;
    }

    public void incrementaSegundos(int segundos){//pode receber numeros negativos pra um decremento
        int aux;
        if(getSegundos() + segundos >= 60){
            aux = (int)Math.floor((getSegundos() + segundos)/60); 
            incrementaMinutos(aux);
            setSegundos((getSegundos() + segundos) - (aux * 60)); 
        }
        else if(getSegundos() + segundos < 0){
            aux = (int)Math.floor((getSegundos() + segundos)/60);
            incrementaMinutos(aux);
            setSegundos((getSegundos() + segundos) - (aux * 60));
        }
        else
            setSegundos(getSegundos() + segundos);

    }


    public int getCentesimos() {
        return centesimos;
    }

    public void setCentesimos(int centesimos) {
        this.centesimos = centesimos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

}
