package controle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 * Classe responsável por Gravar e Ler arquivos texto
 * 
 * @author Carlos Elias Arminio Zampieri - carloszampieri@ufgd.edu.br
 * @version 1.0
 * @since 2019-10-01
 */
public class Arquivo
{
    private String filename;
    
    /**
     * 
     * Construtor da classe Arquivo
     * 
     * @param filename do tipo String.
     */
    public Arquivo(String filename)
    {
        this.filename = filename;
    }
    
    /**
     * @deprecated Este será substituido pelo método X
     * @param txt 
     */
    public void escrever(String txt)
    {
        PrintWriter pw = null;
        
        try
        {
            pw = new PrintWriter(new FileWriter(this.filename,true));
        }
        catch (FileNotFoundException f)
        {
            try {
                pw = new PrintWriter("temp.txt");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        } catch (IOException ex) {
            Logger.getLogger(Arquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        pw.println(txt);
        pw.close();
    }
    
    /**
     * 
     * Retorna a primeira linha do arquivo texto.
     * @exception Exception
     * @see IOException
     * @return String com o texto lido.
     */
    public String ler() throws Exception
    {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader(this.filename));
                    //.useDelimiter("\\||\n");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        //String txt = sc.next();
        String txt = sc.nextLine();
        return txt;
    }
    
    public ArrayList<String> lerTudo()
    {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileReader(this.filename));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        ArrayList<String> lista = new ArrayList<>();
        while (sc.hasNextLine())
        {
            lista.add(sc.nextLine());
        }
        
        return lista;
    }
}
