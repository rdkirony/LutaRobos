
package arena;

import controle.GeradorPosicaoItens;
import java.util.ArrayList;



public abstract class Arena {
    private int comprimento;
   
    private int altura;
    
    private GeradorPosicaoItens gerador = new GeradorPosicaoItens();
    
    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }


    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Arena(int comprimento, int altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }
    public static int[][] gerarArena(Arena arena){
        int x = arena.getAltura();
        int y = arena.getComprimento();
        int campo[][] = new int[x][y];
        return campo;
        
    }
     public static int[][] excessaoLimiteArena(Arena arena,int altura, int comprimento){
       int campo[][] = Arena.gerarArena(arena);
       for(int i=0;i<altura;i++){
           for(int j=0;j<comprimento;j++){
              campo[i][j] = 0;
                if(j == 0 || i == 0 || j == comprimento-1 || i == altura -1)
                    campo[i][j] = 4;
                   GeradorPosicaoItens.GeradorItens(campo, altura,comprimento);

            }
        }
        return campo;
   }
    public static int[][] Test(Arena arena,int altura, int comprimento){
       int campo[][]=Arena.gerarArena(arena);
       for(int i=0;i<altura;i++){
           for(int j=0;j<comprimento;j++){
                   campo[i][j] = j;  
            }
        }
        return campo;
    }
   public static ArrayList<String> convertArena(int camp[][],int altura, int comprimento){
    ArrayList<String> campo = new ArrayList();
    String area = "■";
    for(int i=0;i<altura;i++){
        for(int j=0;j<comprimento;j++){
            campo.add(Integer.toString(camp[i][j]));

                //campo.add(area);
            
                
                
        }
         
                
        campo.add ("\n");
    }
    return campo;
   }


   
   


    
}
