public class Carta 
{
   // codigo de cada naipe do baralho
    public final static int ESPADAS = 0;     
    public final static int COPAS = 1;
    public final static int OUROS = 2;
    public final static int PAUS = 3;
    
    // Codigo pras cartas com simbolos A, K, Q, J
    public final static int AS = 1,VALETE = 10,RAINHA = 10, REI = 10;
    
    // Valor da carta de 1 a 11
    private final int valor;
    // Naipe da carta: Espadas, Copas, Ouros, Paus
    private final int naipe;   
                                                       
    public Carta(int ValorCarta, int SimboloNaipe) 
    {
        // Construtor da carta preenchendo o valor e o naipe 
        valor = ValorCarta;
        naipe = SimboloNaipe;
    }
    
    public int getValor() 
    {
        // Retorna o valor da carta
        return valor;
    }
    
    public int getNaipe() 
    {
        //Retorna o naipe da carta    
        return naipe;
    }
      
    public String getNaipeString() 
    {
       // Retorna o naipe da carta em forma de String
       // Se o naipe for invalido retorn uma mensagem de erro
        switch ( naipe ) 
        {
           case ESPADAS:   return "Espadas";
           case COPAS:   return "Copas";
           case OUROS: return "Ouros";
           case PAUS:    return "Paus";
           default:       return "Codigo de naipe invalido!";
        }
    }
    
    public String getValorString() 
    {
       // Retorna o valor da carta como uma String
       // Se o valor da carta for invalido retorna uma mensagem de erro
        switch ( valor ) 
        {
           case 1:   return "As";
           case 2:   return "2";
           case 3:   return "3";
           case 4:   return "4";
           case 5:   return "5";
           case 6:   return "6";
           case 7:   return "7";
           case 8:   return "8";
           case 9:   return "9";
           case 10:  return "10";
           case 11:  return "Valete";
           case 12:  return "Rainha";
           case 13:  return "Rei";
           default:  return "Codigo da carta invalido!";
        }
    }
    
    public String imprimeCarta() 
    {
        // Retorna a carta na forma de String
        return getValorString() + " de " + getNaipeString();
    }
}