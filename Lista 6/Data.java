public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data() {
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }

    public Data(Data objData)
    {
        this.dia = objData.getDia();
        this.mes = objData.getMes();
        this.ano = objData.getAno();
    }

 
    public void inicializarData(int dia, int mes, int ano) {
        if(verificarData(dia, mes, ano)){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;

    
        }else{
            this.dia = 1;
            this.mes = 1;
            this.ano = 1970;
   
        }
    }

/////////////////////////////////////////////////////////////////////////////////////////////////////////
    public long toSeconds() {
        int[] diasPorMes = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        long segundosPorDia = 24 * 60 * 60;
        long segundos = 0;
    
        for (int anoAnterior = 1970; anoAnterior < this.ano; anoAnterior++) {
            segundos += (ehAnoBissexto(anoAnterior) ? 366 : 365) * segundosPorDia;
        }
    
        for (int mesAnterior = 1; mesAnterior < this.mes; mesAnterior++) {
            segundos += diasPorMes[mesAnterior - 1] * segundosPorDia;
            if (mesAnterior == 2 && ehAnoBissexto(this.ano)) {
                segundos += segundosPorDia;
            }
        }

        segundos += (this.dia - 1) * segundosPorDia;
    
        return segundos;
    }


    public boolean isPrevious(Data outraData) {
        return this.toSeconds() < outraData.toSeconds();
    }

    public int howManyDays(Data outraData) {
        return (int) ((this.toSeconds() - outraData.toSeconds())/86400); 
    }

    //possivel memory leak??
    public int howManyDays(int dia, int mes, int ano)
    {   
        Data outraData = new Data(dia, mes, ano);
        return this.howManyDays(outraData);
    }


    //Para ser bem sincero entendi bem mais ou menos o funcionamento desse algoritmo de Zeller
    //mas semana de prova, depois paro p entender direito como funciona
    public String dayOfWeek() {  
        int dia = this.getDia();
        int mes = this.getMes();
        int ano = this.getAno();
        String[] diasDaSemana = new String[]{"Sábado", "Domingo", "Segunda-feira", 
                                             "Terça-feira", "Quarta-feira", 
                                             "Quinta-feira", "Sexta-feira"};

        if (mes < 3) {
            mes += 12;
            ano--;
        }
    
        int k = ano % 100;
        int j = ano / 100;
        int h = (dia + 13*(mes+1)/5 + k + k/4 + j/4 + 5*j) % 7;
        
        return diasDaSemana[h];
    }
    
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////

    private String MesExtenso(int mes) {
        String[] meses = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
    "Julho", "Agosto", "Setembro","Outubro", "Novembro", "Dezembro"};
        return meses[mes - 1];
    }


    private boolean ehAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0;
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
 
/////////////////////////////////////////////////////////////////////////////////////////////////////////

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

/////////////////////////////////////////////////////////////////////////////////////////////////////////

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

    public void setData(Data objData)
    {
        this.dia = objData.getDia();
        this.mes = objData.getMes();
        this.ano = objData.getAno();
    }

    public void setData(int dia, int mes, int ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

}