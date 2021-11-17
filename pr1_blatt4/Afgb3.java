package pr1_blatt4;

public class Afgb3 {
  public static String code(String plaintext, int key){
    String ciphertext = "";
    plaintext = plaintext.toLowerCase();
    for(int i=0; i<plaintext.length(); i++){
      char next = plaintext.charAt(i);
      ciphertext += shift(next, key);
    }
    return ciphertext;
  }

  public static char shift(char letter, int shift){
    if('a'<=letter && letter <='z'){
      letter += shift;
      while(letter > 'z'){
        letter -= 26;
      }
    }
    return letter;
  }

  public static String decode(String ciphertext, int key){
    String decoded = "";
    ciphertext = ciphertext.toLowerCase();
    for(int i=0; i<ciphertext.length(); i++){
      char next = ciphertext.charAt(i);
      decoded += shift(next, 26-key);
    }
    return decoded;
  }
  public static void main(String[] args) {
    String plaintext = "Uheen qre Pbqr shaxgvbavreg";
    int key = 13;

    String ciphertext = code(plaintext, key);
    System.out.println("Klartext: " + plaintext + " --> " + ciphertext);

    String decoded = decode(ciphertext, key);
    System.out.println("Geheimtext: " + ciphertext + " --> " + decoded);
  }
}
