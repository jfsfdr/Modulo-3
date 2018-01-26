package maior3;
import java.util.Scanner;
public class Maior3 {
    //Funçao maior de 3
    static int MaiorDe3 (int X,int Y,int Z)
    {if (X < Y)
       X=Y;
    if (X<Z)
       X=Z;
    return X ; }
    //Funçao menor de 3
        static int MenorDe3 (int X,int Y,int Z)
    {if (X > Y)
       X=Y;
    if (X>Z)
       X=Z;
    return X ; }
    
    
    
    
            

    public static void main(String[] args)throws Exception  {
int X,Y,Z,A,B,C,D,E,F;
Scanner LerS = new Scanner (System.in);

System.out.print ("Digite o priemiro valor (X) ");
X = LerS.nextInt();
 System.out.print ("Digite o segundo numero (Y) ");
Y=LerS.nextInt();
System.out.print("Digite o terceiro numero (Z)");
Z=LerS.nextInt ();
System.out.println( "maior = " +MaiorDe3 (X,Y,Z));
System.out.println( "maior = " +MaiorDe3 (X,Y,Z));

System.out.print ("Digite o primeiro valor (A) ");
A = LerS.nextInt();
 System.out.print ("Digite o segundo numero (B) ");
B=LerS.nextInt();
System.out.print("Digite o terceiro numero (C)");
C=LerS.nextInt (); 
System.out.println( "maior = " +MaiorDe3 (A,B,C));

System.out.print ("Digite o primeiro valor (A) ");
D = LerS.nextInt();
 System.out.print ("Digite o segundo numero (B) ");
E=LerS.nextInt();
System.out.print("Digite o terceiro numero (C)");
F=LerS.nextInt (); 
System.out.println( "menor = " +MenorDe3 (D,E,F));


    }

}
