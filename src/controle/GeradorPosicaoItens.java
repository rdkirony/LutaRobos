package controle;

import java.util.Random;

/**
 *
 * @author Matheus
 */
public class GeradorPosicaoItens {
    private static Random random = new Random();

    public GeradorPosicaoItens() {
    }
    
    

    public static void GeradorItens(int camp [][][], int dimensao) {
        for(int i = 0; i < dimensao; i++) {
            for(int j = 0; j < dimensao; j++) {
                for(int w = 0; w < dimensao; w++) {
                    camp[i][j][w] = gerarAleatorio(camp, i, j, w);
                }
            }
        }
    }
    
    public static int gerarAleatorio(int camp[][][], int i, int j, int w) {
        switch(random.nextInt(640)) {
            case 4://Bombas
                return 7;//identificador da bomba
            case 25://Virus
                return 8;//identificador do virus
            case 44://Armas
                return 9;//identificador da Arma
            default:
                return camp[i][j][w];
        }
    }
    
    
}
