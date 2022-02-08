import java.util.LinkedList;

public class Mao 
{
    // Container LinkedList contendo as cartas da mao do jogador
    private LinkedList<Carta> mao;
    // Acumula o valor da mao do jogador
    private int valorMao;
    // Conta quantas cartas ha na mao do jogador
    private int contador;
    
    public Mao()
    {
        // Construtor da mao do jogador
        // Cria uma Linked List  
        mao = new LinkedList<>();
        // Inicializa com zero o valor da mao
        valorMao = 0;
        // Inicializa com zero a quantidade de cartas
        contador = 0;     
    }
     
    public void adicionaCarta (Carta c)
    {
        // Acidiona uma carta ao Linked List
        this.mao.add(c);
        // Soma o valor da carta ao valor total da mao
        valorMao += c.getValor();
        // Incrementa a quantidade de cartas
        contador++;
    }
    
    public Carta ultimaCarta()
    {
        // Funcao do Container Linked List que retorna o ultimo item
        return mao.getLast();
    }
    
    public int getValorMao()
    {
        // Retorna o valor da mao do jogador
        return valorMao;
    }
    
    public int getNumeroCartas()
    {
        // Retorna a quantidade de cartas na mao do jogador
        return contador;
    }    
}
