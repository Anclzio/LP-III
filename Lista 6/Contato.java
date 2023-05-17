public class Contato {
    private String nome;
    private String email;
    private String telefone;
    private Data dataNascimento;

    public Contato(String nome, String email, String telefone, int dia, int mes, int ano)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        Data dataNascimento = new Data(dia, mes, ano);
        this.dataNascimento = dataNascimento;
    }

    public Contato(Contato objContato)
    {
        this.nome = objContato.nome;
        this.email = objContato.email;
        this.telefone = objContato.telefone;
        Data dataNascimento = objContato.getDataNascimento();
        this.dataNascimento = dataNascimento;
    }
    

    public void imprimirContato() {
        System.out.println("Nome: " +getNome() + " Data de nascimento: " + dataNascimento.toString());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
    }

    public int calcularIdade() {
       return 2023-dataNascimento.getAno();
    }

     public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public String getTelefone() {
        return telefone;
    }



    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }



    public Data getDataNascimento() {
        return dataNascimento;
    }



    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

}
