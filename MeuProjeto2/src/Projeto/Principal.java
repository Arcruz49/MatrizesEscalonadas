package Projeto;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        try{
            System.out.print("Digite a ordem da Matriz: ");
            int n = teclado.nextInt();
            Matriz mat = new Matriz(n,n);

            mat.MakeMatriz();
            System.out.println(mat.ToString());
            
            mat = Escalonamento.MatrizEscalonada(mat);

            System.out.println(mat.ToString());

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        teclado.close();
    }
}