import java.util.Collections;
import java.util.LinkedList;

public class Baralho 
{
  //Colecao Linked List de Cartas
  private final  LinkedList<Carta> baralhoCartas; 
  //Quantidade de Cartas no Baralho
  private int numeroCartas; 
  
  public Baralho()
  {
      // Construtor do Baralho
      baralhoCartas = new LinkedList<>();
      numeroCartas = 0;
      
      // Gera o baralho contendo todos os simbolos e naipes
      for(int j = 0; j < 4; j++)
      {
         for(int k = 1; k <= 13; k++)
         {
             // Adiciona a nova Carta ao Baralho
             this.baralhoCartas.add(new Carta(k,j));
         }
         
        // Soma a quantidade de Cartas  
        numeroCartas++ ; 
      }           
  }
  
  public void embaralhar()
  {
      // A classe colecao possui funcao de embaralhar os intens contidos na Linked List
      Collections.shuffle(this.baralhoCartas);
  }
  
  public int getNumeroCartas()
  {
      // Retorna a quantidade de cartas no Baralho
      return numeroCartas;
  }
  
  public void imprimirBaralho()
  {
      // FOR para percorrer a Linked List
      for( Carta c : baralhoCartas)
      {  
          // Imprime cada Carta do Baralho
          System.out.println(c.imprimeCarta());
      }  
  }
   
  public Carta distribuiCarta()
  {
      // Retira uma carta da Linked List
      return baralhoCartas.pop();
  }
}