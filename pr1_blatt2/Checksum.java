package pr1_blatt2;

import java.io.* ;

public class Checksum {
  public static int quersumme ( String numberstring ) {
    int sum = 0 ;
    for ( int i = 0 ; i < numberstring.length( ) ; i++ )
      sum += Integer.parseInt( numberstring.substring( i , i + 1 ) ) ;
    return sum ;
  }

  public static void main ( String[ ] args ) {
    System.out.print( "Bitte geben Sie eine Zahl ein:" ) ;
    System.out.print( "Sie haben folgenden Integer eingegeben: ") ;
    try {
      BufferedReader in = new BufferedReader( new InputStreamReader ( System.in ) )  ;
      String numberstring = in.readLine( ) ;
      in.close( ) ;
      System.out.print( "Quersumme: " ) ;
      for ( int i = 0 ; i < numberstring.length( ) ; i++ ) {
        System.out.print ( numberstring.substring( i , i + 1 ) ) ;
        if ( i == numberstring.length( ) - 1 ) {
          System.out.print( " = " ) ;
          System.out.println( quersumme( numberstring ) ) ;
        }
        else System.out.print( " + " ) ;
      }
    } catch ( IOException e ) {
    System.err.println( e.toString( ) ) ;
    }
  }
}

// int i = 1;
// do {
//   System.out.println();
//   i++;
// } while (i < 10);
