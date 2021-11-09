package OOP_Hero;

public class Hero extends Character{
  private String name;
  private int hp;

  public void sleep(){
    this.hp = 100;
    System.out.println(this.name + "は、眠って回復した！");
  }
  public void sit(int sec){
    this.hp += sec;
    System.out.println(this.name + "は、" + sec + "秒座った！");
    System.out.println(this.hp + "が、" + sec + "ポイント回復した！");
  }
  public void slip(){
    this.hp -= 5;
    System.out.println(this.name + "は、転んだ！");
    System.out.println("5のダメージ！");
  }
  public void run(){
    this.hp -= 5;
    System.out.println(this.name + "逃げ出した！");
    System.out.println("Game over");
    System.out.println("最終HPは" + this.hp + "でした");
  }
  public void attack(Monster m) {
  }
  private void die(){
    System.out.println(this.name + "は死んでしまった");
    System.out.println("Game over");
  }
  public String getName(){
    return this.name;
  }
  public void setName(String name){
    if(name == null){
      throw new IllegalArgumentException("name is null");
    }
    if(name.length() >= 8){
      throw new IllegalArgumentException("Too long");
    }
    this.name = name;
  }

  public static void main(String[] args) {
    // Hero h = new Hero();
    // h.name = "Minato";
    // h.hp = 100;

    // Metango m1 = new Metango();
    // m1.hp = 50;
    // m1.suffix = 'A';

    // Metango m2 = new Metango();
    // m2.hp = 48;
    // m2.suffix = 'B';

    // h.slip();
    // m1.run();
    // m2.run();
    // h.run();
    Character[] c = new Character[5];
    c[0] = new Hero();
    c[1] = new Hero();
    // c[2] = new Thief();
    // c[3] = new Wizard();
    // c[4] = new Wizard();
    // 宿屋に泊まる
    for(Character ch: c){
      ch.hp += 50;
    }
  }
  @Override
  public void attack(Metango m) {
    // TODO Auto-generated method stub

  }

}
