package pr1_blatt2;

import java.io.*;

public class Checksum2 {
  public static int quersumme (String numberstring) {
    int sum = 0;
    for (int i = 0; i < numberstring.length(); i++)
      sum += Integer.parseInt(numberstring.substring(i ,i+1));
    return sum;
  }
  public static void main(String[] args) throws IOException{
    try {
      System.out.print("Bitte geben Sie eine Zahl ein: ") ;
      // int number = System.in.read();
      System.out.println("Sie haben folgenden Integer eingegeben: ");
      // System.out.println("Sie haben folgenden Integer eingegeben: " + number);
      BufferedReader in = new BufferedReader(new InputStreamReader( System.in))  ;
      String numberstring = in.readLine();
      in.close() ;
      System.out.print("Quersumme: ");

      int i = 0;
      do{
        System.out.print(numberstring.substring(i,i+1)) ;
        if (i == numberstring.length()-1) {
          System.out.print(" = ") ;
          System.out.println(quersumme(numberstring)) ;
        }
        else System.out.print(" + ") ;
        i++;
      }while(i < numberstring.length());

    } catch ( IOException e ) {
      System.err.println(e.toString()) ;
    }
  }
}

