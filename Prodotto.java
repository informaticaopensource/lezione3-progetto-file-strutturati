import java.io.*;
public class Prodotto implements Serializable
{
      
private String codice;
      private String descrizione;
      private float prezzo;
      private int quantity;
    /**
     * Costruttore degli oggetti di classe  Prodotto
     */
    public Prodotto(String _a, String _b, float _p,int _q)
    {
      codice=_a;
      descrizione =_b;
      prezzo = _p;
      quantity =_q;
    }
public String getCodice()
{
    return codice;
}
public String getDesc ()
{
    return descrizione;
}
public float getPrezzo (){
    return prezzo;
}
public int getQuantity()
{
    return quantity;
}
public String toString()
{
    return "Codice:"+codice+"\nDescrizione:"+descrizione+"\nPrezzo:"
    +prezzo+"\nQuantità:"+quantity+"\n";
}
}
