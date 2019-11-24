package controle;

import java.util.ArrayList;
import entidade.Armas;
import entidade.Bomba;
import entidade.Robo;
import entidade.Virus;
import arena.Arena;

public class ConfiguracaoInicial {
    
    private String file;
    ArrayList<Robo> robos = new ArrayList();
    ArrayList<Armas> armas = new ArrayList();
    Bomba bomba;
    Virus virus;
    Arena arena;
    
    public ConfiguracaoInicial() throws Exception{
        this.file = "ini.txt";
        getInicialConfig();
    }
    
    private void getInicialConfig() throws Exception{
        Arquivo objFile;
        objFile = new Arquivo(file);
        ArrayList<String> arr;
        arr = objFile.lerTudo();
        int aux,j=0;
        arena = new Arena(Integer.parseInt(arr.get(j)),Integer.parseInt(arr.get(j+1)),Integer.parseInt(arr.get(j+2)));
        aux = Integer.parseInt(arr.get(j+3));
        j=4;
        for(int i=0; i<aux; i++){
            armas.add(new Armas(arr.get(j),arr.get(j+1),Integer.parseInt(arr.get(j+2)),Integer.parseInt(arr.get(j+3))));
            j = j+4;
        }
        aux = Integer.parseInt(arr.get(j));
        j++;
        for(int i=0; i<aux; i++){
            robos.add(new Robo(arr.get(j),arr.get(j+1),Integer.parseInt(arr.get(j+2)),Double.parseDouble (arr.get(j+3)),Integer.parseInt(arr.get(j+4)),Double.parseDouble (arr.get(j+5))));
            j = j+6;
        }
        bomba = new Bomba(arr.get(j),Integer.parseInt(arr.get(j+1)),Integer.parseInt(arr.get(j+2)));
        j = j+3;
        virus = new Virus(arr.get(j),Integer.parseInt(arr.get(j+1)),Integer.parseInt(arr.get(j+2)));
    }
    
}
