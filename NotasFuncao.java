package notasfuncao;
import java.util.Scanner;
public class NotasFuncao {
    static Scanner dados=new Scanner(System.in);       
    static int LerEscreverNota (int nota)
 
            {        System.out.print("Qual é a nota do aluno ");
            nota=dados.nextInt ();
    return nota;}
    
    
    
    
   public static void main(String[] args) {
        int nota=0 ;
        int [] armario = new int [26];
        for (int m=1 ; m<27 ; m++)
        armario [m] = LerEscreverNota (nota);
        for(int m=1 ; m<26 ; m++)
       System.out.println("A nota final do aluno " + m + " é " +armario [m]);

}
}
