package Projeto;

public class Escalonamento {

    public static Matriz MatrizEscalonada(Matriz mat){
        for(int i = 0; i < mat.nLinhas; i ++){
            if(!PivoIs1(mat,i,i)){
                for(int j = 0; j < mat.nColunas; j++){
                    mat.matriz[i][j] = mat.matriz[i][j] / mat.matriz[i][i];
                }
            }
        }
        return mat;
    }
    //verifica se o pivo é igual a 1
    public static boolean PivoIs1(Matriz mat, int i, int j){
        return mat.matriz[i][j] == 1;
    }
}
