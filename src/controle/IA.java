
package controle;
import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author gabriel
 */
//extends classe que vai puxar os dados gerados pelo arquivo
public class IA {
    

    public IA() throws Exception{}

    public void turnos(int arena [][], int xa, int ya,int xi, int yi,int altura, int comprimento, int distanciaEfetiva) throws Exception{

    }
    public void iniciarJogo(int arena [][]) throws Exception{
        gerarP1P2(arena);
    }
    private void direcao(){
    
    }
    public void gerarP1P2(int arena[][]) throws Exception{
        arena[2][0] = 1;
        arena[2][3] = 2;
        
    }
    
    public  void andarAleatorio(int arena[][],int x, int y,int altura, int comprimento) throws Exception{
       int a = 0;
       Random gerar = new Random();
       a = gerar.nextInt(4) ;
       andarFrente(arena,x,y,altura,comprimento); 
  
  
 
    }
    public int atualizarFrente(int y){
        return y+1;
    }
    public int atualizarTras(int y){
        return y-1;
    }
    public int atualizarCima(int x){
        return x-1;
    }  
    public int atualizarBaixo(int x){
        return x+1;
    }

    private void andarFrente(int arena[][], int x, int y,int altura, int comprimento) throws Exception{
        if(y >=0 && y<comprimento-1){
            //TimeUnit.SECONDS.sleep(1);
            arena[x][y+1] = arena[x][y];
                if(x == comprimento -1 || y == comprimento - 1 || x == 0 || y == 0){
                    arena[x][y] = 4;
                }
                else{
                    arena[x][y] = 0;
                }

        }
        
    }

    
    private void andarTras(int arena[][],int x, int y,int altura, int comprimento) throws InterruptedException{

        if(y >=0 && y != 0){
            arena[x][y-1] = arena[x][y];
                if(x == comprimento -1 || y == comprimento - 1 || x == 0 || y == 0)
                    arena[x][y] = 4;
                else 
                    arena[x][y] = 0;
        }


    }
    public void andarCima(int arena[][],int x,int y,int altura, int comprimento){
        if(y >=0 && y <=altura){
            arena[x-1][y] = arena[x][y];
            if(x == altura -1 || y == altura - 1 || x == 0 || y == 0)
                    arena[x][y] = 4;
                else 
                    arena[x][y] = 0;
        }
          
            
    }
    public void andarBaixo(int arena[][], int x, int y,int altura, int comprimento){
        if(y >=0 && y <=altura){
            arena[x+1][y] = arena[x][y];
            if(x == altura -1 || y == altura - 1 || x == 0 || y == 0)
                    arena[x][y] = 4;
                else 
                    arena[x][y] = 0;
        }
          
    }
        
    private float porcentagemTiro(int xa,int ya,int xi, int yi,int dimensao, int distanciaEfetiva) {
        float porcentagem = 0;
        if(verificarDistancia(xa,ya,xi,yi,dimensao) <= distanciaEfetiva){
            porcentagem = (float) 0.9;
        }
        else 
           porcentagem = (float) 0.1;
        return porcentagem;
         
    }
    private int verificarDistancia(int xa,int ya,int xi, int yi, int dimensao){
        int cont = 0;
        int posicaoInimigo[][][] = null;
        int posicaoAtual[][][] = null;
        if(mesmaLinha(xa,ya,xi,yi,dimensao)){
            for(int i=0;i<dimensao;i++){
                for(int j=0;j<dimensao;j++){
                    if(posicaoAtual[xa][j] != posicaoInimigo[xi][yi])
                        cont++;               
                }           
            }
        }
        return cont;
        
    }
    
    private boolean mesmaLinha(int xa,int ya,int xi, int yi,int dimensao){
        int posicaoInimigo[][]= null;
        int posicaoAtual[][] = null;
        
        for(int i=0;i<dimensao;i++){
            for(int j=0;j<dimensao;j++){
                for(int z=0;z<dimensao;z++){
                    if(posicaoAtual[xa][j] == posicaoInimigo[xi][yi])
                        return true;
                    else if(posicaoAtual[i][ya] == posicaoInimigo[xi][yi])
                        return true;
                }                
            }           
        }
        return false;
    }

 
}