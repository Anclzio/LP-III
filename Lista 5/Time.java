
public class Time {
    private int value;

    private boolean validateTime(int timeValue){
        return ((timeValue>0) && (timeValue<86401));//SegundosEmUmDia = 24*60*60 = 86400 
    }

    private int TimeToSeconds(int hora, int min, int sec){
        return hora*3600 + min*60 + sec;
    }

    public Time()
    {
        this.value = 0;
    }

    public boolean isAm()
    {
        if(this.getTimeInSeconds() <= 43200)
            return true;
        return false;
            
    }

    public int cron(Time outraHora){
        if(outraHora.getTimeInSeconds()> this.getTimeInSeconds())
            return this.getTimeInSeconds() - outraHora.getTimeInSeconds(); 
        return 86400 - this.getTimeInSeconds() + outraHora.getTimeInSeconds();

    }   

    public void addSeconds(int secs){
      if((this.getTimeInSeconds() + secs) < 86401)
            this.value += secs;
        else 
            this.value += secs - 86400;
    }

    public Time(int horaEmSegundos)
    {
        this.value = horaEmSegundos;
    }

    public Time(int hora, int min, int sec)
    {
        this.value = TimeToSeconds(hora, min, sec);
    }

    private String SecondsToTime(){
        String result = "";
        int hora;
        int min;
        int sec;

        hora = value/3600;
        min = (value % 3600)/60;
        sec = (value % 3600)%60;

        result = Integer.toString(hora) + ":"
               + Integer.toString(min) + ":"
               + Integer.toString(sec);

        return result;
    }

    public void setTime(int hora, int min, int seg){
        int value = this.TimeToSeconds(hora, min, seg);
        if (validateTime(value)) {
            this.value = value;
        }
        else{
            this.value = 0;
        }
    }

    public String getTime(){
        String res = SecondsToTime();
        return res;
    }

    public void prnTime(){
        System.out.println(getTime());
    }

    public int getTimeInSeconds(){
        return this.value;
    }
}