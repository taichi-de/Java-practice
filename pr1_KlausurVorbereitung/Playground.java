package pr1_KlausurVorbereitung;

import java.util.Scanner;

public class Playground {

    private static int getPrice(){
        System.out.println("Give a price in euro: ");
        return (new Scanner(System.in).nextInt());
    }

    public static void main(String[] args){
        // 1:
        // Scanner s = new Scanner(System.in);
        // int input = s.nextInt();
        // s.close();
        // System.out.println("You wrote: " + input);

        //2:
        // int euro = getPrice();
        // System.out.println("Your price is: " + euro * 1.19 + "€");

        //3:
        // int[] orig = {12, 24, 35, 64, 42};
        // for(int f = 0, l = orig.length-1; f < l; f++, l--){
        //     int temp = orig[f];
        //     orig[f] = orig[l];
        //     orig[l] = temp;
        // }

        //4:
        // Lottofee1 Lf1 = new Lottofee1();
    }
}
