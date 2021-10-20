package gdi1_blatt1;

import java.util.Scanner;

public class Primzahltest {

 public static void main(String[] args) {
        Prim p = new Prim();
        p.testePrim();
    }
}

class Prim{
    int prim;
  public void testePrim(){

    Scanner s = new Scanner(System.in);
    System.out.println("Geben Sie eine Zahl ein: ");
    prim = s.nextInt();
    boolean isPrim = true;

    if(prim == 1) {
      System.out.println(prim + " ist per Definition keine Primzahl.");
      isPrim = false;
   }

   for(int i = 2; i <= Math.sqrt(prim); i++) { //sqrt: squarer root
        if(prim % i != 0) {
            isPrim = true;
       }else if(prim % i == 0) {
           System.out.println(prim + " ist keine Primzahl");
           isPrim = false;
           break;
       }else {
           System.out.println("Fehler!");
           break;
     }
 }

  if(isPrim == true) {
      System.out.println(prim + " ist eine Primzahl!");
     }
  }
}
