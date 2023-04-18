public class LivroDeBiblioteca extends Livro{
    private boolean disponivel;
    private String nomeDoComodatario;
    private int diasAteEntrega;

    public LivroDeBiblioteca() {
    }

    public LivroDeBiblioteca(int anoDePublicação, String autor, String nome, String editora, 
        boolean disponivel,String nomeDoComodatario, int diasAteEntrega) {
        super(anoDePublicação, autor, nome, editora);
        this.disponivel = disponivel;
        this.nomeDoComodatario = nomeDoComodatario;
        this.diasAteEntrega = diasAteEntrega;
        
    }

    public void emprestaLivro(String nome, int tempoDeEmprestimo) {
        if(isDisponivel()){
            setNomeDoComodatario(nome);
            setDiasAteEntrega(tempoDeEmprestimo);
            setDisponivel(false);
            System.out.println("Voce tem "+ tempoDeEmprestimo + " dias para devolver o livro");
        }
        else
            System.out.println("Esse livro não está disponivel para emprestimo");

    }

    public void devolveLivro() {
        if(!isDisponivel()){
            setNomeDoComodatario(null);
            setDiasAteEntrega(0);
            setDisponivel(true);
            System.out.println("Você devolveu o livro com sucesso!");
        }
        else
            System.out.println("Esse livro não foi emprestado");

    }

    public void ToString(){
        super.ToString();
        if(isDisponivel())
            System.out.println("Disponivel para emprestimo!");
        else
            System.out.println("Fim do emprestimo em: "+ getDiasAteEntrega() + " dias");
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getNomeDoComodatario() {
        return nomeDoComodatario;
    }

    public void setNomeDoComodatario(String nomeDoComodatario) {
        this.nomeDoComodatario = nomeDoComodatario;
    }

    public int getDiasAteEntrega() {
        return diasAteEntrega;
    }

    public void setDiasAteEntrega(int diasAteEntrega) {
        this.diasAteEntrega = diasAteEntrega;
    }
}
