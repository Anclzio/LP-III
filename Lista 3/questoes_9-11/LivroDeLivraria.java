public class LivroDeLivraria extends Livro{
    double preco;

    public LivroDeLivraria() {
        super();
        this.preco = 0;
    }

    public LivroDeLivraria(int anoDePublicação, String autor, String nome, String editora, double preco) {
        super(anoDePublicação, autor, nome, editora);
        if(preco > 0)
            this.preco = preco;
        else 
            this.preco = 0;
    }

    public void ToString() {
        super.toString();
        System.out.println("Preço: R$" + getPreco());
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
