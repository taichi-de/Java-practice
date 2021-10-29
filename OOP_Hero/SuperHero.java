package OOP_Hero;

public class SuperHero extends Hero{
  boolean flying;
  public void fly(){
    this.flying = true;
    System.out.println("飛び上がった！");
  }
  public void land(){
    this.flying = false;
    System.out.println("着地した！");
  }
  public void attack(Monster m){
    super.attack(m); // 親メソッドの呼び出し
    if(this.flying){
      super.attack(m);
    }
  }
}

