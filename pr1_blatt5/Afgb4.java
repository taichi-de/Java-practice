package pr1_blatt5;

public class Afgb4 {
  public static boolean isPrime(int num) {
    if(num<2){
      return false;
    }else{
      for(int i=2; i<num; ++i){
        if(num%i == 0){
          return false;
        }
      }
    }
    return true;
  }

  public static boolean isPrimeImproved(int num){
    int sqrt = (int) Math.sqrt(num);
    if(num<2 || num % 2 == 0 && num != 2){
      return false;
    }else{
      for(int i=3; i<sqrt; i+=2){
        if(num%i == 0){
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int num = 9991;

    long t1 = System.nanoTime();
    long td1 = (System.nanoTime()-t1);

    long t2 = System.nanoTime();
    long td2 = (System.nanoTime()-t2);

    System.out.println();

		if(isPrime(num))
      System.out.println(num+" is prime number!");
    else
      System.out.println(num+" is not prime number..");
    System.out.println("time in nanoseconds(isPrime) = "+td1);

    System.out.println();

    if(isPrimeImproved(num))
      System.out.println(num+" is prime number!");
    else
      System.out.println(num+" is not prime number..");
    System.out.println("time in nanoseconds(isPrimeImproved) = "+td2);
	}
}
