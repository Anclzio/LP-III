public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public void inicializarData(int dia, int mes, int ano) {
        if(verificarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;

    
        }else{
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
   
        }
    }

    private String MesExtenso(int mes) {
        String[] meses = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
    "Julho", "Agosto", "Setembro","Outubro", "Novembro", "Dezembro"};
        return meses[mes - 1];
    }

    private boolean verificarData(int dia, int mes, int ano){
        
        if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1)
            return false;
    
        int numDias = 31;
    
        if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)
                numDias = 29;
            else
                numDias = 28;       
        } 
        else if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
            numDias = 30;               
            
        if (dia > numDias) 
            return false;

        return true;
    }
    
    public void imprimirData()
    {
        System.out.println(getDia()+"/" + getMes() + "/" + getAno());
    }

    public void imprimirDataExtenso()
    {
        System.out.println(getDia()+" de " + MesExtenso(getMes()) + " de " + getAno());
    }

    public String toString() {
        return getDia()+"/" + getMes() + "/" + getAno();
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}