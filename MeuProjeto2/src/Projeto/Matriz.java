package Projeto;
import java.util.Scanner;

public class Matriz {
    public int nLinhas;
    public int nColunas;
    public double[][] matriz;

    public Matriz(int nLinhas, int nColunas){
        this.nLinhas = nLinhas;
        this.nColunas = nColunas;
        this.matriz = new double[nLinhas][nColunas];
    }

    public void MakeMatriz(){
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < this.nLinhas; i++){
            for (int j = 0; j < this.nColunas; j ++){
                System.out.printf("\nDigite o valor da linha %d coluna %d: ",(i+1),(j+1));
                this.matriz[i][j] = teclado.nextInt();
            }
        }
        teclado.close();
    }

    public String ToString(){
        String strMatriz = "\n";
        for(int i = 0; i < this.nLinhas; i++){
            for (int j = 0; j < this.nColunas; j ++){
                strMatriz += this.matriz[i][j] + "\t"; 
            }
            strMatriz += "\n";
        }
        return strMatriz;
    }

}
