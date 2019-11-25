
package controle;
import java.util.Random;

/**
 *
 * @author gabriel
 */
//extends classe que vai puxar os dados gerados pelo arquivo
public class IA {
    

    private int arena[][][];
    public IA() throws Exception{}

    public void turnos(int arena [][][], int xa, int ya, int za,int xi, int yi, int zi,int dimensao, int distanciaEfetiva) throws Exception{

    }
    public void iniciarJogo(int arena [][][]) throws Exception{
        gerarP1P2(arena);
    }
    private void direcao(){
    
    }
    public void gerarP1P2(int arena[][][]) throws Exception{
        arena[2][0][0] = 1;
        arena[2][3][3] = 2;
        
    }
    
    public  void andarAleatorio(int arena[][][],int x, int y, int z, int dimensao) throws Exception{
       int a;
       Random gerar = new Random();
       a = gerar.nextInt(4) ;
       if(a == 0)
           andarFrente(arena,x,y,z,dimensao);
       else if(a == 1)
           andarTras(arena,x,y,z,dimensao);
       else if(a == 2)
           andarCima(arena,x,y,z,dimensao); 
       else if(a == 3)
           andarBaixo(arena,x,y,z,dimensao); 
       
       }

        

    private void andarFrente(int arena[][][], int x, int y, int z, int dimensao) throws Exception{
        if((z >=0 || z <3)){
                arena[x][y][z+1] = arena[x][y][z];
            if(x==0 || x == dimensao-1){
                arena[x][y][z] = 3;  
            }
            else if((z==0 && y==0)||(z==dimensao-1 && y==dimensao-1))
                arena[x][y][z] = 4;
            else 
                arena[x][y][z] = 0;
        }  

    }
    

    private void andarTras(int arena[][][],int x, int y, int z, int dimensao){
        if((z >0 || z <3) && ((arena[x+1][y][z] != 4 
                && arena[x-1][y][z] !=4 )|| (arena[x-1][y][z] !=4 && arena[x][y][z+1] !=4) || (arena[x+1][y][z] !=4 && arena[x][y][z+1] !=4)
                || (z>0 && ((arena[x][y][z-1] !=3 && arena[x-1][y][z] !=4) || (arena[x][y][z-1] !=4 && arena[x+1][y][z] !=4))))){
            arena[x][y][z-1] = arena[x][y][z];
            if(x==0 || x == dimensao-1){
                arena[x][y][z] = 3;  
            }
            else if((z==0 && y==0)||(z==dimensao-1 && y==dimensao-1))
                arena[x][y][z] = 4;
            else 
                arena[x][y][z] = 0;
        }


    }
    public void andarCima(int arena[][][],int x, int y, int z,  int dimensao){
        if((x >=0 || x <3)){
            arena[x-1][y][z] = arena[x][y][z];
            if(x==0 || x == dimensao-1){
                arena[x][y][z] = 3;  
            }
            else if((z==0 && y==0)||(z==dimensao-1 && y==dimensao-1))
                arena[x][y][z] = 4;
            else 
                arena[x][y][z] = 0;
        }  

    }
    public void andarBaixo(int arena[][][], int x, int y, int z, int dimensao){
        if((x >=0 || x <3)){
            arena[x+1][y][z] = arena[x][y][z];
            if(x==0 || x == dimensao-1){
                arena[x][y][z] = 3;  
            }
            else if((z==0 && y==0)||(z==dimensao-1 && y==dimensao-1))
                arena[x][y][z] = 4;
            else 
                arena[x][y][z] = 0;
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