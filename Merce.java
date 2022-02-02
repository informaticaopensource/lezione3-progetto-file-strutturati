import java.util.*;
import java.lang.*;
import java.io.*;
public class Merce 
{
    public Merce()
    {
    }
    public void scrivi()
    {
        InputStreamReader S_input =new InputStreamReader(System.in);
        BufferedReader linea = new BufferedReader(S_input);
        String tmp="",tmp1="";
        float pr=0;
        int q=0;
        boolean ok=false;
        try {FileOutputStream f = new FileOutputStream("elenco.dat",true);
            ObjectOutputStream fout = new ObjectOutputStream(f);
            do {
        try 
        {   
            System.out.println("Inserimento Prodotto:");
            System.out.println("\nCodice Prodotto max 6 caratteri");
            tmp=linea.readLine();
            System.out.println("\nInserisci Desscrizione:");
            tmp1=linea.readLine();
            System.out.println("\nInserisci il prezzo");
            pr=Float.parseFloat(linea.readLine());
            System.out.println("\nInserisci la quantità:");
            q=Integer.parseInt(linea.readLine());
             Prodotto p =new Prodotto(tmp, tmp1, pr, q);
             fout.writeObject(p);
             fout.flush();
            ok=true;
            fout.close();

        }
        catch (Exception e)
        {
            System.out.println("\nErrore nell'input !");
            ok=false;
        }
        if (!ok  )
            System.out.println("\nErrore nell'inserimento dati ! riprova");
        } while (!ok);
        System.out.println("\n Prodotti inserito all'archivio ");
        }
        catch (IOException e)
        {
            System.out.println("Errore nell'apertura del file !");
        }
        
    }
    public void leggi()
    {     Prodotto p;  
        ObjectInputStream fin=null;
    try {
       FileInputStream f = new FileInputStream("elenco.dat");
         
    
       while (f.available()>0)
       {   
         fin = new ObjectInputStream(f);   
           p=(Prodotto)fin.readObject();
            System.out.println(p.toString());
        }}
         catch (ClassNotFoundException erroreclasse)
           { System.out.println("Errore nella classe !");}
           catch (EOFException finefile)
           { System.out.println("Fine Lettura ");
               try { 
               fin.close();
               return;
            }
           catch (IOException errore) 
               {
                   System.out.println("Errore nella chiusura file !");
               }
           }  
            catch (IOException e) 
            {   e.printStackTrace();
                System.out.println("Errore nell'apertura del file !");}
}   
}
    
