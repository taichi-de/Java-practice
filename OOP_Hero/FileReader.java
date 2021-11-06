package OOP_Hero;

import java.io.*;

public class FileReader {
  public FileReader(String string) {
  }

  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("data.txt");
    int input = fr.read();
    while(input != -1){
      System.out.println((char)input);
      input = fr.read();
    }
    fr.close();

    FileWriter fw = new FileWriter("data.txt");
    fw.write('H');
    fw.close();
  }

  private void close() {
  }

  private int read() {
    return 0;
  }
}
