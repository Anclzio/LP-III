public class Livro{
    private int anoDePublicação;
    private String autor;
    private String nome;
    private String editora;

    public Livro() {

        this.anoDePublicação = 0;
        this.autor = null;
        this.nome = null;
        this.editora = null;

    }
    public Livro(int anoDePublicação, String autor, String nome, String editora) {
        this.anoDePublicação = anoDePublicação;
        this.autor = autor;
        this.nome = nome;
        this.editora = editora;
    }

    public void ToString() {
        System.out.println("Nome do livro: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Ano de publicação " + anoDePublicação);
    }

    public int getAnoDePublicação() {
        return anoDePublicação;
    }
    public void setAnoDePublicação(int anoDePublicação) {
        this.anoDePublicação = anoDePublicação;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
}
