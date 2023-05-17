import java.util.HashMap;

public class RoboSimples {
    private  String nomeDoRobo;
    private int posicaoXAtual,posicaoYAtual;
    private String direcaoAtual;

    private static final HashMap<String, Integer> direcoes = new HashMap<>();
    private HashMap<String, RoboSimples> posicoesOcupadas = new HashMap<>();
    /* Ja estava fazendo uso de Hashmaps para as posicoes ocupadas achei de bom tom
     * fazer uso dos mesmos para facilitar na validação
     */
    static {
        direcoes.put("N",1);
        direcoes.put("S",2);
        direcoes.put("E",3);
        direcoes.put("O",4);
        direcoes.put("NE",5);
        direcoes.put("NO",6);
        direcoes.put("SE",7);
        direcoes.put("SO",8);
    }


    RoboSimples(String nome, int px, int py, String d){
        nomeDoRobo = nome;
        posicaoXAtual = px;
        posicaoYAtual = py;
        direcaoAtual = d;
    }

    RoboSimples(String nome){
        this(nome, 0, 0, "N");  
    }

    RoboSimples(){
        this("Wally");
    }

    private boolean validaRobo()
    {
        if(!direcoes.containsKey(this.direcaoAtual) || this.nomeDoRobo == null)
            return false;
        return true;
    }

    public void move(){
        this.move(1);
    }

    public void move(int passos){
        int posy = posicaoYAtual;
        int posx = posicaoXAtual;

        switch(direcaoAtual) 
        {
           case "N": posy += passos; break;
           case "S": posy -= passos; break;
           case "E": posx += passos; break;
           case "O": posx -= passos; break;

           case "NE": 
            posy += passos;
            posx+= passos;
            break;

           case "NO": 
            posy += passos; 
            posx -= passos;
            break;

           case "SE": 
            posy -= passos;
            posx += passos;
            break;

           case "SO": 
            posy -= passos;
            posx -= passos;
            break;

        }

        if (!posicoesOcupadas.containsKey(posx + "," + posy))
        {
            posicoesOcupadas.remove(posicaoXAtual + "," + posicaoYAtual);
            this.posicaoXAtual = posx; this.posicaoYAtual = posy;
            posicoesOcupadas.put(posx + "," + posy, this);

        }
        else 
            System.out.println("Posicao ocupada");
            
    }

    public void mudaDireção(String novaDirecao){
        direcaoAtual = novaDirecao;
    }

    public String toString(){
        String str = "\nNome do robo: "+nomeDoRobo+"\n";
        str = str + "Posicao do robo: ("+posicaoXAtual+", "+posicaoYAtual+")\n";
        str = str + "Direcao do robo: "+direcaoAtual;

        return str;
    }

}
/*
 * Fazendo uso de um Mapa, não existe necessidade de criar outra classe, nem sequer outra função para 
 * lidar com as colisões de movimento. Para tal basta que se insira num mapa a posição de todos os robos
 * e então verificar antes de cada movimentose as coordenadas desejadas estão, ou não, ocupadas 
 * por um outro robô.
 */