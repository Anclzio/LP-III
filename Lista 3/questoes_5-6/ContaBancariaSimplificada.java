public class ContaBancariaSimplificada {
    private String nomeDoCorrentista;
    private double saldo;
    private boolean isEspecial;

    protected ContaBancariaSimplificada(String nomeDoCorrentista)
    {
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = 0.0;
        this.isEspecial = false;
    }
    

    protected ContaBancariaSimplificada(String nomeDoCorrentista, double saldo)
    {
        this.nomeDoCorrentista = nomeDoCorrentista;
        if(saldo < 0)
            saldo = 0;
        this.saldo = saldo;
        this.isEspecial = false;
    }
    

    protected ContaBancariaSimplificada(String nomeDoCorrentista, double saldo, boolean isEspecial)
    {
        this.nomeDoCorrentista = nomeDoCorrentista;
        if(saldo < 0)
            saldo = 0;
        this.saldo = saldo;
        this.isEspecial = isEspecial;
    }
    
    public void deposita(double valor)
    {
        setSaldo(getSaldo() + valor);
    }
    
    public void retira(double valor)
    {
        if(!isEspecial){
            if(valor <= getSaldo())
                setSaldo(getSaldo() - valor);
            else
                System.out.println("Saldo insuficiente");
        }           
        else{
            setSaldo(getSaldo() - valor);
            if(getSaldo()<0)
                System.out.println("Cuidado seu saldo está negativo");
        }
            

    }

    public void ToString()
    {
        System.out.println("O nome do correntista é " + getNomeDoCorrentista());
        System.out.println("O saldo é " + getSaldo());
        if(isEspecial())
            System.out.println("A conta é especial");
            else
                System.out.println("Aconta é comum");

        
    }

    public String getNomeDoCorrentista() {
        return nomeDoCorrentista;
    }

    public void setNomeDoCorrentista(String nomeDoCorrentista) {
        this.nomeDoCorrentista = nomeDoCorrentista;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public boolean isEspecial() {
        return isEspecial;
    }


    public void setEspecial(boolean isEspecial) {
        this.isEspecial = isEspecial;
    }
}
