import java.util.*;

public class PrimeNumber{
  
  public static boolean isPrime(int num,int divisor){
    if(num<2) return false;
    if(divisor * divisor > num) return true;//As a prime number can not be written as a factor of two numbers or if it is true that divisor is greater than half of the number as the divisor wouldn't divide the number evenly
    if(num % divisor == 0 ) return false;
    return isPrime(num,divisor+1);
  }
  public static void main(String [] args) {
    if(isPrime(11,2)) System.out.println("It's a prime number");
    else System.out.println("It's not a prime number");
  }
}
