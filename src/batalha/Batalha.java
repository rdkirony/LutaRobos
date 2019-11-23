
package batalha;
import arena.Arena;
import java.util.ArrayList;
import java.util.Iterator;

public class Batalha {
   
    public static void main(String[] args){
        int dimensao = 7;
        ArrayList<String> campo = new ArrayList();
        Arena arena = new Arena(dimensao,dimensao,dimensao);
        int camp[][][];
        camp = arena.ExcessaoLimiteArena(arena,dimensao);
        campo = arena.convertArena(camp,dimensao);
        int i=0;
        Iterator<String> iterator = campo.iterator();
        while(iterator.hasNext()){
            System.out.printf("%s",iterator.next());
            i++;
        }
    }
}
