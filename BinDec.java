package bindec;
import java.util.Scanner;
public class BinDec {
  static int BinaryToDecimal(int binaryNumber){
    int decimal = 0;
    int p = 0;
    while(true){
      if(binaryNumber == 0){
        break;
      } else {
          int temp = binaryNumber%10;
          decimal += temp*Math.pow(2, p);
          binaryNumber = binaryNumber/10;
          p++;
       }
    }
    return decimal;
}
  public static void main(String args[]){
    int bin;
    Scanner dados=new Scanner(System.in);
    System.out.print("Qual é o numero que quer converter ? ");
    bin=dados.nextInt();
    System.out.println(bin + " --> "+BinaryToDecimal(bin));
  }
}

