package Projeto;
import java.util.Scanner;
import Projeto.Escalonamento;

public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        Escalonamento esc = new Escalonamento();
        try{
            System.out.print("Digite a ordem da Matriz: ");
            int n = teclado.nextInt();
            Matriz mat = new Matriz(n,n);


            mat.MakeMatriz();
            System.out.println(mat.ToString());
            System.out.println(esc.PivoIs1(mat, 0, 0));

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        teclado.close();
    }
}