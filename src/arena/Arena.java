
package arena;

import java.util.ArrayList;


public class Arena {
    private int comprimento;
    private int largura;
    private int altura;

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Arena(int comprimento, int largura, int altura) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
    }
    public static int[][][] gerarArena(Arena arena){
        int x = arena.getAltura();
        int y = arena.getComprimento();
        int z = arena.getLargura();
        int campo[][][] = new int[x][y][z];
        return campo;
        
    }
    public static int[][][] ExcessaoLimiteArena(Arena arena,int dimensao){
       int campo[][][] =Arena.gerarArena(arena);
       for(int i=0;i<dimensao;i++){
           for(int j=0;j<dimensao;j++){
               for(int z=0;z<dimensao;z++){
                   campo[i][j][z] = 0;
                   if(i==0 || (z==0 && j==0)||(z==dimensao-1 && j==dimensao-1)||i == dimensao-1){
                      campo[i][j][z] = 1;  
                   }
                }  
            }
        }
        return campo;
   }
   public static ArrayList<String> convertArena(int camp[][][],int dimensao){
    ArrayList<String> campo = new ArrayList();
    for(int i=0;i<dimensao;i++){
        for(int j=0;j<dimensao;j++){
            for(int z=0;z<dimensao;z++){
                campo.add (Integer.toString(camp[i][j][z]));
            }             
        }
        campo.add ("\n");
           
        }
    return campo;
   }
   


    
}
