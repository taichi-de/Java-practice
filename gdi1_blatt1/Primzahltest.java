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
       boolean isprim = true;

    if(prim == 1) {
      System.out.println(prim + " ist per Definition keine Primzahl.");
      isprim = false;
   }

   for(int i = 2; i <= Math.sqrt(prim); i++) {
        if(prim % i != 0) {
            isprim = true;
       }else if(prim % i == 0) {
           System.out.println(prim + " ist keine Primzahl");
           isprim = false;
           break;
       }else {
           System.out.println("Fehler!");
           break;
     }
 }

  if(isprim == true) {
      System.out.println(prim + " ist eine Primzahl!");
     }
  }
}
