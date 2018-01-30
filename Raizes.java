package raizes;
import java.util.Scanner;
public class Raizes {
//Funçao Geral
static void Raiz (int Linf , int Lsup)
{
    //Scanner
    Scanner dados=new Scanner(System.in);
    //Introduçao valores
    System.out.print("Qual é o limite Superior ? ");
    Lsup=dados.nextInt();
    System.out.print("Qual é o limite Inferior ?");
    Linf=dados.nextInt();
    //Funçao Tecnica
    for(int I=Linf ; I<Lsup ; I++)
        System.out.print(String.format("%5.1f",Math.sqrt(I)));
}
    public static void main(String[] args) {
    //Chamar a Funçao
        {
        Raiz(0,0);
        }
    }
    
}
