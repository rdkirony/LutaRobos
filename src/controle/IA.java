
package controle;
import arena.Arena;
import entidade.*;
import java.util.Random;
/**
 *
 * @author gabriel
 */
//extends classe que vai puxar os dados gerados pelo arquivo
public class IA {
    public IA(){}
    public void gerarP1P2(int arena[][][]){
        arena[2][0][0] = 1;
        arena[2][3][3] = 2;

    }
    
    public  void andarAleatorio(int x, int y, int z){
        int a;
        Random gerar = new Random();
        a = gerar.nextInt(4);
        if(a == 0 ){
            andarFrente(x,y,z);
        }
        else if(a == 1){
            andarTras(x,y,z);
        }
        else if(a == 2){
            andarCima(x,y,z);
        }
        else
            andarBaixo(x,y,z);
        
    }
    public void andarFrente(int x, int y, int z){
        
    }
    public void andarTras(int x, int y, int z){
        
    }
    public void andarCima(int x, int y, int z){
        
    }
    public void andarBaixo(int x, int y, int z){
        
    }
        
    private float porcentagemTiro(int xa,int ya,int xi, int yi, int zi,int dimensao, int distanciaEfetiva) {
        float porcentagem = 0;
        if(verificarDistancia(xa,ya,xi,yi,zi,dimensao) <= distanciaEfetiva){
            porcentagem = (float) 0.9;
        }
        else 
           porcentagem = (float) 0.1;
        return porcentagem;
         
    }
    private int verificarDistancia(int xa,int ya,int xi, int yi, int zi,int dimensao){
        int cont = 0;
        int posicaoInimigo[][][] = null;
        int posicaoAtual[][][] = null;
        if(mesmaLinha(xa,ya,xi,yi,zi,dimensao)){
            for(int i=0;i<dimensao;i++){
                for(int j=0;j<dimensao;j++){
                    for(int z=0;z<dimensao;z++){
                        if(posicaoAtual[xa][j][z] != posicaoInimigo[xi][yi][zi])
                            cont++;
                    }                
                }           
            }
        }
        return cont;
        
    }
    
    private boolean mesmaLinha(int xa,int ya,int xi, int yi, int zi,int dimensao){
        int posicaoInimigo[][][] = null;
        int posicaoAtual[][][] = null;
        
        for(int i=0;i<dimensao;i++){
            for(int j=0;j<dimensao;j++){
                for(int z=0;z<dimensao;z++){
                    if(posicaoAtual[xa][j][z] == posicaoInimigo[xi][yi][zi])
                        return true;
                    else if(posicaoAtual[i][ya][z] == posicaoInimigo[xi][yi][zi])
                        return true;
                }                
            }           
        }
        return false;
    }
}