
package batalha;
import arena.Arena;
import java.util.ArrayList;
import java.util.Iterator;

public class Batalha {
   
    public static void main(String[] args){
        int dimensao = 4;
        ArrayList<String> campo = new ArrayList();
        Arena arena = new Arena(dimensao,dimensao,dimensao);
        int camp[][][];
        camp = arena.ExcessaoLimiteArena(arena,dimensao);
        /*campo = arena.convertArena(camp,dimensao);
        int i=0;
        Iterator<String> iterator = campo.iterator();
        while(iterator.hasNext()){
            System.out.printf("%s",iterator.next());
            i++;
        }*/
               for(int i=0;i<dimensao;i++){
           for(int j=0;j<dimensao;j++){
               for(int z=0;z<dimensao;z++){
                   System.out.print(camp[i][j][z]);
                  
                }  
              
            }
             System.out.print("\n");
        }
        
    }
}
