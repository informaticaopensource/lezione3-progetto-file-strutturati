import java.io.*;
import java.util.Scanner;
/**
 * Aggiungi qui una descrizione della classe Test
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Test
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner (System.in);
      System.out.println("\n Esempio di uso di ArrayList in java");
      System.out.println("\n il progrmma ti chiede di inserire un elenco di prodotti\n");
      Merce m = new Merce();
      String risp="n";
      System.out.println("Inserisci i dati dei prodotti e poi conbferma con s se vuoi continuare n altrimenti\n");
      do
      {
         m.scrivi();
          System.out.println("\n Altri prodotti s/n ?");
          risp=sc.nextLine();
          if (risp.equals("s"))
              System.out.println("\n Continuo:");
          
      }
      while (risp.equals("s"));
      System.out.println("\n Ora stampo l'elenco dei prodotti \n");
      m.leggi();
  }
}
