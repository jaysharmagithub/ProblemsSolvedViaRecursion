import java.util.*;

public class NumDigitsSum{
  
  public static int digitsSum(int num,int sum) {
    int n = String.valueOf(num).length();
    if( n==1 ) return num+sum;
    int digitsLeft = num/10;
    int lastDigit = num%10;
    return digitsSum(digitsLeft,sum+=lastDigit);
  
  }
  public static void main(String[] args){
    int num=15; int sum=0;
    System.out.println(digitsSum(num,sum));
  }
}
