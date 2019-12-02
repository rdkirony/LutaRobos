
package batalha;
import arena.Arena;
import controle.ConfiguracaoInicial;
import java.util.ArrayList;
import java.util.Iterator;

public class Batalha {
    static int camp[][];
    static ArrayList<String> campo = new ArrayList();
    public static void dados(ConfiguracaoInicial conf){
        camp = Arena.excessaoLimiteArena(conf.getArena(),conf.getArena().getAltura(),conf.getArena().getComprimento());
        campo = Arena.convertArena(camp, conf.getArena().getAltura(), conf.getArena().getComprimento());
    
    }
    public static void main(String[] args) throws Exception{
        ConfiguracaoInicial  conf = new ConfiguracaoInicial();
        
        dados(conf);
        
        
       
        
      

       
        int i=0;
        Iterator<String> iterator = campo.iterator();
        while(iterator.hasNext()){
            System.out.printf("%s",iterator.next());
            i++;
        }
        /*for(int i=0;i<altura;i++){
           for(int j=0;j<comprimento;j++){
                   System.out.print(camp[i][j]);

              
            }
             System.out.print("\n");
        }*/
        
    }
}
