
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
    
    public  void andarAleatorio(int x, int y, int z, int arena[][][],int dimensao, int numeroPlayer){
        int a;
        Random gerar = new Random();
        a = gerar.nextInt(4);
        switch (a) {
            case 0:
                andarFrente(x,y,z,arena, numeroPlayer);
                break;
            case 1:
                andarTras(x,y,z,arena,numeroPlayer);
                break;
            case 2:
                andarCima(x,y,z,arena,numeroPlayer);
                break;
            default:
                andarBaixo(x,y,z,arena,numeroPlayer);
                break;
        }
        
    }
    public void andarFrente(int xi, int yi, int zi, int arena[][][], int numeroPlayer){
        if(zi <= 3 || zi >=3){
            arena[xi][yi][zi+1] = numeroPlayer;
            arena[xi][yi][zi-1] = arena[xi][yi][zi];
        }
        else if(yi <=3 || yi >=3)
            arena[xi][yi+1][zi] = 1;
            arena[xi][yi-1][zi] = arena[xi][yi][zi];
    }
    public void andarTras(int xi, int yi, int zi, int arena[][][],int numeroPlayer){
        if(zi <= 3 || zi >=3){
            arena[xi][yi][zi-1] = numeroPlayer;
            arena[xi][yi][zi+1] = arena[xi][yi][zi];
        }
        else if(yi <=3 || yi >=3){
            arena[xi][yi-1][zi] = 1;
            arena[xi][yi+1][zi] = arena[xi][yi][zi];
        }
    }
    public void andarCima(int xi, int yi, int zi, int arena[][][], int numeroPlayer){
        if(xi <=3 || xi >=3){
            arena[xi+1][yi][zi] = numeroPlayer;
            arena[xi-1][yi][zi] = arena[xi][yi][zi];
        }
    }
    public void andarBaixo(int xi, int yi, int zi, int arena[][][], int numeroPlayer){
        if(xi <=3 || xi >=3){
            arena[xi-1][yi][zi] = numeroPlayer;
            arena[xi+1][yi][zi] = arena[xi][yi][zi];
        }
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