public class Lampada{
    private double preco;
    private int potencia;
    private boolean funcionamento;
    protected boolean estado;

    public Lampada(double preco, int potencia, boolean funcionamento, boolean estado) {
        this.preco = preco;
        this.potencia = potencia;
        this.funcionamento = funcionamento;
        this.estado = estado;
    }

    public Lampada() {
        this.preco = 0;
        this.potencia = 0;
        this.funcionamento = false;
        this.estado = false;
    }

    private boolean getFuncionamento() {
        return funcionamento;
    }

    public void setFuncionamento(boolean funcionamento) {
        this.funcionamento = funcionamento;
    }

    public void setPreco(double novoPreco) {
        preco = novoPreco;
    }
    
    public double getPreco() {
        return preco;
    }   
    
    public void setPotencia(int novaPotencia) {
        this.potencia = novaPotencia;
    }
    
    public int getPotencia() {
        return potencia;
    }

    
    protected void setEstado(boolean estado)
    {
        this.estado = estado;
    }
    
    protected boolean getEstado()
    {
        return estado;
    }
    
    public void isLigado()
    {
       String message = (getEstado()) ? "A lampada está Ligada" : "A lampada não está ligada";
       System.out.println(message);
    }

    public void testa_lampada()
    {
        String mensagem = (getFuncionamento()) ? "A lampada está funcionando" : "A lampada apresenta defeitos";
        System.out.println(mensagem);
    }   

    public void acende()
    {
        setEstado(true);
    }

    public void apaga()
    {
        setEstado(false);
    }
    
}